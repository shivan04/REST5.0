CREATE DATABASE  IF NOT EXISTS `reserveringsysteem` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `reserveringsysteem`;
-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: reserveringsysteem
-- ------------------------------------------------------
-- Server version	8.0.18

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `klanten`
--

DROP TABLE IF EXISTS `klanten`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `klanten` (
  `klantId` int(11) NOT NULL AUTO_INCREMENT,
  `achternaam` varchar(255) DEFAULT NULL,
  `adress` varchar(255) DEFAULT NULL,
  `district` varchar(255) DEFAULT NULL,
  `idNummer` varchar(255) DEFAULT NULL,
  `klantenNummer` int(11) DEFAULT NULL,
  `telefoonNummer` int(11) DEFAULT NULL,
  `voornaam` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`klantId`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `klanten`
--

LOCK TABLES `klanten` WRITE;
/*!40000 ALTER TABLE `klanten` DISABLE KEYS */;
INSERT INTO `klanten` VALUES (1,'sewdien','rikahiweg ','wanica','1223',1,99930039,'shivan'),(4,'fsdfdsf','sdfsdfsd',NULL,'fsdfsdfsd',0,1151313,'sdfsdfsdfsd'),(5,'dasdas','asdasdasdas',NULL,'dasdasdsad',0,4545,'dasdasdsa'),(6,'dasd','ddasdas',NULL,'adasdsa',0,55655,'asdasds'),(7,'dasd','ddasdas',NULL,'adasdsa',0,55655,'asdasds'),(8,'sdasdas','dasdasdas',NULL,'asdasdas',0,2222,'dasdasd'),(9,'sewdien','rikhaiweg',NULL,'gt6678',0,897432321,'shivan'),(14,'','',NULL,'',0,NULL,''),(15,'','',NULL,'',0,NULL,''),(16,'sa','',NULL,'',0,NULL,'sasa'),(19,'dffd','',NULL,'',0,NULL,'dfdfdf'),(20,'hulk','',NULL,'',0,NULL,'banner');
/*!40000 ALTER TABLE `klanten` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-12 23:09:04
