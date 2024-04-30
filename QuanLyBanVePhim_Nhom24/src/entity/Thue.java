package entity;

import java.util.Objects;

public class Thue {
	private int maThue;
	private double phanTramThue;
	public Thue() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Thue(int maThue) {
		super();
		this.maThue = maThue;
	}
	public Thue(int maThue, double phanTramThue) {
		super();
		this.maThue = maThue;
		this.phanTramThue = phanTramThue;
	}
	public int getMaThue() {
		return maThue;
	}
	public void setMaThue(int maThue) {
		this.maThue = maThue;
	}
	public double getPhanTramThue() {
		return phanTramThue;
	}
	public void setPhanTramThue(double phanTramThue) {
		this.phanTramThue = phanTramThue;
	}
	@Override
	public int hashCode() {
		return Objects.hash(maThue);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Thue other = (Thue) obj;
		return maThue == other.maThue;
	}
	@Override
	public String toString() {
		return "Thue [maThue=" + maThue + ", phanTramThue=" + phanTramThue + "]";
	}
	
	
}
