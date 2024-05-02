package dao;

import java.sql.ResultSet;
import java.util.ArrayList;

import connect.ConnectDB;
import entity.ChucVu;
import entity.NhanVien;
import entity.TaiKhoan;

public class NhanVienDAO {
	private ResultSet resultSet;
	private ConnectDB dataBaseUtils;
	private static NhanVienDAO instance;
	
	public NhanVienDAO() {
        super();
        this.dataBaseUtils = new ConnectDB(); 
    }

	public NhanVien getNhanVien(int maNhanVien) throws Exception {
	    dataBaseUtils.connect();
	    NhanVien nhanVien = null; 
	    String sql = String.format("SELECT * FROM NhanVien\r\n"
	            + "WHERE maNhanVien = '%s'", maNhanVien);
	    try {
	        resultSet = dataBaseUtils.excuteQueryRead(sql);
	        resultSet.next();
	        nhanVien = new NhanVien();
	        nhanVien.setMaNV(resultSet.getInt("maNhanVien"));
	        
	        TaiKhoan taiKhoan = new TaiKhoan();
	        taiKhoan.setMaTaiKhoan((resultSet.getInt("maDangNhap")));
	        nhanVien.setTaiKhoan(taiKhoan);
	        
	        ChucVu chucVu = new ChucVu();
	        chucVu.setMaChucVu((resultSet.getInt("maChucVu")));
	        nhanVien.setChucVu(chucVu);
	        
	        nhanVien.setTenNV(resultSet.getString("tenNV"));
	        
	        nhanVien.setNgaySinh(resultSet.getString("ngaySinh"));
	        
	        nhanVien.setPhai(resultSet.getBoolean("phai"));
	        nhanVien.setSdt(resultSet.getString("sdt"));
	        nhanVien.setEmail(resultSet.getString("email"));
	        
	    } catch (Exception e) {
	        throw new Exception("Không tìm thấy tài khoản");
	    } finally {
	        if (resultSet != null) {
	            resultSet.close();
	        }
	        dataBaseUtils.disconnect();
	    }
	    return nhanVien;
	}
	public NhanVien getNhanVienDN(int maDangNhap) throws Exception {
	    dataBaseUtils.connect();
	    NhanVien nhanVien = null; 
	    String sql = String.format("SELECT * FROM NhanVien\r\n"
	            + "WHERE maDangNhap = '%s'", maDangNhap);
	    try {
	        resultSet = dataBaseUtils.excuteQueryRead(sql);
	        resultSet.next();
	        nhanVien = new NhanVien();
	        nhanVien.setMaNV(resultSet.getInt("maNhanVien"));
	        
	        TaiKhoan taiKhoan = new TaiKhoan();
	        taiKhoan.setMaTaiKhoan((resultSet.getInt("maDangNhap")));
	        nhanVien.setTaiKhoan(taiKhoan);
	        
	        ChucVu chucVu = new ChucVu();
	        chucVu.setMaChucVu((resultSet.getInt("maChucVu")));
	        nhanVien.setChucVu(chucVu);
	        
	        nhanVien.setTenNV(resultSet.getString("tenNV"));
	        
	        nhanVien.setNgaySinh(resultSet.getString("ngaySinh"));
	        
	        nhanVien.setPhai(resultSet.getBoolean("phai"));
	        nhanVien.setSdt(resultSet.getString("sdt"));
	        nhanVien.setEmail(resultSet.getString("email"));
	        
	    } catch (Exception e) {
	        throw new Exception("Không tìm thấy tài khoản");
	    } finally {
	        if (resultSet != null) {
	            resultSet.close();
	        }
	        dataBaseUtils.disconnect();
	    }
	    return nhanVien;
	}
	public ArrayList<NhanVien> getNhanViens() throws Exception {
        ArrayList<NhanVien> nhanViens = new ArrayList<>();
        String sql = String.format("SELECT * FROM NhanVien");

        try {
            resultSet = dataBaseUtils.excuteQueryRead(sql);
            
            while (resultSet.next()) {
                ChucVu chucVu = new ChucVu(resultSet.getInt("maChucVu"));
                TaiKhoan taiKhoan = new TaiKhoan(resultSet.getInt("maDangNhap"));
                
            	NhanVien nhanVien = new NhanVien(
            			resultSet.getInt("maNhanVien"),
                		resultSet.getString("tenNV"),
                		resultSet.getString("ngaySinh"),
                		resultSet.getBoolean("phai"),
                		resultSet.getString("sdt"),
                		resultSet.getString("email"),
                		chucVu,
                		taiKhoan   
            	);
                nhanViens.add(nhanVien);
            }
        } catch (Exception e) {
            throw new Exception("Lỗi lấy danh sách nhân viên");
        } finally {
            resultSet.close();
        }

        return nhanViens;
    }
	public static NhanVienDAO getInstance() {
        if (instance == null) {
            synchronized (NhanVienDAO.class) {
                if (null == instance) {
                    instance = new NhanVienDAO();
                }
            }
        }
        return instance;
    }
}
