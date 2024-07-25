/*MA
LoaiSach
Sach (cần có dữ liệu trong LoaiSach)
NhanVien
NhaCungCap
DocGia
PhieuNhap (cần có dữ liệu trong NhaCungCap và NhanVien)
PhieuMuon (cần có dữ liệu trong DocGia và NhanVien)
PhieuTra (cần có dữ liệu trong DocGia và NhanVien)
ChiTietPhieuNhap (cần có dữ liệu trong PhieuNhap và Sach)
ChiTietPhieuMuon (cần có dữ liệu trong PhieuMuon và Sach)
ChiTietPhieuTra (cần có dữ liệu trong PhieuTra và Sach)
*/
--LOAI SACH 
INSERT INTO LoaiSach(MaLoaiSach, TenLoaiSach)
VALUES  ('TLKN',N'Tâm lý - Kỹ năng'),
		('TGTL',N'Tôn giáo - Tâm linh'),
		('KHCN',N'Khoa học - Công nghệ'),
		('KTXD',N'Kiến truc - Xây dựng'),
		('NLNN',N'Nông - Lâm - Ngư nghiệp'),
		('YHSK',N'Y học - Sức khỏe'),
		('LSQS',N'Lịch sử - Quân sự'),
		('NVLS',N'Nhân vật lịch sử'),
		('HTKB',N'Hồi ký - Tùy bút'),
		('THLL',N'Triết học - Lý luận'),
		('DLCT',N'Đường lối - Chính trị'),
		('TVPL',N'Thư viện pháp luật'),
		('KTMT',N'Khai mở tâm trí'),
		('VHNT',N'Văn hóa - Nghệ thuật'),
		('VHXH',N'Văn hóa - Xã hội'),
		('CNTT',N'Công nghệ thông tin'),
		('TTVT',N'Thể thao - Võ thuật'),
		('PTBT',N'Phát triển bản thân'),
		('AMTCH',N'Âm nhạc - Thơ ca - Hội họa'),
		('LMNT',N'Lãng mạn - Ngôn tình'),
		('TLHH', N'Tiếu lâm - Hài hước')

go
--SACH 
INSERT INTO SACH(MaSach, TenSach,LanTaiBan, NamXB ,TenTG,NhaXB,  SoLuong , GiaSach, LoaiSach, HinhAnh)
VALUES  ('S0001', N'Nhập môn tâm lý học', 1, 2022, N'B-R-Hergenhahn',N'Thống kê', 5, 80000, 'TLKN', NULL),
		('S0002', N'Giáo trình tâm lý học quản lý', 1, 2014, N'Nguyễn Thị Thúy',N'Tổng hợp', 3, 85000, 'TLKN',  NULL),
		('S0003', N'Người nam châm - Bí mật của luật hấp dẫn', 1, 2021, N'Jack Canfield',N'Tổng hợp', 5, 90000, 'TGTL',  NULL),
		('S0004', N'Tất cả đều là lẽ đương nhiên', 1, 2024, N'Tinh Vân Đại Sư',N'Thống kê', 7, 70000, 'TGTL',  NULL),
		('S0005', N'HIỆU ỨNG FACEBOOK VÀ CUỘC CÁCH MẠNG TOÀN CẦU CỦA MẠNG XÃ HỘI', 1, 2024, N'David Kirkpatrick',N'Tổng hợp', 5, 80000, 'KHCN',  NULL),
		('S0006', N'NGHỆ THUẬT VÀ VẬT LÍ', 1, 2024, N'Leonard Shlain',N'Dân trí', 5, 10000, 'KHCN', NULL),
		('S0007', N'BÍ MẬT TỬ CẤM THÀNH BẮC KINH', 1, 2024, N'Thượng Quan Phong',N'Thời đại', 5, 80000, 'KTXD', NULL),
		('S0008', N'VẬT LIỆU XÂY DỰNG MỚI', 1, 2022, N' Phạm Duy Hữu',N'Dân trí', 5, 80000, 'KTXD', NULL),
		('S0009', N'KỸ THUẬT CHĂN NUÔI VÀ PHÒNG BỆNH CHO GIA CẦM', 1, 2022, N' Hội Người Mù Huế',N'Nông nghiệp', 7, 80000, 'NLNN',  NULL),
		('S0010', N'NHỮNG BÀI HỌC TỪ THIÊN NHIÊN', 1, 2023, N' Shimpei Murakami',N'Nông nghiệp', 5, 60000, 'NLNN', NULL),
		('S0011', N'DINH DƯỠNG CHỮA BỆNH - ĐẬU, HẠT, NGŨ CỐC', 1, 2022, N'Susan Curtis',N'NXB', 2, 100000, 'YHSK', NULL),
		('S0012', N'TẾ BÀO GỐC - BÍ MẬT CỦA SUỐI NGUỒN TƯƠI TRẺ', 1, 2022, N'Neil H Riordan',N'NXB', 5, 80000, 'YHSK',  NULL),
		('S0013', N'LỊCH SỬ GIÁO DỤC THẾ GIỚI', 1, 2022, N'Hà Nhật Thăng',N'Quân đội', 10, 80000, 'LSQS', NULL),
		('S0014', N'CÁC TRIỀU ĐẠI VIỆT NAM', 1, 1999, N'Quỳnh Cư',N'Thanh Niên Hà Nội', 7, 80000, 'LSQS', NULL);
