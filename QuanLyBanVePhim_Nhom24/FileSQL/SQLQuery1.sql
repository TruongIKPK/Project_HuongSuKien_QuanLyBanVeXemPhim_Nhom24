create database QLBanVe;
use QLBanVe
create table ChucVu(
	maChucVu int,
	tenChucVu nvarchar(15),
	PRIMARY KEY (maChucVu)
)
create table TaiKhoan(
	maDangNhap int,
	tenDangNhap char(20),
	matKhau char(20),
	trangThai bit,
	PRIMARY KEY (maDangNhap)
)
create table NhanVien(
	maNhanVien int,
	maDangNhap int,
	maChucVu int,
	tenNV nvarchar(30),
	ngaySinh date,
	phai bit,
	sdt char(10),
	email char(50),
	PRIMARY KEY (maNhanVien),
	FOREIGN KEY (maDangNhap) REFERENCES TaiKhoan(maDangNhap)
)
alter table NhanVien
add FOREIGN KEY (maChucVu) REFERENCES ChucVu(maChucVu)
create table PhongChieu(
	maPhong int,
	tenPhong nvarchar(10),
	PRIMARY KEY (maPhong)
)
create table Ghe(
	maGhe int,
	maPhong int,
	loaiGhe nvarchar(10),
	trangThai int,
	PRIMARY KEY (maGhe),
	FOREIGN KEY (maPhong) REFERENCES PhongChieu(maPhong)
)
create table KhachHang(
	maKhachHang int,
	tenKhachHang nvarchar(50),
	phai bit,
	ngaySinh date,
	sdt char(10),
	diemTichLuy int,
	PRIMARY KEY (maKhachHang)
)
create table Phim(
	maPhim int,
	tenPhim nvarchar(50),
	ngayKhoiChieu date,
	ngayKetThuc date,
	PRIMARY KEY (maPhim)
)
create table SuatChieu(
	maSuatChieu int,
	maPhongChieu int,
	maPhim int,
	ngayChieu datetime
	PRIMARY KEY (maSuatChieu),
	FOREIGN KEY (maPhim) REFERENCES Phim(maPhim),
	FOREIGN KEY (maPhongChieu) REFERENCES PhongChieu(maPhong)
)
create table HoaDonXemPhim(
	maHDXemPhim int,
	maNhanVien int,
	maKhachHang int,
	maSuatChieu int,
	thueVAT float,
	PRIMARY KEY (maHDXemPhim),
	FOREIGN KEY (maNhanVien) REFERENCES NhanVien(maNhanVien),
	FOREIGN KEY (maKhachHang) REFERENCES KhachHang(maKhachHang),
	FOREIGN KEY (maSuatChieu) REFERENCES SuatChieu(maSuatChieu)
)
create table VeXemPhim(
	maVeXemPhim int,
	maGhe int,
	maHDXemPhim int,
	giaVe money,
	PRIMARY KEY (maHDXemPhim,maGhe,maVeXemPhim),
	FOREIGN KEY (maGhe) REFERENCES Ghe(maGhe),
	FOREIGN KEY (maHDXemPhim) REFERENCES HoaDonXemPhim(maHDXemPhim)
)
create table VoucherPhim(
	maVoucherPhim int,
	maCode char(20),
	mucGiam float,
	maHDXemPhim int,
	PRIMARY KEY (maVoucherPhim),
	FOREIGN KEY (maHDXemPhim) REFERENCES HoaDonXemPhim(maHDXemPhim)
)
create table DichVu(
	maDichVu int,
	tenDichVu nvarchar(50),
	giaBang money,
	PRIMARY KEY (maDichVu)
)
create table HoaDonDichVu(
	maDHDichVu int,
	maKhachHang int,
	maNhanVien int,
	thueVAT float,
	PRIMARY KEY (maDHDichVu),
	FOREIGN KEY (maKhachHang) REFERENCES KhachHang(maKhachHang),
	FOREIGN KEY (maNhanVien) REFERENCES NhanVien(maNhanVien)
)
create table HoaDonChiTietDichVu(
	maDHChiTietDichVu int,
	maDHDichVu int,
	maDichVu int,
	PRIMARY KEY (maDHChiTietDichVu,maDHDichVu,maDichVu),
	FOREIGN KEY (maDHDichVu) REFERENCES HoaDonDichVu(maDHDichVu),
	FOREIGN KEY (maDichVu) REFERENCES DichVu(maDichVu)
)
create table VoucherDichVu(
	maVoucherDichVu int,
	maCode char(20),
	mucGiam float,
	maDHDichVu int
	PRIMARY KEY (maVoucherDichVu),
	FOREIGN KEY (maDHDichVu) REFERENCES HoaDonDichVu(maDHDichVu)
)
insert into ChucVu(maChucVu, tenChucVu)
values (1, N'Quản lí');
insert into TaiKhoan (maDangNhap, matKhau, tenDangNhap, trangThai) 
values (1, '12345', 'Truong123', 1)
insert into NhanVien (maNhanVien, maDangNhap, maChucVu,  tenNV
, email, ngaySinh, phai, sdt) 
values (1, 1, 1, N'Lê Nguyễn Phi Trường', 'Truong@gmail.com', '2004-03-21', 1, '0987654321')

insert into ChucVu(maChucVu, tenChucVu)
values (2, N'Nhân Viên');
insert into TaiKhoan (maDangNhap, matKhau, tenDangNhap, trangThai) 
values (2, '12345', 'NhanVien123', 1)
insert into NhanVien (maNhanVien, maDangNhap, maChucVu,  tenNV
, email, ngaySinh, phai, sdt) 
values (2, 2, 2, N'Võ Chí Cường', 'Cuong@gmail.com', '2004-04-21', 1, '0982543211')

insert into TaiKhoan (maDangNhap, matKhau, tenDangNhap, trangThai) 
values (3, '12345', 'TaiKhoanDong', 0)
insert into NhanVien (maNhanVien, maDangNhap, maChucVu,  tenNV
, email, ngaySinh, phai, sdt) 
values (3, 3, 2, N'Võ Chí Cường', 'Cuong@gmail.com', '2004-04-21', 1, '0982543211')

SELECT * FROM TaiKhoan join NhanVien
on TaiKhoan.maDangNhap = NhanVien.maDangNhap 
WHERE tenDangNhap = 'Truong123'

SELECT * FROM TaiKhoan WHERE tenDangNhap = 'Truong123'

SELECT * FROM ChucVu 