package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connectDB.ConnectSQL;
import entity.NhanVien;

public class NhanVien_DAO {
	ArrayList<NhanVien> dsnv;
	public NhanVien_DAO() {
		dsnv = new ArrayList<NhanVien>();
	}
	public static boolean addNhanVien(NhanVien nv) {
		Connection con = ConnectSQL.getConnection();
		PreparedStatement stmt = null;
		int n = 0;
		try {
			stmt = con.prepareStatement("insert into nhanvien(maNhanVien, maDangNhap, maChucVu,  tenNV\r\n"
					+ ", email, ngaySinh, phai, sdt) \r\n"
					+ "values (0 , ?, 2, ?, ?, ?, ?, ?)");
			stmt.setString(1, nv.getTaiKhoan().getTenDangNhap());
			stmt.setString(2, nv.getTenNV());
			stmt.setString(3, nv.getEmail());
			stmt.setString(4, nv.getNgaySinh());
			stmt.setBoolean(5, nv.isPhai());
			stmt.setString(6, nv.getSdt());
			n = stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
		return n > 0;
	}
	public static boolean updateNhanVien(NhanVien nv) throws SQLException {
		Connection con = ConnectSQL.connect();
		int n = 0;
		try {
			String sql = "update NhanVien set tenNV=?, email =?, ngaySinh =?, phai =?, sdt =? where maNhanVien =?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, nv.getTenNV());
			ps.setString(2, nv.getEmail());
			ps.setString(3, nv.getNgaySinh());
			ps.setBoolean(4, nv.isPhai());
			ps.setString(5, nv.getSdt());
			ps.setInt(6, nv.getMaNV());		
			
			n = ps.executeUpdate();
			ps.close();		
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return n > 0;
	} 
	public static ArrayList<NhanVien> timMaNVTheoTen(String tenNV) {
		ArrayList<NhanVien> dsnv = new ArrayList<NhanVien>();
		ConnectSQL.getInstance();
		Connection con = ConnectSQL.getConnection();
		try {
			String sql = "Select * from NhanVien where tenNV = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, tenNV);
			// Thực thi câu lệnh sql
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int maNV = rs.getInt(1);
				int maDangNhap = rs.getInt(2);
				int maChucVu = rs.getInt(3);
				String tenNhanVien = rs.getString(4);
				String ngaySinh = rs.getString(5);
				boolean phai = rs.getBoolean(6);
				String sdt = rs.getString(7);
				String email = rs.getString(8);
				NhanVien nv = new NhanVien(maNV, tenNV, ngaySinh, phai, sdt, email, null, null);
				dsnv.add(nv);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return dsnv;
	}
}
