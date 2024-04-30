package entity;

import java.util.ArrayList;
import java.util.Objects;

public class VePhim {
	private int maVePhim;
	private Thue thue;
	private SuatChieu suatchieu;
	private ArrayList<Ghe> ghe;
	private Voucher voucher;
	public VePhim() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VePhim(int maVePhim) {
		super();
		this.maVePhim = maVePhim;
	}
	public VePhim(int maVePhim, Thue thue, SuatChieu suatchieu, ArrayList<Ghe> ghe) {
		super();
		this.maVePhim = maVePhim;
		this.thue = thue;
		this.suatchieu = suatchieu;
		this.ghe = ghe;
	}
	public VePhim(int maVePhim, Thue thue, SuatChieu suatchieu, ArrayList<Ghe> ghe, Voucher voucher) {
		super();
		this.maVePhim = maVePhim;
		this.thue = thue;
		this.suatchieu = suatchieu;
		this.ghe = ghe;
		this.voucher = voucher;
	}
	public int getMaVePhim() {
		return maVePhim;
	}
	public void setMaVePhim(int maVePhim) {
		this.maVePhim = maVePhim;
	}
	public Thue getThue() {
		return thue;
	}
	public void setThue(Thue thue) {
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
	@Override
	public int hashCode() {
		return Objects.hash(maVePhim);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VePhim other = (VePhim) obj;
		return maVePhim == other.maVePhim;
	}
	@Override
	public String toString() {
		return "VePhim [maVePhim=" + maVePhim + ", thue=" + thue + ", suatchieu=" + suatchieu + ", ghe=" + ghe
				+ ", voucher=" + voucher + "]";
	}
	
	public int soLuongGhe() {
		return ghe.size();
	}
	
	
}
