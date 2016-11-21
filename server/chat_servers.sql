-- ----------------------------
-- Table structure for `chat_servers`
-- ----------------------------
DROP TABLE IF EXISTS `chat_servers`;
CREATE TABLE `chat_servers` (
  `id_server` int(11) NOT NULL,
  `port_listen_clients` int(11) NOT NULL,
  `port_listen_servers` int(11) NOT NULL,
  `ip_listen_clients` char(255) NOT NULL,
  `ip_listen_servers` char(255) NOT NULL,
  `last_trame` datetime NOT NULL,
  `nbclient` int(11) NOT NULL,
  `nbserver` int(11) NOT NULL,
  `is_connected` int(11) NOT NULL,
  PRIMARY KEY (`id_server`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of chat_servers
-- ----------------------------
INSERT INTO `chat_servers` VALUES ('1', '4500', '5000', '87.98.183.15', '87.98.183.15', '2012-08-25 15:16:28', '0', '3', '0');
INSERT INTO `chat_servers` VALUES ('2', '4501', '5001', '87.98.183.15', '87.98.183.15', '2012-08-25 15:16:28', '0', '3', '0');
INSERT INTO `chat_servers` VALUES ('3', '4502', '5002', '87.98.183.15', '87.98.183.15', '2012-08-25 15:16:28', '0', '2', '0');
INSERT INTO `chat_servers` VALUES ('4', '4503', '5003', '87.98.183.15', '87.98.183.15', '2012-08-25 15:16:28', '0', '1', '0');
