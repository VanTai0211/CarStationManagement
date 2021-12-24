﻿CREATE DATABASE CAR
GO
USE CAR
GO

create table Account 
(
	USERNAME varchar(50),
	GMAIL NCHAR(50),
	PASS CHAR(20) UNIQUE NOT NULL,
	CONFIRM CHAR(20) NOT NULL,
	CONSTRAINT PK_US PRIMARY KEY (USERNAME)
)
go
--drop table TenHangXeMT
create table TenHangXeMT
(
	Id_hangxe VARCHAR(4) primary key,
	TenHangXe NVARCHAR(50)
)
insert into TenHangXeMT VALUES 
('PY','Phúc Yên'),
('PD','Phúc Đức'),
('SAO','Sao'),
('ĐD','Đại Dương')

create table CarMTrung 
(
	ID INT  IDENTITY(1,1),
	Id_hangxe VARCHAR(4),
	BIENSO NCHAR(20),
	BAIXE NVARCHAR(10) NOT NULL,  
	DITU NVARCHAR(50),
	DENBEN NVARCHAR(50),
	NGAYVAO NVARCHAR(50),
	CONSTRAINT PK_ID PRIMARY KEY (ID),
	FOREIGN KEY (Id_hangxe) REFERENCES TenHangXeMT(Id_hangxe)
)
go
insert into CarMTrung (Id_hangxe,BIENSO,BAIXE,DITU,DENBEN,NGAYVAO) VALUES 
('PY','7800000','1','TPHCM','PY','2019/12/2')
select * from TenHangXeMT ,  CarMTrung where TenHangXeMT.Id_hangxe = CarMTrung.Id_hangxe
create table CarMTrungCalendar 
(
	IDDC INT  IDENTITY(1,1),
	TENHANGDC NVARCHAR(50),
	BIENSODC NCHAR(20),
	TRANGTHAI NVARCHAR(20) NOT NULL,  
	DITUDC NVARCHAR(50),
	DENBENDC NVARCHAR(50),
	NGAYVAODC NVARCHAR(50),
	CONSTRAINT PK_IDDC PRIMARY KEY (IDDC)
)
go


-- drop table CarMTrungCalendar

insert into CarMBacCalendar (TENHANGDC,BIENSODC,TRANGTHAI,DITUDC,DENBENDC,NGAYVAODC) VALUES 
('vantai','7801-9999999','Đang Chạy','Hà Nội','Tp HCM','1999/01/21'),
('vantai','7801-9999999','Còn Tại Bến','Hà Nội','Tp HCM','1999/01/21'),
('vantai','7801-9999999','Đã Hoàn Thành','Hà Nội','Tp HCM','1999/01/21'),
('vantai','7801-9999999','Đang Chạy','Hà Nội','Tp HCM','1999/01/21'),
('vantai','7801-9999999','Còn Tại Bến','Hà Nội','Tp HCM','1999/01/21')

create table CarMNam 
( 
	ID INT  IDENTITY(1,1) Primary key,
	TENHANG NVARCHAR(50),
	BIENSO NCHAR(20),
	BAIXE NVARCHAR(10) NOT NULL,  
	DITU NVARCHAR(50),
	DENBEN NVARCHAR(50),
	NGAYVAO NVARCHAR(50),
)
go
create table CarMNamCalendar 
(
	IDDC INT  IDENTITY(1,1) primary key,
	TENHANGDC NVARCHAR(50),
	BIENSODC NCHAR(20),
	TRANGTHAI NVARCHAR(20) NOT NULL,  
	DITUDC NVARCHAR(50),
	DENBENDC NVARCHAR(50),
	NGAYVAODC NVARCHAR(50),
)
go


create table CarMBac
( 
	ID INT  IDENTITY(1,1) Primary key,
	TENHANG NVARCHAR(50),
	BIENSO NCHAR(20),
	BAIXE NVARCHAR(10) NOT NULL,  
	DITU NVARCHAR(50),
	DENBEN NVARCHAR(50),
	NGAYVAO NVARCHAR(50),
)
go
create table CarMBacCalendar 
(
	IDDC INT  IDENTITY(1,1) primary key,
	TENHANGDC NVARCHAR(50),
	BIENSODC NCHAR(20),
	TRANGTHAI NVARCHAR(20) NOT NULL,  
	DITUDC NVARCHAR(50),
	DENBENDC NVARCHAR(50),
	NGAYVAODC NVARCHAR(50),
)
go


