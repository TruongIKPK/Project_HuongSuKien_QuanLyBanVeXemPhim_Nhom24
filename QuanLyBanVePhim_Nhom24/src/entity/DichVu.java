package entity;

import java.util.Objects;

public class DichVu {
	private int maDichVu;
	private String tenDichVu;
	private double giaBan;
	public DichVu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DichVu(int maDichVu) {
		super();
		this.maDichVu = maDichVu;
	}
	public DichVu(int maDichVu, String tenDichVu, double giaBan) {
		super();
		this.maDichVu = maDichVu;
		this.tenDichVu = tenDichVu;
		this.giaBan = giaBan;
	}
	public int getMaDichVu() {
		return maDichVu;
	}
	public void setMaDichVu(int maDichVu) {
		this.maDichVu = maDichVu;
	}
	public String getTenDichVu() {
		return tenDichVu;
	}
	public void setTenDichVu(String tenDichVu) {
		this.tenDichVu = tenDichVu;
	}
	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
	@Override
	public int hashCode() {
		return Objects.hash(maDichVu);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DichVu other = (DichVu) obj;
		return maDichVu == other.maDichVu;
	}
	@Override
	public String toString() {
		return "DichVu [maDichVu=" + maDichVu + ", tenDichVu=" + tenDichVu + ", giaBan=" + giaBan + "]";
	}

	
	
}
