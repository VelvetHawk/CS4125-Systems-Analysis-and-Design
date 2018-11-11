-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Nov 11, 2018 at 09:56 PM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `restaurant`
--

-- --------------------------------------------------------

--
-- Table structure for table `Account_Type`
--

CREATE TABLE `Account_Type` (
  `Acc_Type_ID` int(11) NOT NULL,
  `Name` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `Consumables`
--

CREATE TABLE `Consumables` (
  `C_ID` int(11) NOT NULL,
  `Name` varchar(50) DEFAULT NULL,
  `Conn_Type_ID` int(11) DEFAULT NULL,
  `Base_Price` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `Consumable_Type`
--

CREATE TABLE `Consumable_Type` (
  `Con_Type_ID` int(11) NOT NULL,
  `Name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `Orders`
--

CREATE TABLE `Orders` (
  `Order_ID` int(11) NOT NULL,
  `User_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `Order_Contents`
--

CREATE TABLE `Order_Contents` (
  `Content_ID` int(11) NOT NULL,
  `Order_ID` int(11) DEFAULT NULL,
  `Consumable_ID` int(11) DEFAULT NULL,
  `Size_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `Reviews`
--

CREATE TABLE `Reviews` (
  `Review_ID` int(11) NOT NULL,
  `User_ID` int(11) DEFAULT NULL,
  `Title` varchar(50) DEFAULT NULL,
  `Content` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `Size`
--

CREATE TABLE `Size` (
  `Size_ID` int(11) NOT NULL,
  `Size` varchar(50) DEFAULT NULL,
  `Price_Multiplier` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `Stock`
--

CREATE TABLE `Stock` (
  `Stock_ID` int(11) NOT NULL,
  `Name` varchar(100) DEFAULT NULL,
  `Quantity` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `Users`
--

CREATE TABLE `Users` (
  `User_ID` int(11) NOT NULL,
  `Name` varchar(100) DEFAULT NULL,
  `Surname` varchar(100) DEFAULT NULL,
  `Email` varchar(100) DEFAULT NULL,
  `Address` varchar(100) DEFAULT NULL,
  `Phone` varchar(20) DEFAULT NULL,
  `Points` int(50) DEFAULT NULL,
  `Acc_Type_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Account_Type`
--
ALTER TABLE `Account_Type`
  ADD PRIMARY KEY (`Acc_Type_ID`);

--
-- Indexes for table `Consumables`
--
ALTER TABLE `Consumables`
  ADD PRIMARY KEY (`C_ID`),
  ADD KEY `Conn_Type_ID` (`Conn_Type_ID`);

--
-- Indexes for table `Consumable_Type`
--
ALTER TABLE `Consumable_Type`
  ADD PRIMARY KEY (`Con_Type_ID`);

--
-- Indexes for table `Orders`
--
ALTER TABLE `Orders`
  ADD PRIMARY KEY (`Order_ID`),
  ADD KEY `User_ID` (`User_ID`);

--
-- Indexes for table `Order_Contents`
--
ALTER TABLE `Order_Contents`
  ADD PRIMARY KEY (`Content_ID`),
  ADD KEY `Order_ID` (`Order_ID`),
  ADD KEY `Consumable_ID` (`Consumable_ID`),
  ADD KEY `Size_ID` (`Size_ID`);

--
-- Indexes for table `Reviews`
--
ALTER TABLE `Reviews`
  ADD PRIMARY KEY (`Review_ID`),
  ADD KEY `User_ID` (`User_ID`);

--
-- Indexes for table `Size`
--
ALTER TABLE `Size`
  ADD PRIMARY KEY (`Size_ID`);

--
-- Indexes for table `Stock`
--
ALTER TABLE `Stock`
  ADD PRIMARY KEY (`Stock_ID`);

--
-- Indexes for table `Users`
--
ALTER TABLE `Users`
  ADD PRIMARY KEY (`User_ID`),
  ADD KEY `Acc_Type_ID` (`Acc_Type_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Account_Type`
--
ALTER TABLE `Account_Type`
  MODIFY `Acc_Type_ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Consumables`
--
ALTER TABLE `Consumables`
  MODIFY `C_ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Consumable_Type`
--
ALTER TABLE `Consumable_Type`
  MODIFY `Con_Type_ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Orders`
--
ALTER TABLE `Orders`
  MODIFY `Order_ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Order_Contents`
--
ALTER TABLE `Order_Contents`
  MODIFY `Content_ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Reviews`
--
ALTER TABLE `Reviews`
  MODIFY `Review_ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Size`
--
ALTER TABLE `Size`
  MODIFY `Size_ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Stock`
--
ALTER TABLE `Stock`
  MODIFY `Stock_ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Users`
--
ALTER TABLE `Users`
  MODIFY `User_ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `Consumables`
--
ALTER TABLE `Consumables`
  ADD CONSTRAINT `consumables_ibfk_1` FOREIGN KEY (`Conn_Type_ID`) REFERENCES `Consumable_Type` (`Con_Type_ID`);

--
-- Constraints for table `Orders`
--
ALTER TABLE `Orders`
  ADD CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`User_ID`) REFERENCES `Users` (`User_ID`);

--
-- Constraints for table `Order_Contents`
--
ALTER TABLE `Order_Contents`
  ADD CONSTRAINT `order_contents_ibfk_1` FOREIGN KEY (`Order_ID`) REFERENCES `Orders` (`Order_ID`),
  ADD CONSTRAINT `order_contents_ibfk_2` FOREIGN KEY (`Consumable_ID`) REFERENCES `Consumables` (`C_ID`),
  ADD CONSTRAINT `order_contents_ibfk_3` FOREIGN KEY (`Size_ID`) REFERENCES `Size` (`Size_ID`);

--
-- Constraints for table `Reviews`
--
ALTER TABLE `Reviews`
  ADD CONSTRAINT `reviews_ibfk_1` FOREIGN KEY (`User_ID`) REFERENCES `Users` (`User_ID`);

--
-- Constraints for table `Users`
--
ALTER TABLE `Users`
  ADD CONSTRAINT `users_ibfk_1` FOREIGN KEY (`Acc_Type_ID`) REFERENCES `Account_Type` (`Acc_Type_ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
