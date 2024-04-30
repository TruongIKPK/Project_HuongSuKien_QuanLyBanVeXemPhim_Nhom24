package entity;

import java.util.ArrayList;
import java.util.Objects;

public class VeDichVu {
	private int maVeDichVu;
	private Thue thue;
	private ArrayList<DichVu> dsDichVu;
	public VeDichVu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VeDichVu(int maVeDichVu, Thue thue, ArrayList<DichVu> dsDichVu) {
		super();
		this.maVeDichVu = maVeDichVu;
		this.thue = thue;
		this.dsDichVu = dsDichVu;
	}
	public VeDichVu(int maVeDichVu) {
		super();
		this.maVeDichVu = maVeDichVu;
	}
	public int getMaVeDichVu() {
		return maVeDichVu;
	}
	public void setMaVeDichVu(int maVeDichVu) {
		this.maVeDichVu = maVeDichVu;
	}
	public Thue getThue() {
		return thue;
	}
	public void setThue(Thue thue) {
		this.thue = thue;
	}
	public ArrayList<DichVu> getDsDichVu() {
		return dsDichVu;
	}
	public void setDsDichVu(ArrayList<DichVu> dsDichVu) {
		this.dsDichVu = dsDichVu;
	}
	@Override
	public int hashCode() {
		return Objects.hash(maVeDichVu);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VeDichVu other = (VeDichVu) obj;
		return maVeDichVu == other.maVeDichVu;
	}
	@Override
	public String toString() {
		return "VeDichVu [maVeDichVu=" + maVeDichVu + ", thue=" + thue + ", dsDichVu=" + dsDichVu + "]";
	}
	
	
	
}
