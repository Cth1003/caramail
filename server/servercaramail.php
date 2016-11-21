<?
SocketServerMain::init(array("server" => array("clientInter", "proxyServer","proxyServerInter")));

global $daemon ;
$daemon = new socketDaemon();

mysql_connect(MYSQL_HOST,MYSQL_USER,MYSQL_PASS);
mysql_select_db(MYSQL_DATABASE);

// trouve son id server
$info_server = mysql_fetch_array(mysql_query("SELECT * FROM chat_servers WHERE id_server = " . $argv[1]));

if (!($info_server['id_server'] > 0))
	die("Aucun serveur définit") ;

	print_r($info_server);
	
	
$GLOBALS['code_td'] = "fkljsdoourekjh" ;

$GLOBALS['chat_server_id'] = $info_server['id_server'] ;
$GLOBALS['chat_server_infos'] = $info_server ;

// recupere les infos
$r = mysql_query("SELECT current_room,count(current_room) as nb FROM chat_connected WHERE current_room > 0 AND server = " . $GLOBALS['chat_server_id'] . " GROUP BY current_room") ;
while ($rst = mysql_fetch_array($r))
{
	mysql_query("UPDATE chat_rooms SET nb_connected = nb_connected - " . $rst['nb'] . " WHERE room_id = " . $rst['current_room']) ;
	
}

mysql_query("UPDATE chat_servers SET nbclient = 0 , nbserver = 0 , is_connected = 0 WHERE id_server = " . $GLOBALS['chat_server_id']) ;


mysql_query("DELETE FROM chat_rooms WHERE nb_connected <= 0 AND permanent = 0") ;
mysql_query("DELETE FROM chat_connected WHERE server = " . $GLOBALS['chat_server_id']) ;
$server = $daemon->create_server('proxyServer', 'proxyServerClient', $info_server['ip_listen_clients'], $info_server['port_listen_clients']);
$server_inter = $daemon->create_server('proxyServerInter', 'proxyServerClientInter', $info_server['ip_listen_servers'], $info_server['port_listen_servers']);

mysql_query("UPDATE chat_servers SET last_trame = NOW(), is_connected = 1 WHERE id_server = " . $GLOBALS['chat_server_id']) ;

// se connecte aux autres serveurs
$r = mysql_query("SELECT * FROM chat_servers WHERE is_connected = 1 AND id_server <> " . $GLOBALS['chat_server_id']);
while ($rst = mysql_fetch_array($r))
{
//	var_dump($rst);
	$daemon->create_client('ClientInter', $rst['ip_listen_servers'], $rst['port_listen_servers'],0,0,$rst);
}
$daemon->process();


?>