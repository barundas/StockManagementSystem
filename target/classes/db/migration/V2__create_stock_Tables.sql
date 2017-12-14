CREATE TABLE `userinfo` (
  `userkey` int(11) DEFAULT NULL,
  `userid` varchar(45) DEFAULT NULL,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `confirmpassword` varchar(45) DEFAULT NULL,
  `firstname` varchar(45) DEFAULT NULL,
  `lastname` varchar(45) DEFAULT NULL,
  `address` varchar(2000) DEFAULT NULL,
  `contactnumber` varchar(15) DEFAULT NULL,
  `dateofbirth` datetime DEFAULT NULL,
  `email` varchar(256) DEFAULT NULL,
  `status` varchar(10) DEFAULT NULL,
  UNIQUE KEY `userkey_UNIQUE` (`userkey`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `usergroups` (
  `groupkey` int(11) NOT NULL,
  `groupname` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`groupkey`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `usergroupmember` (
  `userkey` int(11) NOT NULL,
  `groupkey` int(11) NOT NULL,
  PRIMARY KEY (`userkey`,`groupkey`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
