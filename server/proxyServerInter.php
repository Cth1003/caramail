<?

class proxyServerInter extends socketServer {

	public function on_timer()
	{

		mysql_query("UPDATE chat_servers SET last_trame = NOW() WHERE id_server = " . $GLOBALS['chat_server_id']);
		mysql_query("UPDATE chat_servers SET is_connected = 0 WHERE last_trame < SUBDATE(NOW(),INTERVAL 20 SECOND)");
		
		if (time() - $GLOBALS['last_reco_mysql'] > 60 * 5)
		{

				
				
			echo "Reco SQL \n" ;
			mysql_close();
			mysql_connect(MYSQL_HOST,MYSQL_USER,MYSQL_PASS);
			mysql_select_db(MYSQL_DATABASE);
			$GLOBALS['last_reco_mysql'] = time();

		}


	}
}

class proxyServerClientInter extends socketServerClient {



	private $serverid ;

	private $last_ping ;


	public function __construct($arg)
	{
		$this->last_ping = time();

		try
		{
			parent::__construct($arg);
		}
		catch (Exception $e)
		{
			//			echo "pb socket \r\n";
			return ;
		}



	}

	public function senderror()
	{
		//		$this->close();
		$this->on_disconnect();

		echo "ERROR !" ;
	}

	public function traitetrame($code,$msgs = array())
	{


		echo "Trame : "  . $code . "\n" ; // hexdump($code ,false,true,true)  ;

		foreach ($msgs as $msg)
		{
			echo "Option : " . $msg . "\n" ; // "" hexdump($msg ,false,true,true)  ;

		}
		echo "\n" ;

		if (substr($code,0,6) == "trame_")
		{
			$code = substr($code,6);
			$id_mb = substr($code,0,strpos($code,"_")) ;
			$code = substr($code,strpos($code,"_") + 1) ;
			
			echo "TO TRAME : " . $id_mb . "//////" . $code ;
			
			if (isset($GLOBALS['tempids'][$id_mb]))
			{	
				if (is_callable(array($GLOBALS['tempids'][$id_mb],'sendtrame')))
					$GLOBALS['tempids'][$id_mb]->sendtrame($code,$msgs) ;
			}
			// trame1
			
			return true ;
			
		}
		if ($code == "667")
		{
				
				
			return true ;
		}

		if ($code == "identify")
		{

			if ($msgs[0] == $GLOBALS['code_td'])
			{
				echo "STORE1 => " . $msgs[1] . "\n" ;

				$GLOBALS['inter_server'][$msgs[1]] = &$this ;
				$this->serverid = $msgs[1] ;


				return true ;

			}

		}

		return false ;

	}
	public function on_read()
	{




		$trames = explode(chr(10),$this->read_buffer);

		if ($trames[0] != $this->read_buffer)
		{
			for ($pos = 0 ; $pos < count($trames) -1 ; $pos++)
			{

				$trame = $trames[$pos] ;


				if ( ($trame != "") )
				{

					$trame_info = explode(chr(9),$trame);


					$code = array_shift($trame_info) ;

					if (count($trame_info) >= 1)
					{
						$msgs = $trame_info ;
					}


					$r = $this->traitetrame($code,$msgs);

					if ($r === false)
					{
						$this->senderror();
						break ;
					}
					$this->read_buffer = substr($this->read_buffer , strlen($trame) + 1) ;
				}
				else
				{
					$this->senderror();
					break ;
				}

			}
		}





	}



	public function sendtrame($command,$options)
	{

		$options = implode(chr(9),$options) ;
		echo "	Send Inter " . $command . " "  . $options . "\n" ;

		$this->write($command . chr(9) . $options . chr(10));


	}
	public function on_connect()
	{
		if ($this->disconnected != true)
		{


			mysql_query("UPDATE chat_servers SET nbserver = nbserver + 1 WHERE id_server = " . $GLOBALS['chat_server_id']) ;

			echo "[httpServerClient] accepted connection from {$this->remote_address}\n";
			$this->accepted    = time();
			$this->last_action = $this->accepted;

			$this->sendtrame("identify",array("NewCaraChatInter v1.00 By Duch")) ;

			return true ;

		}



	}

	public function on_disconnect()
	{

		mysql_query("UPDATE chat_servers SET nbserver = nbserver - 1 WHERE id_server = " . $GLOBALS['chat_server_id']) ;
			
		if ($this->serverid > 0)
		{
			mysql_query("UPDATE chat_servers SET is_connected = 0 WHERE id_server = " . $this->serverid ) ;
				
		}
		$this->close();


		$this->read_buffer = "";
		echo "[httpServerClient] {$this->remote_address} disconnected\n";
	}

	public function on_write()
	{


	}



	public function on_timer()
	{


		//		mysql_query("UPDATE chat_servers SET last_trame = NOW() WHERE id_server = " . $GLOBALS['chat_server_id']);




		if (time() - $this->last_ping > 250)
		{
			$this->on_disconnect();

		}

		if (time() - $this->last_ping > 5)
		{



			$this->sendtrame("667",array()) ;


			$this->last_ping = time();

		}



	}
}