-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: database
-- ------------------------------------------------------
-- Server version	5.7.14-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tb_database`
--

DROP TABLE IF EXISTS `tb_database`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_database` (
  `tb_uid` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `tb_account` varchar(45) NOT NULL,
  `tb_passwd` varchar(45) NOT NULL,
  `tb_name` varchar(45) NOT NULL,
  `tb_money` int(12) unsigned NOT NULL,
  `tb_detail` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`tb_uid`,`tb_account`,`tb_money`),
  UNIQUE KEY `tb_uid_UNIQUE` (`tb_uid`),
  UNIQUE KEY `tb_account_UNIQUE` (`tb_account`),
  UNIQUE KEY `tb_name_UNIQUE` (`tb_name`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_database`
--

LOCK TABLES `tb_database` WRITE;
/*!40000 ALTER TABLE `tb_database` DISABLE KEYS */;
INSERT INTO `tb_database` VALUES (1,'account','password','name',0,NULL),(2,'100','100','100',100,NULL),(4,'123','123','123',100,NULL),(5,'paosong','123456','Wayne',100,NULL),(9,'a','a','a',100,NULL),(10,'b','b','b',100,NULL);
/*!40000 ALTER TABLE `tb_database` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-08-22 23:48:30