go

 INSERT INTO NhanVien(MaNV, HoTen, HO, Ten, TaiKhoan, MatKhau, VaiTro, Email, NgayVaoLam, DiaChi)
 VALUES ('NV001', N'Nguyễn Tuấn Kiệt', N'Nguyễn', N'Tuấn Kiệt', 'Tuankiet1', '123456', N'Nhân viên', 'Tuankiet@gmail.com', '2023-01-01', N'B23 Ngyễn Ảnh Thủ, P.Tân Chánh Hiệp, Q.12, Tp.HCM'),
('NV002', N'Trần Nhật Tân', N'Trần', N'Nhật Tân', 'Nhattan2', '123456', N'Nhân viên', 'Nhattan@gmail.com', '2023-02-13', N'192 Trần Hưng Đạo, P.1, Q.5, Tp.HCM'),
('NV003', N'Nguyễn Khánh Vi', N'Nguyễn', N'Khánh Vi', 'Khanvi3', '123456', N'Nhân viên', 'Khanhvi@gmail.com', '2023-02-28', N'16 Hoa Sữa, P.1, Q.Tân Bình, Tp.HCM'),
('NV004', N'Huỳnh Văn Khánh', N'Huỳnh', N'Văn Khánh', 'Vankhanh4', '123456', N'Nhân viên', 'Vankhanh@gmail.com', '2023-03-04', N'109 Quốc Lộ 13, P.25, Q.Bình Thạnh, Tp.HCM'),
('NV005', N'Lê Diễm Phụng', N'Lê', N'Diễm Phụng', 'Diemphung', '123456', N'Nhân viên', 'Diemphung@gmail.com', '2023-04-30', N'16 Tô Ký , P.Tân Thới Hiệp, Q.12, Tp.HCM');
go 

--NHÀ CUNG CẤP
INSERT INTO NhaCungCap(MaNCC, TenNCC, SDT, DiaChi)
VALUES ('NCC01', N'Công Ty Cổ Phần Phát Hành Sách Tp.HCM', '02838225798', '60-62 Lê Lợi, P.Bến Nghé, Q.1,Tp.HCM'),
('NCC02', N'Trí Tuệ - Công Ty Cổ Phần Sách & Thiết Bị Giáo Dục Trí Tuệ', '02438515567', N'187 Giảng Võ, Q.Đống Đa, Hà Nội'),
('NCC03', N'Công Ty TNHH Văn Hóa Việt Long', '02838452708', N'14/35, Đào Duy Anh, P.9, Q.Phú Nhuận, Tp.HCM'),
('NCC04', N'Công Ty Cổ Phần Sách Mcbooks', ' 0986066630', N'Lô 34E, Khu Đấu Giá 3ha, P.Phúc Diễm, Q.Bắc Từ Liêm, Hà Nội'),
('NCC05',N'Nhà Sách Trực Tuyến BOOKBUY.VN', '02838207153', N'147 Pasteur, P.6, Q.3, Tp.HCM'),
('NCC06',N'Công Ty TNHH Đăng Nguyên', '02543716857', N'Thôn Đức Mỹ, X.Suối Nghệ, H.Châu Đức, Bà Rịa-Vũng Tàu'),
('NCC07',N'Nhà Sách Trực Tuyến Atlazbooks', '02485857659', N'Tầng 5, Số 23 Hoàng Văn Thái, P.Khương Mai, Q.Thanh Xuân, Hà Nội'),
('NCC08',N'Nhà Sách Bích Quân', '0944566788', N'249 Lý Thường Kiệt, KP.Thống Nhất 1, Dĩ An, Bình Dương'),
('NCC09',N'Nhà Sách Nguyễn Du', '02543533399', N'17C Nam Kỳ Khởi Nghĩa, P.3, Tp.Vũng Tàu, Bà Rịa-Vũng Tàu'),
('NCC10',N'Nhà Sách Thanh Niên Quy Nhơn', '02563818295', N'339-341 Đường Trần Hưng Đạo, Bình Định');
GO 

