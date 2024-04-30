package entity;

import java.util.ArrayList;
import java.util.Objects;

public class PhongChieu {
	private int maPhong;
	private String tenPhong;
	private ArrayList<Ghe> ghe;
	private ArrayList<SuatChieu> suatChieu;
	public PhongChieu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PhongChieu(int maPhong) {
		super();
		this.maPhong = maPhong;
	}
	public PhongChieu(int maPhong, String tenPhong, ArrayList<Ghe> ghe, ArrayList<SuatChieu> suatChieu) {
		super();
		this.maPhong = maPhong;
		this.tenPhong = tenPhong;
		this.ghe = ghe;
		this.suatChieu = suatChieu;
	}
	public int getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(int maPhong) {
		this.maPhong = maPhong;
	}
	public String getTenPhong() {
		return tenPhong;
	}
	public void setTenPhong(String tenPhong) {
		this.tenPhong = tenPhong;
	}
	public ArrayList<Ghe> getGhe() {
		return ghe;
	}
	public void setGhe(ArrayList<Ghe> ghe) {
		this.ghe = ghe;
	}
	public ArrayList<SuatChieu> getSuatChieu() {
		return suatChieu;
	}
	public void setSuatChieu(ArrayList<SuatChieu> suatChieu) {
		this.suatChieu = suatChieu;
	}
	@Override
	public int hashCode() {
		return Objects.hash(maPhong);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhongChieu other = (PhongChieu) obj;
		return maPhong == other.maPhong;
	}
	@Override
	public String toString() {
		return "PhongChieu [maPhong=" + maPhong + ", tenPhong=" + tenPhong + ", ghe=" + ghe + ", suatChieu=" + suatChieu
				+ "]";
	}
	
	
}
