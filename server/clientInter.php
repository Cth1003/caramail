<?
class ClientInter extends socketClient {

	private $serverid ;
	private $canreco ;
	
	public function sendtrame($command,$options)
	{
		
		$options = implode(chr(9),$options) ;
		echo "	Send Client inter client" . $command . " "  . $options . "\n" ;
		
		$this->write($command . chr(9) . $options . chr(10));


	}

	public function on_error()
	{
		echo "error";
		
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


	public function on_connect()
	{
	
		$argument = $this->args ;
		$id_server = $argument['id_server'] ;
		
		if ($this->disconnected != true)
		{
			$this->canreco = true ;
			echo "[Client] accepted connection from {$this->remote_address}\n";
	
			$GLOBALS['inter_server'][$id_server] = &$this ;
			echo "STORE2 => " . $id_server . "\n" ;
			$this->serverid = $id_server ;
				
		}
		else
		{
			
			mysql_query("UPDATE chat_servers SET nbclient = 0 , nbserver = 0 ,is_connected = 0 WHERE id_server = " . $id_server) ;
			
		}

	}

	public function on_disconnect()
	{

		echo "RECO ?";
		$this->close();
		$rst = $this->args ;
		
		if ($this->canreco == true)
		{
			echo "RECO!";

			$GLOBALS['daemon']->create_client('ClientInter', $rst['ip_listen_servers'], $rst['port_listen_servers'],0,0,$rst);
		}
		
	}

	public function on_write()
	{

	}



	public function on_timer()
	{
//		echo "Timeout?";
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
			
			
			echo "TO TRAME2 : " . $id_mb . "//////" . $code ;
			
			if (isset($GLOBALS['tempids'][$id_mb]))
			{	
				var_dump($GLOBALS['tempids'][$id_mb]);
				if (is_callable(array($GLOBALS['tempids'][$id_mb],'sendtrame')))
				{
					echo "imcallable !";
					$GLOBALS['tempids'][$id_mb]->sendtrame($code,$msgs) ;
				}
			}
			
			// trame2
			
			return true ;
			
		}
		
		
		if ($code == "667")
		{
			
			$this->sendtrame("667",array());
			return true ;
		}
		
		if ($code == "identify")
		{
			$this->sendtrame("identify",array($GLOBALS['code_td'],$GLOBALS['chat_server_id'])) ;
			
			return true ;
		}


	}

}
