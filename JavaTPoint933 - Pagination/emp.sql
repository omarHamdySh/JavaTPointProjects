-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Apr 26, 2016 at 11:19 AM
-- Server version: 5.5.16
-- PHP Version: 5.4.0beta2-dev

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `test`
--

-- --------------------------------------------------------

--
-- Table structure for table `emp`
--

CREATE TABLE IF NOT EXISTS `emp` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `salary` float NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=16 ;

--
-- Dumping data for table `emp`
--

INSERT INTO `emp` (`id`, `name`, `salary`) VALUES
(1, 'Amit', 30000),
(2, 'Ajeet', 40000),
(3, 'James', 50000),
(4, 'Sonoo', 60000),
(5, 'Sarfraz', 70000),
(6, 'Bob', 80000),
(7, 'Rahul', 90000),
(8, 'Rakesh', 25000),
(9, 'Udit', 35000),
(10, 'Jai', 45000),
(11, 'Nikhil', 55000),
(12, 'Somesh', 65000),
(13, 'Rajesh', 75000),
(14, 'Ankit', 85000),
(15, 'Ratan', 95000);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
