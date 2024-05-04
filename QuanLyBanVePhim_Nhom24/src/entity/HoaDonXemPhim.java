package entity;

import java.util.ArrayList;
import java.util.Objects;

public class HoaDonXemPhim {
	private int maHDXemPhim;
	private double thue;
	private SuatChieu suatchieu;
	private ArrayList<Ghe> ghe;
	private Voucher voucher;
	public HoaDonXemPhim() {
		super();
		// TODO Auto-generated constructor stub
	}



	public HoaDonXemPhim(int maHDXemPhim, double thue, SuatChieu suatchieu, ArrayList<Ghe> ghe, Voucher voucher) {
		super();
		this.maHDXemPhim = maHDXemPhim;
		this.thue = thue;
		this.suatchieu = suatchieu;
		this.ghe = ghe;
		this.voucher = voucher;
	}



	public HoaDonXemPhim(int maHDXemPhim) {
		super();
		this.maHDXemPhim = maHDXemPhim;
	}



	@Override
	public int hashCode() {
		return Objects.hash(maHDXemPhim);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HoaDonXemPhim other = (HoaDonXemPhim) obj;
		return maHDXemPhim == other.maHDXemPhim;
	}



	@Override
	public String toString() {
		return "HoaDonXemPhim [maHDXemPhim=" + maHDXemPhim + ", thue=" + thue + ", suatchieu=" + suatchieu + ", ghe="
				+ ghe + ", voucher=" + voucher + "]";
	}



	public int getMaHDXemPhim() {
		return maHDXemPhim;
	}



	public void setMaHDXemPhim(int maHDXemPhim) {
		this.maHDXemPhim = maHDXemPhim;
	}



	public double getThue() {
		return thue;
	}
	public void setThue(double thue) {
		this.thue = thue;
	}
	public SuatChieu getSuatchieu() {
		return suatchieu;
	}
	public void setSuatchieu(SuatChieu suatchieu) {
		this.suatchieu = suatchieu;
	}
	public ArrayList<Ghe> getGhe() {
		return ghe;
	}
	public void setGhe(ArrayList<Ghe> ghe) {
		this.ghe = ghe;
	}
	public Voucher getVoucher() {
		return voucher;
	}
	public void setVoucher(Voucher voucher) {
		this.voucher = voucher;
	}
	
	public int soLuongGhe() {
		return ghe.size();
	}
	
	
}
