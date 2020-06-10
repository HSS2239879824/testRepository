##删除数据库UPMoneyDB
DROP DATABASE IF EXISTS UPMoneyDB;
##创建数据库UPMoneyDB
CREATE DATABASE IF NOT EXISTS UPMoneyDB;
##使用数据库UPMoneyDB
USE UPMoneyDB;

SET GLOBAL time_zone='+8:00';

##删除用户表sys_user
DROP TABLE IF EXISTS `upmoneydb`.`sys_user`;
##创建用户表sys_user
##UNIQUE唯一的  BINARY数据大小写
CREATE TABLE IF NOT EXISTS `upmoneydb`.`sys_user`(  
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `accountId` VARCHAR(26) BINARY UNIQUE NOT NULL COMMENT '账户ID',
  `password` VARCHAR(36) NOT NULL COMMENT '密码',
  `username` VARCHAR(36) NOT NULL COMMENT '用户名',
  `createdtime` DATETIME NOT NULL DEFAULT NOW() COMMENT '创建时间',
  `modifiedtime` DATETIME NOT NULL DEFAULT NOW() COMMENT '修改时间',
  `userheadimg` VARCHAR(256) NOT NULL DEFAULT 'default.jpg' COMMENT '用户头像',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;
##添加数据
INSERT INTO `upmoneydb`.`sys_user` (`accountId`,`password`,`username`,`userheadimg`) 
VALUES('HanLei','123456','韩磊','hanlei.jpeg');

SELECT * FROM `upmoneydb`.`sys_user`;

