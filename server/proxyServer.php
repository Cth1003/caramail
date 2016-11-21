<?

//'18 TAB 1 TAB membre_ID CRLF' authorise une personne ???

/*
 *
 *
 *        if((s1 = _fldcase.getParameter("prefs")) != null)
 {
 int j1 = 0;
 try
 {
 j1 = Integer.parseInt(s1);
 }
 catch(NumberFormatException numberformatexception2) { }
 cg[0] = (j1 & 1) != 0;
 cg[1] = (j1 & 2) != 0;
 cg[2] = (j1 & 4) != 0;
 _fldtry[0] = (j1 & 8) != 0;
 _fldtry[1] = (j1 & 0x10) != 0;
 _fldtry[2] = (j1 & 0x20) != 0;
 ab[0] = (j1 & 0x40) != 0;
 ab[1] = (j1 & 0x80) != 0;
 ab[2] = (j1 & 0x100) != 0;
 bq = (j1 & 0x200) != 0;
 dM = (j1 & 0x400) != 0;
 ab[3] = (j1 & 0x800) != 0;
 ab[4] = (j1 & 0x1000) != 0;
 ab[5] = (j1 & 0x2000) != 0;
 ab[6] = (j1 & 0x4000) != 0;
 aQ = j1 >> 15 & 0xf;
 ab[7] = (j1 & 0x80000) != 0;
 }




 if((cP = _fldcase.getParameter("mode")) != null)
 {
 try
 {
 int i1 = Integer.parseInt(cP);
 ep = (i1 & 0x7f) != 0;
 dR = (i1 & 0x80) != 0;
 a4 = (i1 & 0x100) != 0;
 }
 catch(Exception exception)
 {
 ep = false;
 dR = false;
 }
 }


 */


//'18 TAB 0 ou 1' on vous a ignore / authorise
//'330' liste des amis ?
//'85 ou 332' arrivee dun ami ??
//'77, 78 ou 79' reception des infos
//'75' est noPV
//'74' XXX est deconecte


function hexdump ($data, $htmloutput = true, $uppercase = false, $return = false)
{
	// Init
	$hexi   = '';
	$ascii  = '';
	$dump   = ($htmloutput === true) ? '<pre>' : '';
	$offset = 0;
	$len    = strlen($data);

	// Upper or lower case hexadecimal
	$x = ($uppercase === false) ? 'x' : 'X';

	// Iterate string
	for ($i = $j = 0; $i < $len; $i++)
	{
		// Convert to hexidecimal
		$hexi .= sprintf("%02$x ", ord($data[$i]));

		// Replace non-viewable bytes with '.'
		if (ord($data[$i]) >= 32) {
			$ascii .= ($htmloutput === true) ?
			htmlentities($data[$i]) :
			$data[$i];
		} else {
			$ascii .= '.';
		}

		// Add extra column spacing
		if ($j === 7) {
			$hexi  .= ' ';
			$ascii .= ' ';
		}

		// Add row
		if (++$j === 16 || $i === $len - 1) {
			// Join the hexi / ascii output
			$dump .= sprintf("%04$x  %-49s  %s", $offset, $hexi, $ascii);

			// Reset vars
			$hexi   = $ascii = '';
			$offset += 16;
			$j      = 0;

			// Add newline
			if ($i !== $len - 1) {
				$dump .= "\n";
			}
		}
	}

	// Finish dump
	$dump .= $htmloutput === true ?
                '</pre>' :
                '';
	$dump .= "\n";

	// Output method
	if ($return === false) {
		echo $dump;
	} else {
		return $dump;
	}
}



class proxyServer extends socketServer {
}

class proxyServerClient extends socketServerClient {



	private $last_ping ;

	private $isconnected ;
	private $inroom ;

