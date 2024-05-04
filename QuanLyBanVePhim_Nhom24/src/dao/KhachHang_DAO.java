package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import connect.ConnectDB;
import entity.KhachHang;
import entity.NhanVien;

public class KhachHang_DAO {
	ArrayList<KhachHang> dskh;
	
	public static boolean addKhachHang(KhachHang kh) {
		Connection con = ConnectDB.getConnection();
		PreparedStatement stmt = null;
		int n = 0;
		try {
			stmt = con.prepareStatement("insert into KhachHang(maKhachHang, tenKhachHang, phai, ngaySinh, sdt, diemTichLuy) "
					+ "values (0 , ?, ?, ?, ?, 0)");
			stmt.setString(1, kh.getTenKhachHang());
			stmt.setBoolean(2, kh.isPhai());
			stmt.setString(3, kh.getNgaySinh());
			stmt.setString(4, kh.getSdt());
			n = stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
		return n > 0;
	}
	public static boolean updateKhachHang(KhachHang kh) {
		Connection con = ConnectDB.getConnection();
		PreparedStatement stmt = null;
		int n = 0;
		try {
			String sql =  "update KhachHang" + " set tenKH = ?" + ", phai=?" + ", ngaySinh=?" + ", sdt=?" + " where maKH = ?";
			stmt = con.prepareStatement(sql);
			//System.out.println(sql);
			stmt.setString(1, kh.getTenKhachHang());
			stmt.setBoolean(2, kh.isPhai());
			stmt.setString(3, kh.getNgaySinh());
			stmt.setString(4, kh.getSdt());
			stmt.setInt(5, kh.getMaKhachHang());
			n = stmt.executeUpdate();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return n > 0;
	}
	public static KhachHang timTenKHTheoSDT(String sdtKH) {
		KhachHang khachHang = null;
            String query = "SELECT * FROM KhachHang WHERE sdt = ?";
            try (PreparedStatement preparedStatement = ConnectDB.con.prepareStatement(query)) {
                preparedStatement.setString(1, sdtKH);
                ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                	int maKH = resultSet.getInt("maKH");
                    String tenKH = resultSet.getString("tenKH");
                    boolean phai = resultSet.getBoolean("phai");
                    String ngaySinh = resultSet.getString("ngaySinh");
                    String sdt = resultSet.getString("sdt");
                    khachHang = new KhachHang(maKH, tenKH, phai, ngaySinh, sdt, maKH) ;
                }
            } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        return khachHang;
    }
}
