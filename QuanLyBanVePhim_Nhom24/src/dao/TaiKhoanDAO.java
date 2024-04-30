package dao;

import java.sql.ResultSet;

import connect.ConnectDB;
import entity.TaiKhoan;
public class TaiKhoanDAO extends ConnectDB{
	private ResultSet resultSet;
	private ConnectDB dataBaseUtils;
	private static TaiKhoanDAO instance;
	
	public TaiKhoanDAO() {
        super();
        this.dataBaseUtils = new ConnectDB(); 
    }

	public TaiKhoan getTaiKhoan(String tenTaiKhoan) throws Exception {
	    dataBaseUtils.connect();
	    TaiKhoan taiKhoan = null; 
	    String sql = String.format("SELECT * FROM TaiKhoan JOIN NhanVien\r\n"
	            + "ON TaiKhoan.maDangNhap = NhanVien.maDangNhap \r\n"
	            + "WHERE tenDangNhap = '%s'", tenTaiKhoan);
	    try {
	        resultSet = dataBaseUtils.excuteQueryRead(sql);
	        resultSet.next();
            taiKhoan = new TaiKhoan();
            taiKhoan.setTenDangNhap(resultSet.getString("tenDangNhap"));
            taiKhoan.setMatKhau(resultSet.getString("matKhau"));
            taiKhoan.setKichHoat(resultSet.getBoolean("trangThai"));
            taiKhoan.setMaNV(resultSet.getInt("maNhanVien"));
	    } catch (Exception e) {
	        throw new Exception("Không tìm thấy tài khoản");
	    } finally {
	        if (resultSet != null) {
	            resultSet.close();
	        }
	        dataBaseUtils.disconnect();
	    }
	    return taiKhoan;
	}
	
	public static TaiKhoanDAO getInstance() {
        if (instance == null) {
            synchronized (TaiKhoanDAO.class) {
                if (null == instance) {
                    instance = new TaiKhoanDAO();
                }
            }
        }
        return instance;
    }
}