--PHIẾU NHẬP
INSERT INTO PhieuNhap(MaPN, SoLuong, NgayNhap, MaNCC, MaNV)
VALUES('PN001', 30, '2024-01-10', 'NCC01', 'NV001'),
('PN002', 30, '2024-02-10', 'NCC04', 'NV002'),
('PN003', 20, '2024-03-10', 'NCC05', 'NV005'),
('PN004', 50, '2024-04-10', 'NCC02', 'NV003'),
('PN005', 40, '2024-05-10', 'NCC08', 'NV004'),
('PN006', 50, '2024-06-10', 'NCC04', 'NV002'),
('PN007', 20, '2024-07-10', 'NCC09', 'NV005'),
('PN008', 50, '2024-08-10', 'NCC10', 'NV002'),
('PN009', 30, '2024-09-10', 'NCC07', 'NV003'),
('PN010', 30, '2024-10-10', 'NCC09', 'NV005');
GO

--CHI TIẾT PHIẾU NHẬP
INSERT INTO ChiTietPhieuNhap(MaPN, MaSach)
VALUES('PN001', 'S0001'),
('PN002', 'S0002'),
('PN003', 'S0003'),
('PN004', 'S0005'),
('PN005', 'S0006'),
('PN006', 'S0009'),
('PN007', 'S0010'),
('PN008', 'S0004'),
('PN009', 'S0007'),
('PN010', 'S0008');
GO

