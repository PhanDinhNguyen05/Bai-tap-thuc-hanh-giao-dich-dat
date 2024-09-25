package Tuan7;

import java.time.LocalDate;
import java.util.Objects;

public abstract class GiaoDich {
      public abstract double getThanhTien();
      protected String maGD;
      protected LocalDate ngayGD;
      protected double dienTich;
      protected double donGia;
      // Dong goi
	public String getMaGD() {
		return maGD;
	}
	public void setMaGD(String ma) throws IllegalAccessException{
		if(ma!=null) {
			this.maGD = ma;
		}else {
			throw new IllegalAccessException("Loi ma");
		}
		
	}
	public LocalDate getNgayGD() {
		return ngayGD;
	}
	public void setNgayGD(LocalDate ngayGD) {
		this.ngayGD = ngayGD;
	}
	public double getDienTich() {
		return dienTich;
	}
	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
      // Ham Tao
	public GiaoDich() throws IllegalAccessException {
		this("",LocalDate.now(),0,0);
	}
	public GiaoDich(String ma, LocalDate ngayGD, double dienTich, double donGia) throws IllegalAccessException {
		if(ma!=null) {
			this.maGD = ma;
		}else {
			throw new IllegalAccessException("Loi ma");
		}
		this.ngayGD = ngayGD;
		this.dienTich = dienTich;
		this.donGia = donGia;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(maGD);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GiaoDich other = (GiaoDich) obj;
		return Objects.equals(maGD, other.maGD);
	}
	@Override
	public String toString() {
		String s="";
		s+=s.format("|%10s|%10s|%10s|%10s|",getMaGD(), getNgayGD(), getDienTich(),getDonGia());
	return super.toString();
	}
	
}
