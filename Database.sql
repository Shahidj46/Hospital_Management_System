CREATE DATABASE  IF NOT EXISTS `hospitalbd` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `hospitalbd`;
-- MySQL dump 10.13  Distrib 8.0.25, for Win64 (x86_64)
--
-- Host: localhost    Database: hospitalbd
-- ------------------------------------------------------
-- Server version	8.0.25

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
-- Table structure for table `adddoctor`
--

DROP TABLE IF EXISTS `adddoctor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `adddoctor` (
  `DoctorID` int NOT NULL,
  `Name` varchar(45) DEFAULT NULL,
  `Department` varchar(45) DEFAULT NULL,
  `Gender` varchar(45) DEFAULT NULL,
  `Email` varchar(45) DEFAULT NULL,
  `Address` varchar(45) DEFAULT NULL,
  `JoiningDate` date DEFAULT NULL,
  `LeavingDate` date DEFAULT NULL,
  PRIMARY KEY (`DoctorID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `adddoctor`
--

LOCK TABLES `adddoctor` WRITE;
/*!40000 ALTER TABLE `adddoctor` DISABLE KEYS */;
INSERT INTO `adddoctor` VALUES (6001,'Rasel','Urology','Male','Rasel@gmail.com','Dhaka','2021-08-11',NULL),(6002,'Tumpa','Dermatology','Female','Tumpa@gmail.com','Khulna','2020-08-12',NULL),(6003,'Shohidul','Ophthalmology','Male','Shohidul@gmail.com','Rajshahi','2019-08-14',NULL),(6004,'Topu','Gynecology','Male','Topu@gmail.com','Barishal','2018-08-16',NULL),(6005,'Dill','Cardiology','Female','Dill@gmail.com','Dhaka','2016-08-10',NULL),(6006,'Rizvi ','Endocrinology','Male','Rizvi@gmail.com','Maymansing','2015-08-13',NULL),(6007,'Mostafiz','Urology','Male','Mostafiz@gmail.com','Chittagong','2023-08-09',NULL);
/*!40000 ALTER TABLE `adddoctor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `addpatient`
--

DROP TABLE IF EXISTS `addpatient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `addpatient` (
  `PatientID` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(45) DEFAULT NULL,
  `Age` varchar(45) DEFAULT NULL,
  `Department` varchar(45) DEFAULT NULL,
  `Gender` varchar(45) DEFAULT NULL,
  `MaritalStatus` varchar(45) DEFAULT NULL,
  `Address` varchar(45) DEFAULT NULL,
  `Date` varchar(45) DEFAULT NULL,
  `Phone` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`PatientID`)
) ENGINE=InnoDB AUTO_INCREMENT=7008 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `addpatient`
--

LOCK TABLES `addpatient` WRITE;
/*!40000 ALTER TABLE `addpatient` DISABLE KEYS */;
INSERT INTO `addpatient` VALUES (7000,'Nadia','55','Dermatology','Female','Unmarried','Dhaka','2021-08-10','01515262157'),(7001,'Munni','26','Urology','Female','Married','Dhanmandi','2021-08-10','01515242425'),(7002,'Topu','27','Dermatology','Male','Unmarried','Mirpur','2021-08-12','01715242425'),(7003,'Dill','28','Ophthalmology','Female','Married','Shirajganj','2020-08-10','01625484575'),(7004,'Rasel','20','Gynecology','Male','Unmarried','Barishal','2019-08-15','016254845700'),(7005,'Shohid','22','Cardiology','Male','Married','Natore','2020-08-13','01985445650'),(7006,'Tumpa','18','Cardiology','Female','Unmarried','Tangail','2020-08-13','01658445854'),(7007,'Nipa','20','Ophthalmology','Male','Married','Madaripur','2021-08-11','0175458569');
/*!40000 ALTER TABLE `addpatient` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `appoinment`
--

DROP TABLE IF EXISTS `appoinment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `appoinment` (
  `AppoinmentID` int NOT NULL AUTO_INCREMENT,
  `DoctorID` varchar(45) DEFAULT NULL,
  `PatientID` varchar(45) DEFAULT NULL,
  `DoctorName` varchar(45) DEFAULT NULL,
  `PatientName` varchar(45) DEFAULT NULL,
  `DoctorDepartment` varchar(45) DEFAULT NULL,
  `PatientAddress` varchar(45) DEFAULT NULL,
  `DoctorEmail` varchar(45) DEFAULT NULL,
  `PatientPhone` varchar(45) DEFAULT NULL,
  `Date` date DEFAULT NULL,
  `Time` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`AppoinmentID`)
) ENGINE=InnoDB AUTO_INCREMENT=5007 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `appoinment`
--

LOCK TABLES `appoinment` WRITE;
/*!40000 ALTER TABLE `appoinment` DISABLE KEYS */;
INSERT INTO `appoinment` VALUES (5002,'6001','7001','Rasel','Munni','Urology','Dhanmandi','Rasel@gmail.com','01515242425','2021-08-11','10 : PM'),(5004,'6003','7003','Shohidul','Dill','Ophthalmology','Shirajganj','Shohidul@gmail.com','01625484575','2018-08-16','9:00 PM'),(5005,'6004','7004','Topu','Rasel','Gynecology','Barishal','Topu@gmail.com','016254845700','2017-08-16','11: AM'),(5006,'6003','7006','Shohidul','Tumpa','Ophthalmology','Tangail','Shohidul@gmail.com','01658445854','2019-08-15','12:00 PM');
/*!40000 ALTER TABLE `appoinment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `invoice`
--

DROP TABLE IF EXISTS `invoice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `invoice` (
  `InvoiceID` int NOT NULL AUTO_INCREMENT,
  `PatientID` varchar(45) DEFAULT NULL,
  `Name` varchar(45) DEFAULT NULL,
  `Phone` varchar(45) DEFAULT NULL,
  `Date` date DEFAULT NULL,
  `BedCharge` varchar(45) DEFAULT NULL,
  `DoctorCharge` varchar(45) DEFAULT NULL,
  `PathologyCharge` varchar(45) DEFAULT NULL,
  `Total` varchar(45) DEFAULT NULL,
  `Discount` varchar(45) DEFAULT NULL,
  `GrandTotal` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`InvoiceID`)
) ENGINE=InnoDB AUTO_INCREMENT=7004 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `invoice`
--

LOCK TABLES `invoice` WRITE;
/*!40000 ALTER TABLE `invoice` DISABLE KEYS */;
INSERT INTO `invoice` VALUES (1001,'7000','Nadia','01515262157','2021-08-12','50','25','25','100.00','30','70.00'),(1002,'7001','Topu','01754551316','2021-08-11','50','25','25','100.00','20','80.00'),(1003,'7002','Topu','01715242425','2021-08-12','5000','2000','7000','14000.00','5','13300.00'),(1004,'7003','Dill','01625484575','2020-08-10','2000','1000','5000','8000.00','20','6400.00'),(1005,'7004','Rasel','016254845700','2018-08-15','4000','10000','3000','17000.00','15','14450.00'),(1006,'7005','Shohidul','01985445650','2023-08-10','7000','1000','30000','38000.00','25','28500.00'),(1007,'7001','Munni','01515242425','2021-08-10','80000','40000','50000','170000.00','1','168300.00');
/*!40000 ALTER TABLE `invoice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prescription`
--

DROP TABLE IF EXISTS `prescription`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prescription` (
  `PrescriptionID` int NOT NULL AUTO_INCREMENT,
  `DoctorID` varchar(45) DEFAULT NULL,
  `DoctorName` varchar(45) DEFAULT NULL,
  `PatientID` varchar(45) DEFAULT NULL,
  `PatientName` varchar(45) DEFAULT NULL,
  `Tab_01` varchar(45) DEFAULT NULL,
  `Tab_01_Dose` varchar(45) DEFAULT NULL,
  `Tab_02` varchar(45) DEFAULT NULL,
  `Tab_02_Dose` varchar(45) DEFAULT NULL,
  `Tab_03` varchar(45) DEFAULT NULL,
  `Tab_03_Dose` varchar(45) DEFAULT NULL,
  `Syrup_01` varchar(45) DEFAULT NULL,
  `Syrup_01_Month` varchar(45) DEFAULT NULL,
  `Syrup_02` varchar(45) DEFAULT NULL,
  `Syrup_02_Month` varchar(45) DEFAULT NULL,
  `Test_01` varchar(45) DEFAULT NULL,
  `Test_02` varchar(45) DEFAULT NULL,
  `Date` date DEFAULT NULL,
  PRIMARY KEY (`PrescriptionID`)
) ENGINE=InnoDB AUTO_INCREMENT=8006 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prescription`
--

LOCK TABLES `prescription` WRITE;
/*!40000 ALTER TABLE `prescription` DISABLE KEYS */;
INSERT INTO `prescription` VALUES (8000,'6002','Tumpa','7002','Topu','fsfs','Dose - 06','fsdf','Dose - 06','fdsf','Dose - 05','fsfd','Month - 02','sfs','Month - 03','X-ray','Gastroscopy or EGD','2021-08-09'),(8001,'6004','Topu','7005','Shohid','B-50','Dose - 04','MetroX','Dose - 05','Napa','Dose - 05','Syrup','Month - 01','Alcoly','Month - 01','Ultrasound','ERCP','2021-08-10'),(8002,'6007','Mostafiz','7001','Munni','Histasin','Dose - 05','Co-Vax','-- Select Dose --','NExtra','Dose - 07','Syrpe1','Month - 03','Alcoly','Month - 01','Ultrasound','Colonoscopy','2021-08-09'),(8003,'6005','Dill','7005','Shohid','Peracitaml','Dose - 07','Napa','Dose - 06','H-Plus','Dose - 06','Alcoly','Month - 03','Syrup-2','Month - 03','Ultrasound','ERCP','2021-08-05'),(8004,'6002','Tumpa','7003','Dill','Napa','Dose - 05','Hplus','Dose - 04','Alcoly','Dose - 05','Syrup1','Month - 02','Alcoly','Month - 02','Mammography','X-ray','2021-08-09'),(8005,'6003','Shohidul','7002','Topu','Napa','Dose - 04','Napa2','Dose - 06','Hplus','Dose - 07','Alcoly','Month - 03','Alcoly2','Month - 02','X-ray','ERCP','2021-08-04');
/*!40000 ALTER TABLE `prescription` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-01-02 21:23:32
