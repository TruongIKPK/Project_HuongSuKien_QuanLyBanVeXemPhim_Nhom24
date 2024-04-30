package entity;

import java.util.Objects;

public class Phim {
	private int maPhim;
	private String tenPhim;
	private String ngayKhoiChieu;
	private String ngayKetThuc;
	public Phim() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Phim(int maPhim) {
		super();
		this.maPhim = maPhim;
	}
	public Phim(int maPhim, String tenPhim, String ngayKhoiChieu, String ngayKetThuc) {
		super();
		this.maPhim = maPhim;
		this.tenPhim = tenPhim;
		this.ngayKhoiChieu = ngayKhoiChieu;
		this.ngayKetThuc = ngayKetThuc;
	}
	public int getMaPhim() {
		return maPhim;
	}
	public void setMaPhim(int maPhim) {
		this.maPhim = maPhim;
	}
	public String getTenPhim() {
		return tenPhim;
	}
	public void setTenPhim(String tenPhim) {
		this.tenPhim = tenPhim;
	}
	public String getNgayKhoiChieu() {
		return ngayKhoiChieu;
	}
	public void setNgayKhoiChieu(String ngayKhoiChieu) {
		this.ngayKhoiChieu = ngayKhoiChieu;
	}
	public String getNgayKetThuc() {
		return ngayKetThuc;
	}
	public void setNgayKetThuc(String ngayKetThuc) {
		this.ngayKetThuc = ngayKetThuc;
	}
	@Override
	public int hashCode() {
		return Objects.hash(maPhim);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Phim other = (Phim) obj;
		return maPhim == other.maPhim;
	}
	@Override
	public String toString() {
		return "Phim [maPhim=" + maPhim + ", tenPhim=" + tenPhim + ", ngayKhoiChieu=" + ngayKhoiChieu + ", ngayKetThuc="
				+ ngayKetThuc + "]";
	}
	
	
}
