-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 10, 2024 at 10:22 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `library`
--

-- --------------------------------------------------------

--
-- Table structure for table `books`
--

CREATE TABLE `books` (
  `id` int(11) NOT NULL,
  `name` varchar(256) NOT NULL,
  `author` varchar(256) NOT NULL,
  `description` text NOT NULL,
  `is_borrowed` tinyint(1) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `books`
--

INSERT INTO `books` (`id`, `name`, `author`, `description`, `is_borrowed`) VALUES
(1, 'Harry Potter', 'Zeus', 'Harry potter is a boy named Harry and last name Potter.', 1),
(2, 'Taiwan', 'Zeus', '', 1),
(3, 'Meow', 'Zeus', '', 0),
(4, 'Meow', 'GRR', '', 0),
(5, 'Taiwan', 'Zeus', '', 0),
(6, 'Japan', 'Kim', '', 1),
(7, 'Bali', 'Honey', '', 1),
(8, 'Singapore', 'Loksdads', '', 0),
(9, 'Herwy potter', 'lol', 'asdkjhgaskhd', 0),
(10, 'The road not found', 'da wei', 'Meow meow meow', 0);

-- --------------------------------------------------------

--
-- Table structure for table `borrowed_books`
--

CREATE TABLE `borrowed_books` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `book_id` int(11) NOT NULL,
  `is_returned` tinyint(1) NOT NULL DEFAULT 0,
  `is_approved` tinyint(1) NOT NULL DEFAULT 0,
  `date_borrowed` date NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `borrowed_books`
--

INSERT INTO `borrowed_books` (`id`, `user_id`, `book_id`, `is_returned`, `is_approved`, `date_borrowed`) VALUES
(1, 5, 1, 1, 1, '2024-12-10'),
(2, 5, 2, 1, 1, '2024-12-10'),
(4, 5, 3, 0, 1, '2024-12-10'),
(5, 5, 1, 1, 1, '2024-12-10'),
(6, 5, 2, 0, 1, '2024-12-10'),
(7, 5, 7, 1, 1, '2024-12-10'),
(8, 5, 7, 1, 1, '2024-12-10'),
(9, 5, 7, 0, 1, '2024-12-10'),
(10, 5, 1, 0, 1, '2024-12-10'),
(14, 5, 3, 0, 0, '2024-12-10'),
(15, 55, 6, 0, 1, '2024-12-10');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `created_at` date NOT NULL DEFAULT current_timestamp(),
  `role` varchar(255) NOT NULL DEFAULT 'user'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `username`, `password`, `created_at`, `role`) VALUES
(1, '123', '123', '2024-11-27', 'admin'),
(2, 'zeus', 'elderfield', '2024-11-27', 'user'),
(7, 'asdasd', '123', '2024-12-10', 'user'),
(9, 'dsa', '123', '2024-12-10', 'user'),
(10, 'asdasd1', '123', '2024-12-10', 'user'),
(11, 'fds', '123', '2024-12-10', 'user'),
(12, 'user1', 'password1', '2024-12-10', 'user'),
(13, 'user2', 'password2', '2024-12-10', 'user'),
(14, 'user3', 'password3', '2024-12-10', 'user'),
(15, 'user4', 'password4', '2024-12-10', 'user'),
(16, 'user5', 'password5', '2024-12-10', 'user'),
(17, 'user6', 'password6', '2024-12-10', 'user'),
(18, 'user7', 'password7', '2024-12-10', 'user'),
(19, 'user8', 'password8', '2024-12-10', 'user'),
(20, 'user9', 'password9', '2024-12-10', 'user'),
(21, 'user10', 'password10', '2024-12-10', 'user'),
(22, 'user11', 'password11', '2024-12-10', 'user'),
(23, 'user12', 'password12', '2024-12-10', 'user'),
(24, 'user13', 'password13', '2024-12-10', 'user'),
(25, 'user14', 'password14', '2024-12-10', 'user'),
(26, 'user15', 'password15', '2024-12-10', 'user'),
(27, 'user16', 'password16', '2024-12-10', 'user'),
(28, 'user17', 'password17', '2024-12-10', 'user'),
(29, 'user18', 'password18', '2024-12-10', 'user'),
(30, 'user19', 'password19', '2024-12-10', 'user'),
(31, 'user20', 'password20', '2024-12-10', 'user'),
(36, 'librarian6', 'password6', '2024-12-10', 'librarian'),
(37, 'librarian7', 'password7', '2024-12-10', 'librarian'),
(38, 'librarian8', 'password8', '2024-12-10', 'librarian'),
(39, 'librarian9', 'password9', '2024-12-10', 'librarian'),
(40, 'librarian10', 'password10', '2024-12-10', 'librarian'),
(41, 'librarian11', 'password11', '2024-12-10', 'librarian'),
(42, 'librarian12', 'password12', '2024-12-10', 'librarian'),
(43, 'librarian13', 'password13', '2024-12-10', 'librarian'),
(44, 'librarian14', 'password14', '2024-12-10', 'librarian'),
(45, 'librarian15', 'password15', '2024-12-10', 'librarian'),
(46, 'librarian16', 'password16', '2024-12-10', 'librarian'),
(47, 'librarian17', 'password17', '2024-12-10', 'librarian'),
(48, 'librarian18', 'password18', '2024-12-10', 'librarian'),
(49, 'librarian19', 'password19', '2024-12-10', 'librarian'),
(51, 'librarian21', 'password21', '2024-12-10', 'librarian'),
(52, 'zeusthelibrarian', '123', '2024-12-10', 'librarian'),
(53, 'zeustheuser', '123', '2024-12-10', 'user'),
(56, 'test', '123', '2024-12-10', 'user'),
(57, 'test1', '123', '2024-12-10', 'user'),
(58, '123123', '123', '2024-12-10', 'librarian'),
(59, '321321', '123', '2024-12-10', 'user');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `books`
--
ALTER TABLE `books`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `borrowed_books`
--
ALTER TABLE `borrowed_books`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `books`
--
ALTER TABLE `books`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `borrowed_books`
--
ALTER TABLE `borrowed_books`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=60;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