	public function __construct($arg)
	{
		$this->last_ping = time();
		$this->isconnected = false ;
		$this->inroom = false ;


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


		if ($code == "0")
		{
			//connexion
			$admin = $msgs[0] ;

			/*if  (!(($admin == "0") || ($admin == "1")))
				return false ;
				*/

			$tempid = $msgs[1] ;

			// decoder tempid



			$r = mysql_fetch_array(mysql_query("SELECT * , concat(floor(rand() * 10000),':',floor(rand()*500) , ':',floor(rand() * 200000)) as id FROM chat_tempid WHERE tempid = '" . addslashes($tempid) . "'")) ;
			mysql_query("DELETE FROM chat_tempid WHERE tempid = '" . addslashes($tempid) . "'");

			$r['ville'] = "server : " . $GLOBALS['chat_server_id'] ;

			if ($r['id'] == "")
			{
				$this->senderror();
				return false ;
			}

			$id_mb = $r['id']  . ":" . $r['provenance'] ;

			$this->isconnected = true ;

			$nickname = $r['pseudo']  ;

			if ( ($r['modo'] !== "1") && ($r['modo'] !== "2") )
			$nickname .= "_"  .rand(1,1000) ; // todo enlever

			if ($nickname == "")
			$nickname = "noname_" .rand(1,1000) ;

			mysql_query("INSERT INTO chat_connected ( provenance, id_mb,nickname,age,sexe,ville,repondeur,oqp,nopv,current_room,is_admin,connect_date,server)
			VALUES ('" . addslashes($r['provenance']) . "','" . addslashes($id_mb) . "','" . addslashes($nickname) . "','" . addslashes($r['age']) . "','" . addslashes($r['sexe']) . "',
			'" . addslashes($r['ville']) . "','" . addslashes($repondeur) . "','" . addslashes($oqp) . "','" . addslashes($nopv) . "',
			NULL,'" . addslashes($r['modo']) . "',NOW()," . $GLOBALS['chat_server_id'] . ")") ;


			$GLOBALS['tempids'][$id_mb] = $this ;
			$this->id_mb = $id_mb ;

			$this->sendtrame("0",array($id_mb,"197","0",$nickname)) ;
			$this->sendtrame("330",array($id_mb,"-1","")) ;
			$this->sendtrame("332",array($id_mb,"-1","")) ;

			// nouveauté
			$filter_age = "-2" ;
			$filter_sex = "-2" ;
			$rconnectes = mysql_query("SELECT * FROM chat_connected ORDER BY RAND() LIMIT 200");
			$connectes = array() ;


			$adds = $filter_age  . ":" .  $filter_sex ;


			while ($rst = mysql_fetch_array($rconnectes))
			{

					
				$connectes[] = $rst['id_mb'] ;
				$connectes[] = $rst['nickname'] ;
				$connectes[] = "0" ; // mode oqp si lenum & 0x40 == 64
				$connectes[] =  $rst['age'] ;
				$connectes[] = $rst['sexe'] ;
				$connectes[] = $rst['ville'] ;
				$connectes[] = "Salon" ;
				$connectes[] = "4"  ; // ou 1 si on veux "en privé"
					
				$adds = "-2:-2:-2" ;

					
			}

			$connectes = $adds . chr(9) . implode(chr(9),$connectes) . chr(9) ;

			$GLOBALS['tempids'][$this->id_mb]->sendtrame("56",array($connectes)) ;



			return true ;

		}


		if ($this->isconnected !== true)
		{
			$this->senderror();
			return false ;
		}

		if ($code == "82")
		{

			$id_to_get = $msgs[0] ;

			$r = mysql_fetch_array(mysql_query("SELECT * FROM chat_connected WHERE id_mb = '" . addslashes($id_to_get) ."'")) ;


			if ($r['id_mb'] == $id_to_get)
			{
				// info sur un connecté
				$connectes = array() ;
				$connectes[] = $r['id_mb']  ;
				$connectes[] = $r['is_admin'] ;
				$connectes[] = $r['age'] ;
				$connectes[] = $r['sexe'] ;
				$connectes[] = $r['ville'] ;

				$connectes = implode(chr(9),$connectes) . chr(9) ;

				$this->sendtrame("82",array($connectes)) ;
			}



			return true ;

		}


		if ($code == "84")
		{
			// envoi de son etat
			$etat = $msgs[0] ;
			$this->sendtrame("84",array($etat)) ;

			return true ;

		}


		if ($code == "200")
		{

			// trame inconnue

			return true ;

		}


		if ( ($code == "20") || ($code == "40") )
		{

			// entrer dans un salon

			$salon = $msgs[0] ;
			$type = $msgs[1] ; // 0 public , 1 priv�


			// gerer ancien salon si existe
			$this->go_out_room();
			$r = $this->go_in_room($salon,$type);

			if ($r !== null)
			{
				$this->sendtrame($code,array("0",$r['room_name'],"?",$r['createur'],"")) ;




				$r = mysql_query("SELECT * FROM ( SELECT * FROM chat_sentences WHERE id_room = " . $r['room_id'] . " ORDER BY id_sentence DESC LIMIT 15 ) as c ORDER BY id_sentence ASC" ) ;

				while ($rst = mysql_fetch_array($r))
				{
					$connectes = array() ;
					$connectes[] = $rst['id_mb'] ;
					$connectes[] = "0" ;
					$connectes[] = $rst['nickname'] ;
					$connectes[] = $rst['sentence'] ;
					$connectes = implode(chr(9),$connectes) . chr(9) ;

					$GLOBALS['tempids'][$this->id_mb]->sendtrame("70",array($connectes)) ;
				}

			}

			return true ;

		}



		if ( ($code == "94") || ($code == "90") )
		{
			// 94 permanent
			// 90 public
			// demande liste de salon public/permanent

			// $type_liste = $msgs[0] ;

			if ($code == "90")
			$r = mysql_query("SELECT * FROM chat_rooms WHERE mtype = 0 AND permanent = 0 AND nb_connected > 0") ;
			if ($code == "94")
			$r = mysql_query("SELECT * FROM chat_rooms WHERE mtype = 0 AND permanent = 1") ;


			$connectes = array() ;

			while ($rst = mysql_fetch_array($r))
			{
				$connectes[] = $rst['room_name']  ;
				$connectes[] = "?" ;
				$connectes[] = $rst['createur'] ;
				$connectes[] = $rst['nb_connected'] ;
					
			}

			$connectes = implode(chr(9),$connectes) . chr(9) ;

			$this->sendtrame($code,array($connectes)) ;




			return true ;

		}




		if ($code == "85")
		{
			// connecté + asv sur salon


			$r = mysql_fetch_array(mysql_query("SELECT * FROM chat_connected WHERE id_mb = '" . addslashes($this->id_mb) ."'")) ;

			// recupere les connect� du salon

			$rconnectes = mysql_query("SELECT * FROM chat_connected WHERE current_room = " . $r['current_room'] . " LIMIT 40") ;

			$connectes = array() ;

			while ($rst = mysql_fetch_array($rconnectes))
			{
				$connectes[] = $rst['id_mb'] ;
				$connectes[] = $rst['is_admin'] ;
				$connectes[] = $rst['nickname'] ;
				$connectes[] = "0" ;
				$connectes[] = $rst['age'] ;
				$connectes[] = $rst['sexe'] ;
				$connectes[] = $rst['ville'] ;

					
			}




			$connectes = implode(chr(9),$connectes) ; // . chr(9) ;
			$this->sendtrame("85",array("-1",$connectes)) ;



			//			$this->sendtrame("85",array("0","44444:0","0","felkjldskj","5","20","1","fljlkfdslkj","")) ;
			// xxxxx:provenance , admin , pseudo , "0" , age ,sexe , ville

			// $this->sendtrame("85",array("1",$connectes)) ; // s'en va



			return true ;

		}


		if ($code == "16")
		{

			// rapport avc l'admin
			return true ;
		}



		if ($code == "255")
		{

			// corbeille
			return true ;
		}



		if ($code == "199")
		{
			// nb de connecté sur le chat

			//$this->sendtrame("79",array("321321321:0","0","pseudo","tututu","la phrase","")) ;
			//			$this->sendtrame("74",array("44444:0")) ;

			// 11 => param incorrect
			// 12 => surcharge
			// 13 => l'admin vs a refusé
			// 14 => nb connexion simultané atteint
			// 16 => aucune idée , 1 token type integer
			// 18 1 token integer =-1 , met a jour info asv
			// 23 => token -1 , puis txt , Vous avez été banni du salon toto
			// 25 droit d'admin?
			// 79 => phrase accroche pv : array("321321321:0","0","pseudo","tututu","la phrase","")
			// 74 ??


			$nbco = mysql_fetch_array(mysql_query("SELECT COUNT(*) FROM chat_connected"));
			$nbco = $nbco[0] ;
			$GLOBALS['tempids'][$this->id_mb]->sendtrame("199",array($nbco)) ;

			return true ;

		}


		if ($code == "72")
		{
			// phrase en pv

			// "73" + vbTab + user(i).id + ":" + "0" + vbTab + "0" + vbTab + user(i).pseudo + vbTab + msg + Chr$(10) << confirm
			// "72" 72" + vbTab + user(Index).id + ":" + "0" + vbTab + "0" + vbTab + user(Index).pseudo + vbTab + msg + Chr$(10)


			var_dump($msgs);
			$info_connected = mysql_fetch_array(mysql_query("SELECT * FROM chat_connected WHERE id_mb = '" . addslashes($this->id_mb) ."'")) ;
			$rst = mysql_fetch_array(mysql_query("SELECT * FROM chat_connected WHERE id_mb = '" . addslashes($msgs[0]) ."'")) ;



			$msg = $msgs[1] ;


			$connectes = array() ;
			$connectes[] = $info_connected['id_mb'] ;
			$connectes[] = "0" ;
			$connectes[] = $info_connected['nickname'] ;
			$connectes[] = $msg ;

			$connectes2 = array() ;
			$connectes2[] = $rst['id_mb'] ;
			$connectes2[] = "0" ;
			$connectes2[] = $rst['nickname'] ;
			$connectes2[] = $msg ;



			$connectes = implode(chr(9),$connectes) . chr(9) ;
			$connectes2 = implode(chr(9),$connectes2) . chr(9) ;


			mysql_query("INSERT INTO chat_private (nickname_from,nickname_to,date_send,sentence) VALUES
			('" .  addslashes($info_connected['nickname'])  . "','" . addslashes($rst['nickname']) . "',NOW(),'" . addslashes($msg) ."')");


			if ($rst['server'] == $GLOBALS['chat_server_id'])
			{
				if (isset($GLOBALS['tempids'][$rst['id_mb']]))
				{
					$GLOBALS['tempids'][$this->id_mb]->sendtrame("73",array($connectes2)) ;
					$GLOBALS['tempids'][$rst['id_mb']]->sendtrame("72",array($connectes)) ;
				}
			}
			else
			{
				// envoi de trame distantes
				echo "todo trame distante" ;

				if (isset($GLOBALS['inter_server'][$rst['server']]))
				{
					echo "TRAME DISTANTE1 !" ;
					$GLOBALS['tempids'][$this->id_mb]->sendtrame("73",array($connectes2)) ;
					$GLOBALS['inter_server'][$rst['server']]->sendtrame("trame_" . $rst['id_mb'] . "_72",array($connectes)) ;
					echo "ok" ;
				}
			}



			return true;
		}


		if ($code == "18")
		{
			// ignorer / autorisé

			return true;
		}


		if ($code == "25")
		{
			// aucune idee

			return true;
		}


		if ($code == "70")
		{
			// phrase dans salon
			// $this->sendtrame("77",array("0100bonjour")) ; << onglet info

			$info_connected = mysql_fetch_array(mysql_query("SELECT * FROM chat_connected WHERE id_mb = '" . addslashes($this->id_mb) ."'")) ;




			$msg = $msgs[0] ;



			if (substr($msg , 4,7) == "!update")
			{



				if ( ($info_connected['is_admin'] == "1") || ($info_connected['is_admin'] == "2") )
				{
						

					$r11 = mysql_query("SELECT * FROM chat_connected") ;

					
					$msg = "05" . substr($msg,2,2) . substr($msg,4+7+1) ;
					while ($rst2 = mysql_fetch_array($r11))
					{

						if ($rst2['server'] == $GLOBALS['chat_server_id'])
						{
							echo "ENVOI1" ;
							if (isset($GLOBALS['tempids'][$rst2['id_mb']]))
							$GLOBALS['tempids'][$rst2['id_mb']]->sendtrame("77",array($msg)) ;
						}
						else
						{
							// envoi de trame distantes
							//
														if (isset($GLOBALS['inter_server'][$rst2['server']]))
														{
															echo "TRAME DISTANTE4 !" ;
															
															$GLOBALS['inter_server'][$rst2['server']]->sendtrame("trame_" . $rst2['id_mb'] . "_77",array($msg)) ;
															echo "ok" ;
														}

						}
					}


					return true ;
						
				}


			}

			if (substr($msg , 4,5) == "!bold")
			{
				if ( ($info_connected['is_admin'] == "1") || ($info_connected['is_admin'] == "2") )
				{

					$connectes = array() ;
					$connectes[] = $info_connected['id_mb'] ;
					$connectes[] = "0" ;
					$connectes[] = $info_connected['nickname'] ;
					$connectes[] = $msg ;

					$connectes = implode(chr(9),$connectes) . chr(9) ;

					$GLOBALS['tempids'][$this->id_mb]->sendtrame("70",array($connectes)) ;

					$msg =  "05" . substr($msg,2,2) . substr($msg,4+5+1) ;


				}
			}



			if (substr($msg , 4) == "!asv")
			{


				//				$r10 = mysql_query("SELECT * FROM chat_connected") ;
				//
				//
				//				while ($r = mysql_fetch_array($r10))
				//				{
				//
				//
				//					// info sur un connecté
				//					$connectes = array() ;
				//					$connectes[] = $r['id_mb']  ;
				//					$connectes[] = $r['is_admin'] ;
				//					$connectes[] = $r['age'] ;
				//					$connectes[] = $r['sexe'] ;
				//					$connectes[] = $r['ville'] ;
				//
				//					$connectes = implode(chr(9),$connectes) . chr(9) ;
				//
				//					$r11 = mysql_query("SELECT * FROM chat_connected") ;
				//
				//					while ($rst2 = mysql_fetch_array($r11))
				//					{
				//
				//						if ($rst2['server'] == $GLOBALS['chat_server_id'])
				//						{
				//							echo "ENVOI1" ;
				//							if (isset($GLOBALS['tempids'][$rst2['id_mb']]))
				//							$GLOBALS['tempids'][$rst2['id_mb']]->sendtrame("82",array($connectes)) ;
				//						}
				//						else
				//						{
				//							// envoi de trame distantes
				//
				//							if (isset($GLOBALS['inter_server'][$rst2['server']]))
				//							{
				//								echo "TRAME DISTANTE4 !" ;
				//								print_r($GLOBALS['inter_server'][$rst2['server']]);
				//								$GLOBALS['inter_server'][$rst2['server']]->sendtrame("trame_" . $rst2['id_mb'] . "_82",array($connectes)) ;
				//								echo "ok" ;
				//							}
				//
				//						}
				//					}
				//
				////					$this->sendtrame("82",array($connectes)) ;
				//
				//					return true ;
				//				}


					
			}
			$rconnectes = mysql_query("SELECT * FROM chat_connected WHERE current_room = " . $info_connected['current_room'] ) ;

			mysql_query("INSERT INTO chat_sentences (id_room,nickname,id_mb,date_send,sentence) VALUES
			('" .  $info_connected['current_room']  . "','" . addslashes($info_connected['nickname']) . "', '" .  $info_connected['id_mb']  ."',NOW(),'" . addslashes($msg) ."')");

			$connectes = array() ;
			$connectes[] = $info_connected['id_mb'] ;
			$connectes[] = "0" ;
			$connectes[] = $info_connected['nickname'] ;
			$connectes[] = $msg ;

			$connectes = implode(chr(9),$connectes) . chr(9) ;

			while ($rst = mysql_fetch_array($rconnectes))
			{

				if ($rst['server'] == $GLOBALS['chat_server_id'])
				{
					if (isset($GLOBALS['tempids'][$rst['id_mb']]))
					$GLOBALS['tempids'][$rst['id_mb']]->sendtrame("70",array($connectes)) ;
				}
				else
				{
					// envoi de trame distantes
					echo "todo trame distante" ;

					if (isset($GLOBALS['inter_server'][$rst['server']]))
					{
						echo "TRAME DISTANTE2 !" ;
						$GLOBALS['inter_server'][$rst['server']]->sendtrame("trame_" . $rst['id_mb'] . "_70",array($connectes)) ;
						echo "ok" ;
					}

				}
			}





			return true ;

		}

		if ($code == "555")
		{

			//todo gerer ejection ( pas seulement les auto ejection)


			$info_connected = mysql_fetch_array(mysql_query("SELECT * FROM chat_connected WHERE id_mb = '" . addslashes($this->id_mb) ."'")) ;

			$admin = false ;

			if ( ($info_connected['is_admin'] == "1") || ($info_connected['is_admin'] == "2") )
			$admin = true ;


			if ( ($admin) || ($msgs[0] == $info_connected['nickname'] .":" . $info_connected['provenance']) )
			{

				$pseudo = $msgs[0] ;
				$pseudo = substr($pseudo,0,strpos($pseudo,":")) ;

				$info_kicked  = mysql_fetch_array(mysql_query("SELECT * FROM chat_connected WHERE nickname = '" . addslashes($pseudo) ."'")) ;


				$connectes = array() ;
				$connectes[] = $info_connected['id_mb'] ;
				$connectes[] = $info_connected['nickname'] ;
				$connectes = implode(chr(9),$connectes) . chr(9) ;

				if ($info_kicked['server'] == $GLOBALS['chat_server_id'])
				{
					if (isset($GLOBALS['tempids'][$info_kicked['id_mb']]))
					{

						$GLOBALS['tempids'][$info_kicked['id_mb']]->sendtrame("555",array($connectes)) ;
					}
				}
				else
				{
					// envoi de trame distantes
					echo "todo trame distante" ;

					if (isset($GLOBALS['inter_server'][$info_kicked['server']]))
					{
						echo "TRAME DISTANTE1 !" ;

						$GLOBALS['inter_server'][$info_kicked['server']]->sendtrame("trame_" . $info_kicked['id_mb'] . "_555",array($connectes)) ;
						echo "ok" ;
					}
				}




				$connectes = array() ;
				$connectes[] = "5" ;
				$connectes[] = $info_kicked['id_mb'] ;
				$connectes[] = $info_kicked['nickname'] ;
				$connectes[] = $info_connected['id_mb'] ;
				$connectes[] = $info_connected['nickname'] ;

				$connectes = implode(chr(9),$connectes) . chr(9) ;



				$rconnectes = mysql_query("SELECT * FROM chat_connected WHERE current_room = " . $info_connected['current_room'] ) ;


				while ($rst = mysql_fetch_array($rconnectes))
				{

					if ($rst['server'] == $GLOBALS['chat_server_id'])
					{
						if (isset($GLOBALS['tempids'][$rst['id_mb']]))
						{
							$GLOBALS['tempids'][$rst['id_mb']]->sendtrame("76",array($connectes)) ;
						}
					}
					else
					{
						// envoi de trame distantes
						echo "todo trame distante";

						if (isset($GLOBALS['inter_server'][$rst['server']]))
						{
							echo "TRAME DISTANTE3 !" ;
							$GLOBALS['inter_server'][$rst['server']]->sendtrame("trame_" . $rst['id_mb'] . "_76",array($connectes)) ;
							echo "ok" ;
						}

					}
				}



			}


			return true ;

		}


		if ( ($code == "56") || ($code == "58") )
		{
			// Trame de recherche par pseudo/ville (58)

			$filter = $msgs[0] ;
			$filter_age = $msgs[1] ;
			$filter_sex = $msgs[2] ;

			$filter = str_replace("%","\%",$filter);
			$filter = str_replace("_","\_",$filter);

			$filter = addslashes($filter);

			$mf = 'nickname' ;

			if ($code == "58")
			$mf = 'ville';

			$min_age = -50000 ;
			$max_age = 9999999 ;

			if ($filter_sex != -2)
			{
				$cdt_sex = " AND sexe = " . $filter_sex ;
			}
			if ( ($filter_age > 0) && ($filter_age < 6) )
			{
				$min_age = $filter_age * 5 ;
				$max_age = $min_age + 5 ;

			}

			if ( ($filter_age > 5) )
			{
				$min_age = ($filter_age / 2) * 10 ;
				$max_age = $min_age + 10 ;

			}

			if ( ($filter_age == 10) )
			{
				$min_age = 70 ;
				$max_age = 9999999 ;

			}

			$cdt_age = "" ;

			if ($filter_age > 0)
			$cdt_age = " AND age >= $min_age AND age <= $max_age" ;

			echo "SELECT * FROM chat_connected WHERE 1=1 $cdt_age $cdt_sex $mf LIKE '" . $filter ."%'" ;
			$rconnectes = mysql_query("SELECT * FROM chat_connected WHERE 1=1 $cdt_age $cdt_sex AND $mf LIKE '" . $filter ."%'");

			$connectes = array() ;


			$adds = $filter_age  . ":" .  $filter_sex ;


			while ($rst = mysql_fetch_array($rconnectes))
			{

				if ($filter_sex == "-2")
				{
					$connectes[] = $rst['id_mb'] ;
					$connectes[] = $rst['nickname'] ;
					$connectes[] = "0" ; // mode oqp si lenum & 0x40 == 64
					$connectes[] =  $rst['age'] ;
					$connectes[] = $rst['sexe'] ;
					$connectes[] = $rst['ville'] ;
					$connectes[] = "Salon" ;
					$connectes[] = "4"  ; // ou 1 si on veux "en privé"

					$adds = "-2:-2:-2" ;

				}
				else
				{

					$connectes[] = $rst['id_mb'] ;
					$connectes[] = $rst['nickname'] ;
					$connectes[] = "0" ; // mode oqp si lenum & 0x40 == 64
					$connectes[] =  $rst['age'] ;
					$connectes[] = $rst['ville'] ;
					$connectes[] = "Salon" ;
					$connectes[] = "4"  ; // ou 1 si on veux "en privé"

					$adds = $filter_age  . ":" .  $filter_sex . ":" . $filter_sex ;


				}






			}

			$connectes = $adds . chr(9) . implode(chr(9),$connectes) . chr(9) ;

			$GLOBALS['tempids'][$this->id_mb]->sendtrame($code,array($connectes)) ;


			return true ;

		}






		if ($code == "19")
		{
			// trame inconnue (en rapport avc pas de nouveau pv) ignore autorise ? // 18


			return true ;
		}

		if ($code == "26")
		{
			// pas de nouveau pv si option = 2
			// pas de nouveau pv si option = 64
			// 4 pour invisible
			// 68 pour invisible mask ?



			return true ;
		}

		if ($code == "550")
		{
			// pb de comportement

			return true ;
		}
		if ($code == "667")
		{
			// ping

			return true ;
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
		echo "	Send " . $command . " "  . $options . "\n" ;

		$this->write($command . chr(9) . $options . chr(10));


	}
	public function on_connect()
	{
		if ($this->disconnected != true)
		{


			mysql_query("UPDATE chat_servers SET nbclient = nbclient + 1 WHERE id_server = " . $GLOBALS['chat_server_id']) ;

			echo "[httpServerClient] accepted connection from {$this->remote_address}\n";
			$this->accepted    = time();
			$this->last_action = $this->accepted;

			$this->sendtrame("100",array("NewCaraChat v1.00 By Duch")) ;

		}


	}

	public function on_disconnect()
	{


		mysql_query("UPDATE chat_servers SET nbclient = nbclient - 1 WHERE id_server = " . $GLOBALS['chat_server_id']) ;
			

		$this->close();


		$this->go_out_room();
		mysql_query("DELETE FROM chat_connected WHERE id_mb = '" . addslashes($this->id_mb) . "'");
		$this->id_mb = "" ;

		$this->read_buffer = "";
		echo "[httpServerClient] {$this->remote_address} disconnected\n";
	}

	public function on_write()
	{
		/*
		 if (strlen($this->write_buffer) == 0 )
		 {
		 if ($this->keep_alive != true)
		 {

		 $this->disconnected = true;
		 $this->on_disconnect();
		 $this->close();
		 }
		 }*/

	}


	public function go_in_room($salon,$type)
	{


		$this->inroom = true ;

		$info_connected = mysql_fetch_array(mysql_query("SELECT * FROM chat_connected WHERE id_mb = '" . addslashes($this->id_mb) ."'")) ;


		if ($info_connected['id_mb'] != "")
		{
			// cherche le salon
			$r = mysql_fetch_array(mysql_query("SELECT * FROM chat_rooms WHERE room_name = '" . addslashes($salon) ."' AND mtype = '" . addslashes($type) ."' LIMIT 1")) ;

			if ($r['nb_connected'] >= 40)
			{

				return $this->go_in_room($salon . "*" , $type);

			}

			if (!($r['room_id'] > 0))
			{

				$createur = $info_connected['nickname'];

				mysql_query("INSERT INTO chat_rooms (room_name,mtype,date_create,createur,nb_connected) VALUES ('" . addslashes($salon) ."','" . addslashes($type) ."',NOW(),'" . addslashes($createur) ."',0);");
				$r = mysql_fetch_array(mysql_query("SELECT * FROM chat_rooms WHERE room_name = '" . addslashes($salon) ."' AND mtype = '" . addslashes($type) ."' LIMIT 1")) ;


			}

			mysql_query("UPDATE chat_rooms SET nb_connected = nb_connected + 1 WHERE room_id = " . $r['room_id']);
			mysql_query("UPDATE chat_connected SET current_room = " . $r['room_id'] . " WHERE id_mb = '" . addslashes($this->id_mb) ."'") ;


			// informe les membre de la room room
			// todo gerer les autre idserver
			$rconnectes = mysql_query("SELECT * FROM chat_connected WHERE current_room = " . $r['room_id'] ) ;

			$connectes = array() ;
			$connectes[] = $info_connected['id_mb'] ;
			$connectes[] = "0" ;
			$connectes[] = $info_connected['nickname'] ;
			$connectes[] = $info_connected['is_admin'] ;
			$connectes[] = $info_connected['age'] ;
			$connectes[] = $info_connected['sexe'] ;
			$connectes[] = $info_connected['ville'] ;

			$connectes = implode(chr(9),$connectes) . chr(9) ;

			while ($rst = mysql_fetch_array($rconnectes))
			{

				if ($rst['server'] == $GLOBALS['chat_server_id'])
				{
					if (isset($GLOBALS['tempids'][$rst['id_mb']]))
					$GLOBALS['tempids'][$rst['id_mb']]->sendtrame("85",array("0",$connectes)) ;
				}
				else
				{
					// envoi de trame distantes

					if (isset($GLOBALS['inter_server'][$rst['server']]))
					{
						echo "TRAME DISTANTE4 !" ;
						print_r($GLOBALS['inter_server'][$rst['server']]);
						$GLOBALS['inter_server'][$rst['server']]->sendtrame("trame_" . $rst['id_mb'] . "_85",array("0",$connectes)) ;
						echo "ok" ;
					}

				}
			}



			return $r ;
		}
		else
		return null ;

	}
	public function go_out_room()
	{

		if ($this->inroom == false)
		return false ;
			
		$this->inroom = false ;

		$info_connected = mysql_fetch_array(mysql_query("SELECT * FROM chat_connected WHERE id_mb = '" . addslashes($this->id_mb) ."'")) ;

		if ($info_connected['id_mb'] != "")
		{
			if ($info_connected['current_room'] > 0)
			{

				// vide l'ancienne room
				mysql_query("UPDATE chat_rooms SET nb_connected = nb_connected - 1 WHERE room_id = " . $info_connected['current_room'] );
				mysql_query("UPDATE chat_connected SET current_room = NULL WHERE id_mb = '" . addslashes($this->id_mb) ."'") ;
				mysql_query("DELETE FROM chat_rooms WHERE nb_connected <= 0 AND permanent = 0") ;


			}

			// informe les membre de l'ancienne room
			// todo gerer les autre idserver
			$rconnectes = mysql_query("SELECT * FROM chat_connected WHERE current_room = " . $info_connected['current_room'] ) ;

			$connectes = array() ;
			$connectes[] = $info_connected['id_mb'] ;
			$connectes[] = "0" ;
			$connectes[] = $info_connected['nickname'] ;
			$connectes[] = $info_connected['is_admin'] ;;
			$connectes[] = $info_connected['age'] ;
			$connectes[] = $info_connected['sexe'] ;
			$connectes[] = $info_connected['ville'] ;

			$connectes = implode(chr(9),$connectes) . chr(9) ;

			while ($rst = mysql_fetch_array($rconnectes))
			{

				if ($rst['server'] == $GLOBALS['chat_server_id'])
				{
					if (isset($GLOBALS['tempids'][$rst['id_mb']]))
					$GLOBALS['tempids'][$rst['id_mb']]->sendtrame("85",array("1",$connectes)) ;
				}
				else
				{
					// envoi de trame distantes
					if (isset($GLOBALS['inter_server'][$rst['server']]))
					{
						echo "TRAME DISTANTE5 !" ;
						$GLOBALS['inter_server'][$rst['server']]->sendtrame("trame_" . $rst['id_mb'] . "_85",array("1",$connectes)) ;
						echo "ok" ;
							
					}

				}
			}


		}


	}
	public function on_timer()
	{


		if (time() - $GLOBALS['last_reco_mysql'] > 60 * 5)
		{

			echo "Reco SQL \n" ;
			mysql_close();
			mysql_connect(MYSQL_HOST,MYSQL_USER,MYSQL_PASS);
			mysql_select_db(MYSQL_DATABASE);
			$GLOBALS['last_reco_mysql'] = time();

		}


		if (time() - $this->last_ping > 250)
		{
			$this->on_disconnect();

		}

		if (time() - $this->last_ping > 120)
		{


			$this->sendtrame("667",array()) ;

			$this->last_ping = time();

		}



	}
}