--ĐỌC GIẢ
-- Update the INSERT INTO statement for DocGia
INSERT INTO DocGia(MaDG, TenDG, NgaySinh, SDT, Email, DiaChi, TaiKhoan, MatKhau)
VALUES
('DG001', N'Nguyễn Đăng Khoa', '2000-10-23', '0915647462', 'Dangkhoa@gmail.com', N'6 Đ.Tô Ký, Trung Mỹ Tây, Quận 12, Tp.HCM', 'dangkhoa', 'password1'),
('DG002', N'Trần Văn Thuận', '2002-01-13', '0919867546', 'Vanthuan@gmail.com', N'362/17 Phan Huy Ích, Phường 12, Gò Vấp, Hồ Chí Minh', 'vanthuan', 'password2'),
('DG003', N'Nguyễn Khánh Duy', '2005-09-12', '0912764834', 'Khanhduy@gmail.com', N'111 Đ.Số 2, Phường 16, Gò Vấp, Hồ Chí Minh', 'khanhduy', 'password3'),
('DG004', N'Võ Thành Lộc', '2005-01-01', '0911094738', 'Thanhloc@gmail.com', N'362/17 Phan Huy Ích, Phường 12, Gò Vấp, Hồ Chí Minh', 'thanhloc', 'password4'),
('DG005', N'Hắc Hàn Triệu', '2001-08-25', '0914653596', 'Hantrieu@gmail.com', N'9 Đường HT 31, Hiệp Thành, Quận 12, Hồ Chí Minh', 'hantrieu', 'password5'),
('DG006', N'Trần Thị Thanh Liêm', '1999-04-30', '0917024567', 'Thanhliem@gmail.com', N'73 Đ.Mai Thị Lựu, Đa Kao, Quận 1, Hồ Chí Minh', 'thanhliem', 'password6'),
('DG007', N'Lê Tuấn Anh', '2003-11-18', '0914092835', 'Tuananh@gmail.com', N'Lạc Long Quân, Phường 3, Quận 11, Hồ Chí Minh', 'tuananh', 'password7'),
('DG008', N'Tằng Trí Ngọc', '2000-03-12', '0848564746', 'Tringoc@gmail.com', N'280 Đ.Vành Đai Trong, Bình Trị Đông B, Bình Tân, Hồ Chí Minh', 'tringoc', 'password8'),
('DG009', N'Bùi Bá Hiếu', '1982-01-25', '0852931583', 'Bahieeu@gmail.com', N'12 Nguyễn Văn Bảo, Phường 4, Gò Vấp, Hồ Chí Minh', 'bahieu', 'password9'),
('DG010', N'Nguyễn Trần Duy Văn', '1999-06-06', '0846001543', 'Duyvan@gmail.com', N'6 Đ.Võ Văn Ngân, Trường Thọ, Thủ Đức, Hồ Chí Minh', 'duyvan', 'password10');
--PHIẾU TRẢ
INSERT INTO PhieuTra(MaPT, NgayMuon, NgayTra, TinhTrang, TienPhat, MaDG, MaNV)
VALUES('PT001', '2024-02-12', '2024-02-17', N'Hư hại 0%', 0, 'DG001', 'NV001'),
('PT002', '2024-02-14', '2024-02-19', N'Hư hại 10%', 10000, 'DG002', 'NV002'),
('PT003', '2024-03-01', '2024-03-05', N'Hư hại 0%', 0, 'DG003', 'NV003'),
('PT004', '2024-03-03', '2024-03-08', N'Hư hại 20%', 20000, 'DG001', 'NV004'),
('PT005', '2024-03-05', '2024-03-12', N'Hư hại 10%', 10000, 'DG006', 'NV005'),
('PT006', '2024-03-12', '2024-03-17', N'Hư hại 0%', 0, 'DG008', 'NV001'),
('PT007', '2024-03-14', '2024-03-18', N'Hư hại 0%', 0, 'DG009', 'NV002'),
('PT008', '2024-03-15', '2024-03-20', N'Hư hại 10%', 10000, 'DG010', 'NV003'),
('PT009', '2024-03-18', '2024-03-22', N'Hư hại 0%', 0, 'DG003', 'NV004'),
('PT010', '2024-04-01', '2024-04-05', N'Hư hại 0%', 0, 'DG005', 'NV005');
GO
--PHIẾU MƯỢN
INSERT INTO PhieuMuon(MaPM, NgayMuon, NgayHenTra, TinhTrang, ThanhToan, MaDG, MaNV)
VALUES('PM001', '2024-02-12', '2024-02-17', N'Đã trả', 10000, 'DG001', 'NV001'),
('PM002', '2024-02-14', '2024-02-19', N'Chưa trả', 10000, 'DG002', 'NV002'),
('PM003', '2024-03-01', '2024-03-05', N'Chưa trả', 10000, 'DG003', 'NV003'),
('PM004', '2024-03-03', '2024-03-08', N'Đã trả', 10000, 'DG001', 'NV004'),
('PM005', '2024-03-05', '2024-03-12', N'Chưa trả', 10000, 'DG006', 'NV005'),
('PM006', '2024-03-12', '2024-03-17', N'Đã trả', 10000, 'DG008', 'NV001'),
('PM007', '2024-03-14', '2024-03-18', N'Chưa trả', 10000, 'DG009', 'NV002'),
('PM008', '2024-03-15', '2024-03-20', N'Chưa trả', 10000, 'DG010', 'NV003'),
('PM009', '2024-03-18', '2024-03-22', N'Đã trả', 10000, 'DG003', 'NV004'),
('PM010', '2024-04-01', '2024-04-05', N'Đã trả', 10000, 'DG005', 'NV005');
GO 
--CHI TIẾT PHIẾU MƯỢN
INSERT INTO ChiTietPhieuMuon(MaPM, MaSach)
VALUES('PM001', 'S0001'),
('PM002', 'S0002'),
('PM003', 'S0004'),
('PM004', 'S0005'),
('PM005', 'S0008'),
('PM006', 'S0009'),
('PM007', 'S0012'),
('PM008', 'S0014'),
('PM009', 'S0003'),
('PM010', 'S0007');
GO 
--CHI TIẾT PHIẾU TRẢ
INSERT INTO ChiTietPhieuTra
VALUES('PT001', 'S0001'),
('PT002', 'S0002'),
('PT003', 'S0004'),
('PT004', 'S0005'),
('PT005', 'S0008'),
('PT006', 'S0009'),
('PT007', 'S0012'),
('PT008', 'S0014'),
('PT009', 'S0003'),
('PT010', 'S0007');
GO