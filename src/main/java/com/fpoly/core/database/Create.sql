CREATE DATABASE QUANLYTHUVIEN
GO
USE  QUANLYTHUVIEN
GO 
CREATE TABLE LoaiSach (
    MaLoaiSach CHAR(5) PRIMARY KEY, 
    TenLoaiSach NVARCHAR(50)
);
GO

CREATE TABLE Sach (
    MaSach CHAR(5) PRIMARY KEY, 
    TenSach NVARCHAR(100), 
    LanTaiBan INT, 
    NamXB INT, 
    TenTG NVARCHAR(100), 
    NhaXB NVARCHAR(100), 
    SoLuong INT, 
    GiaSach DECIMAL(10, 2), 
    LoaiSach CHAR(5),
	HinhAnh NVARCHAR(100),
    FOREIGN KEY (LoaiSach) REFERENCES LoaiSach(MaLoaiSach)
);

CREATE TABLE NhanVien (
    MaNV CHAR(5) PRIMARY KEY, 
    HoTen NVARCHAR(100), 
    Ho NVARCHAR(50), 
    Ten NVARCHAR(50), 
    TaiKhoan VARCHAR(50), 
    MatKhau VARCHAR(50), 
    VaiTro VARCHAR(50), 
    Email VARCHAR(100), 
    NgayVaoLam DATE, 
    DiaChi NVARCHAR(100)
);
GO

CREATE TABLE NhaCungCap (
    MaNCC CHAR(5) PRIMARY KEY, 
    TenNCC NVARCHAR(100), 
    SDT VARCHAR(15), 
    DiaChi NVARCHAR(100)
);
GO

CREATE TABLE PhieuNhap (
    MaPN CHAR(5) PRIMARY KEY, 
    SoLuong INT, 
    NgayNhap DATE, 
    MaNCC CHAR(5), 
    MaNV CHAR(5),
    FOREIGN KEY (MaNCC) REFERENCES NhaCungCap(MaNCC),
    FOREIGN KEY (MaNV) REFERENCES NhanVien(MaNV)
);
GO

CREATE TABLE ChiTietPhieuNhap (
    MaPN CHAR(5), 
    MaSach CHAR(5),
    PRIMARY KEY (MaPN, MaSach),
    FOREIGN KEY (MaPN) REFERENCES PhieuNhap(MaPN),
    FOREIGN KEY (MaSach) REFERENCES Sach(MaSach)
);
GO

CREATE TABLE DocGia (
    MaDG CHAR(5) PRIMARY KEY, 
    TenDG NVARCHAR(100), 
    NgaySinh DATE, 
    SDT VARCHAR(15), 
    Email VARCHAR(100), 
    DiaChi NVARCHAR(100),
	TaiKhoan VARCHAR(50),
    MatKhau VARCHAR(50)
);
GO

CREATE TABLE PhieuTra (
    MaPT CHAR(5) PRIMARY KEY, 
    NgayMuon DATE, 
    NgayTra DATE, 
    TinhTrang NVARCHAR(50), 
    TienPhat DECIMAL(10, 2), 
    MaDG CHAR(5), 
    MaNV CHAR(5),
    FOREIGN KEY (MaDG) REFERENCES DocGia(MaDG),
    FOREIGN KEY (MaNV) REFERENCES NhanVien(MaNV)
);
GO

CREATE TABLE PhieuMuon (
    MaPM CHAR(5) PRIMARY KEY, 
    NgayMuon DATE, 
    NgayHenTra DATE, 
    TinhTrang NVARCHAR(50), 
    ThanhToan DECIMAL(10, 2), 
    MaDG CHAR(5), 
    MaNV CHAR(5),
    FOREIGN KEY (MaDG) REFERENCES DocGia(MaDG),
    FOREIGN KEY (MaNV) REFERENCES NhanVien(MaNV)
);
GO

CREATE TABLE ChiTietPhieuMuon (
    MaPM CHAR(5), 
    MaSach CHAR(5),
    PRIMARY KEY (MaPM, MaSach),
    FOREIGN KEY (MaPM) REFERENCES PhieuMuon(MaPM),
    FOREIGN KEY (MaSach) REFERENCES Sach(MaSach)
);
GO

CREATE TABLE ChiTietPhieuTra (
    MaPT CHAR(5), 
    MaSach CHAR(5),
    PRIMARY KEY (MaPT, MaSach),
    FOREIGN KEY (MaPT) REFERENCES PhieuTra(MaPT),
    FOREIGN KEY (MaSach) REFERENCES Sach(MaSach)
);
GO

