package entity;

import java.util.Objects;

public class TaiKhoan {
	private String tenDangNhap;
	private String matKhau;
	private boolean kichHoat;
	private int maNV;
	public TaiKhoan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TaiKhoan(String tenDangNhap) {
		super();
		this.tenDangNhap = tenDangNhap;
	}

	public int getMaNV() {
		return maNV;
	}
	public void setMaNV(int maNV) {
		this.maNV = maNV;
	}
	public TaiKhoan(String tenDangNhap, String matKhau, boolean kichHoat, int maNV) {
		super();
		this.tenDangNhap = tenDangNhap;
		this.matKhau = matKhau;
		this.kichHoat = kichHoat;
		this.maNV = maNV;
	}
	@Override
	public int hashCode() {
		return Objects.hash(tenDangNhap);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TaiKhoan other = (TaiKhoan) obj;
		return Objects.equals(tenDangNhap, other.tenDangNhap);
	}
	public String getTenDangNhap() {
		return tenDangNhap;
	}
	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public boolean isKichHoat() {
		return kichHoat;
	}
	public void setKichHoat(boolean kichHoat) {
		this.kichHoat = kichHoat;
	}
	@Override
	public String toString() {
		return "TaiKhoan [tenDangNhap=" + tenDangNhap + ", matKhau=" + matKhau + ", kichHoat=" + kichHoat + "]";
	}
	
	// Còn kiemTraTaiKhoan 
}
