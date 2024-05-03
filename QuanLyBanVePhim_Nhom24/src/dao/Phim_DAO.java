package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connectDB.ConnectSQL;
import entity.PhimTEST;

public class Phim_DAO {
	public static boolean addPhim(PhimTEST phim) {
		Connection con = ConnectSQL.getConnection();
		PreparedStatement stmt = null;
		int n = 0;
		try {
			stmt = con.prepareStatement("INSERT INTO Phim(maPhim, tenPhim, ngayKhoiChieu, ngayKetThuc, quocGia, thoiLuong, gioiHanTuoi, namSX, hinhAnh, theLoai)"
					+ "		VALUES (0, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			stmt.setString(1, phim.getTenPhim());
			stmt.setString(2, phim.getQuocGia());
			stmt.setInt(3, phim.getThoiLuong());
			stmt.setString(4, phim.getNgayKhoiChieu());
			stmt.setString(5, phim.getNgayKetThuc());
			stmt.setInt(6, phim.getGioiHanTuoi());
			stmt.setInt(7, phim.getNamSX());
			stmt.setString(8, phim.getTheLoai());
			stmt.setString(9, phim.getHinhAnh());
			n = stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
		return n > 0;
	}
	public static boolean updatePhim(PhimTEST phim) {
		Connection con = ConnectSQL.getConnection();
		PreparedStatement stmt = null;
		int n = 0;
		try {
			String sql =  "update Phim" + " set tenPhim = ?" + ", quocGia=?" + ", thoiLuong=?" + ", ngayKhoiChieu=?" + ", ngayKetThuc=?" + ", gioiHanTuoi=?" + ", namSX=?" + ", theLoai=?" + ", hinhAnh=?" + " where maPhim = ?";
			stmt = con.prepareStatement(sql);
			//System.out.println(sql);
			stmt.setString(1, phim.getTenPhim());
			stmt.setString(2, phim.getQuocGia());
			stmt.setInt(3, phim.getThoiLuong());
			stmt.setString(4, phim.getNgayKhoiChieu());
			stmt.setString(5, phim.getNgayKetThuc());
			stmt.setInt(6, phim.getGioiHanTuoi());
			stmt.setInt(7, phim.getNamSX());
			stmt.setString(8, phim.getTheLoai());
			stmt.setString(9, phim.getHinhAnh());
			stmt.setInt(10, phim.getMaPhim());
			n = stmt.executeUpdate();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return n > 0;
	}
}
