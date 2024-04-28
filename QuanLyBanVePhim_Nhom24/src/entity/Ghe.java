package entity;

import java.util.Objects;

public class Ghe {
	private int maGhe;
	private String loaiGhe;
	private int trangThai;
	public Ghe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ghe(int maGhe) {
		super();
		this.maGhe = maGhe;
	}
	public Ghe(int maGhe, String loaiGhe, int trangThai) {
		super();
		this.maGhe = maGhe;
		this.loaiGhe = loaiGhe;
		this.trangThai = trangThai;
	}
	public int getMaGhe() {
		return maGhe;
	}
	public void setMaGhe(int maGhe) {
		this.maGhe = maGhe;
	}
	public String getLoaiGhe() {
		return loaiGhe;
	}
	public void setLoaiGhe(String loaiGhe) {
		this.loaiGhe = loaiGhe;
	}
	public int getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(int trangThai) {
		this.trangThai = trangThai;
	}
	@Override
	public int hashCode() {
		return Objects.hash(maGhe);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ghe other = (Ghe) obj;
		return maGhe == other.maGhe;
	}
	@Override
	public String toString() {
		return "Ghe [maGhe=" + maGhe + ", loaiGhe=" + loaiGhe + ", trangThai=" + trangThai + "]";
	}
	
	
}
