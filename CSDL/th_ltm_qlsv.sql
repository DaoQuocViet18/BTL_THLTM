-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 18, 2024 at 10:27 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `th_ltm_qlsv`
--

-- --------------------------------------------------------

--
-- Table structure for table `dangkyhocphan`
--

CREATE TABLE `dangkyhocphan` (
  `MaDangKyHocPhan` varchar(10) NOT NULL,
  `MaSinhVien` varchar(10) NOT NULL,
  `MaLopHocPhan` varchar(10) NOT NULL,
  `DiemHeSo1_1` int(11) DEFAULT NULL,
  `DiemHeSo1_2` int(11) DEFAULT NULL,
  `DiemHeSo2_1` int(11) DEFAULT NULL,
  `DiemHeSo2_2` int(11) DEFAULT NULL,
  `DiemThiCuoiKy` int(11) DEFAULT NULL,
  `DiemTongKet` int(11) DEFAULT NULL,
  `DiemTongKet_TD4` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `dangkyhocphan`
--

INSERT INTO `dangkyhocphan` (`MaDangKyHocPhan`, `MaSinhVien`, `MaLopHocPhan`, `DiemHeSo1_1`, `DiemHeSo1_2`, `DiemHeSo2_1`, `DiemHeSo2_2`, `DiemThiCuoiKy`, `DiemTongKet`, `DiemTongKet_TD4`) VALUES
('DKHP1', 'SV1', 'LHP1', 7, NULL, 8, NULL, NULL, NULL, NULL),
('DKHP2', 'SV2', 'LHP1', 7, NULL, 7, NULL, NULL, NULL, NULL),
('DKHP3', 'SV4', 'LHP1', 6, NULL, 9, NULL, NULL, NULL, NULL),
('DKHP4', 'SV3', 'LHP2', 7, NULL, 6, NULL, NULL, NULL, NULL),
('DKHP5', 'SV3', 'LHP3', 6, NULL, 6, NULL, NULL, NULL, NULL),
('DKHP6', 'SV1', 'LHP4', 8, NULL, 8, NULL, NULL, NULL, NULL),
('DKHP7', 'SV2', 'LHP4', 7, NULL, 7, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `hocphan`
--

CREATE TABLE `hocphan` (
  `MaHocPhan` varchar(10) NOT NULL,
  `TenHocPhan` varchar(255) NOT NULL,
  `MaNganh` varchar(10) NOT NULL,
  `SoTinChi` int(11) DEFAULT NULL,
  `HocPhi` int(11) DEFAULT NULL,
  `SoDonViHocTrinh` int(11) DEFAULT NULL,
  `NamKyHoc` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `hocphan`
--

INSERT INTO `hocphan` (`MaHocPhan`, `TenHocPhan`, `MaNganh`, `SoTinChi`, `HocPhi`, `SoDonViHocTrinh`, `NamKyHoc`) VALUES
('HP1', 'Lập trình C++', 'N1', 3, 1500000, 3, 'Năm 1 Kỳ 1'),
('HP10', 'Gia công Cơ bản', 'N3', 4, 2000000, 4, 'Năm 1 Kỳ 1'),
('HP11', 'Cơ học lý thuyết', 'N3', 4, 2000000, 4, 'Năm 1 Kỳ 2'),
('HP12', 'Thiết kế máy', 'N3', 3, 1500000, 3, 'Năm 1 Kỳ 2'),
('HP13', 'Tiếng Anh giao tiếp 1', 'N4', 3, 1500000, 3, 'Năm 1 Kỳ 1'),
('HP14', 'Ngữ pháp Tiếng Anh 1', 'N4', 3, 1500000, 3, 'Năm 1 Kỳ 1'),
('HP15', 'Tiếng Anh giao tiếp 2', 'N4', 3, 1500000, 3, 'Năm 1 Kỳ 2'),
('HP16', 'Ngữ pháp Tiếng Anh 2', 'N4', 3, 1500000, 3, 'Năm 1 Kỳ 2'),
('HP2', 'Cấu trúc Dữ liệu và Giải thuật', 'N1', 4, 2000000, 4, 'Năm 1 Kỳ 1'),
('HP3', 'Mạng Máy tính', 'N1', 3, 1500000, 3, 'Năm 1 Kỳ 2'),
('HP4', 'Hệ điều hành', 'N1', 3, 1500000, 3, 'Năm 1 Kỳ 2'),
('HP5', 'Nguyên tắc Quản trị Kinh doanh', 'N2', 3, 1500000, 3, 'Năm 1 Kỳ 1'),
('HP6', 'Quản trị Marketing', 'N2', 3, 1500000, 3, 'Năm 1 Kỳ 1'),
('HP7', 'Quản trị Tài chính Doanh nghiệp', 'N2', 4, 2000000, 4, 'Năm 1 Kỳ 2'),
('HP8', 'Quản trị Nhân sự', 'N2', 3, 1500000, 3, 'Năm 1 Kỳ 2'),
('HP9', 'Vật liệu Cơ khí', 'N3', 3, 1500000, 3, 'Năm 1 Kỳ 1');

-- --------------------------------------------------------

--
-- Table structure for table `khoa`
--

CREATE TABLE `khoa` (
  `MaKhoa` varchar(10) NOT NULL,
  `TenKhoa` varchar(255) NOT NULL,
  `TenTruongKhoa` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `khoa`
--

INSERT INTO `khoa` (`MaKhoa`, `TenKhoa`, `TenTruongKhoa`) VALUES
('K1', 'Công nghệ Thông tin', 'Nguyễn Văn A'),
('K2', 'Kinh tế', 'Phạm Thị D'),
('K3', 'Kỹ thuật', 'Trần Thị B'),
('K4', 'Ngoại ngữ', 'Lê Văn C');

-- --------------------------------------------------------

--
-- Table structure for table `lop`
--

CREATE TABLE `lop` (
  `MaLop` varchar(10) NOT NULL,
  `TenLop` varchar(255) NOT NULL,
  `MaNganh` varchar(10) NOT NULL,
  `TenCoVanHocTap` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `lop`
--

INSERT INTO `lop` (`MaLop`, `TenLop`, `MaNganh`, `TenCoVanHocTap`) VALUES
('L1', 'DHTI1A1', 'N1', 'Đỗ Mạnh A'),
('L2', 'DHKD1A1', 'N2', 'Trần Thị B'),
('L3', 'DHCK1A1', 'N3', 'Lê Văn C'),
('L4', 'DHTA1A1', 'N4', 'Phạm Thị D');

-- --------------------------------------------------------

--
-- Table structure for table `lophocphan`
--

CREATE TABLE `lophocphan` (
  `MaLopHocPhan` varchar(10) NOT NULL,
  `TenLopHocPhan` varchar(255) NOT NULL,
  `MaHocPhan` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `lophocphan`
--

INSERT INTO `lophocphan` (`MaLopHocPhan`, `TenLopHocPhan`, `MaHocPhan`) VALUES
('LHP1', 'Lập trình C++', 'HP1'),
('LHP2', 'Nguyên tắc Quản trị Kinh doanh\r\n', 'HP5'),
('LHP3', 'Quản trị Marketing', 'HP6'),
('LHP4', 'Cấu trúc Dữ liệu và Giải thuật', 'HP2');

-- --------------------------------------------------------

--
-- Table structure for table `nganh`
--

CREATE TABLE `nganh` (
  `MaNganh` varchar(10) NOT NULL,
  `TenNganh` varchar(255) NOT NULL,
  `MaKhoa` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `nganh`
--

INSERT INTO `nganh` (`MaNganh`, `TenNganh`, `MaKhoa`) VALUES
('N1', 'Công nghệ Thông tin', 'K1'),
('N2', 'Quản trị Kinh doanh', 'K2'),
('N3', 'Cơ khí', 'K3'),
('N4', 'Tiếng Anh', 'K4');

-- --------------------------------------------------------

--
-- Table structure for table `sinhvien`
--

CREATE TABLE `sinhvien` (
  `MaSinhVien` varchar(10) NOT NULL,
  `MatKhau` varchar(255) NOT NULL,
  `TenSinhVien` varchar(255) NOT NULL,
  `MaLop` varchar(10) NOT NULL,
  `Email` varchar(255) DEFAULT NULL,
  `SoDienThoai` varchar(10) DEFAULT NULL,
  `DiaChi` varchar(255) DEFAULT NULL,
  `NgaySinh` date DEFAULT NULL,
  `GioiTinh` varchar(255) DEFAULT NULL,
  `NgayVaoTruong` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `sinhvien`
--

INSERT INTO `sinhvien` (`MaSinhVien`, `MatKhau`, `TenSinhVien`, `MaLop`, `Email`, `SoDienThoai`, `DiaChi`, `NgaySinh`, `GioiTinh`, `NgayVaoTruong`) VALUES
('SV1', '123456', 'Nguyễn Văn Tuấn', 'L1', 'nvana@gmail.com', '0123456789', 'Hà Nội', '2000-01-01', 'Nam', '2020-09-21'),
('SV2', '123457', 'Nguyễn Thị Biển', 'L1', 'nthib@gmail.com', '0987654321', 'Hà Nội', '2001-02-02', 'Nữ', '2020-09-21'),
('SV3', '123458', 'Lê Văn Chiến', 'L2', 'lvc@gmail.com', '0123456789', 'Hà Nội', '2002-03-03', 'Nam', '2021-09-22'),
('SV4', '123456', 'Nguyễn Văn Dương', 'L1', NULL, NULL, NULL, NULL, NULL, NULL),
('SV5', '123456', 'Lê Hồng Nhung', 'L1', NULL, NULL, NULL, NULL, NULL, NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dangkyhocphan`
--
ALTER TABLE `dangkyhocphan`
  ADD PRIMARY KEY (`MaDangKyHocPhan`);

--
-- Indexes for table `hocphan`
--
ALTER TABLE `hocphan`
  ADD PRIMARY KEY (`MaHocPhan`),
  ADD KEY `MaNganh` (`MaNganh`);

--
-- Indexes for table `khoa`
--
ALTER TABLE `khoa`
  ADD PRIMARY KEY (`MaKhoa`);

--
-- Indexes for table `lop`
--
ALTER TABLE `lop`
  ADD PRIMARY KEY (`MaLop`),
  ADD KEY `MaNganh` (`MaNganh`);

--
-- Indexes for table `lophocphan`
--
ALTER TABLE `lophocphan`
  ADD PRIMARY KEY (`MaLopHocPhan`),
  ADD KEY `MaHocPhan` (`MaHocPhan`);

--
-- Indexes for table `nganh`
--
ALTER TABLE `nganh`
  ADD PRIMARY KEY (`MaNganh`),
  ADD KEY `MaKhoa` (`MaKhoa`);

--
-- Indexes for table `sinhvien`
--
ALTER TABLE `sinhvien`
  ADD PRIMARY KEY (`MaSinhVien`),
  ADD KEY `MaLop` (`MaLop`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
