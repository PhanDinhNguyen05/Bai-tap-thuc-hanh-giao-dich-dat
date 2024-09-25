package Tuan7;

import java.time.LocalDate;

public class GiaoDichdat extends GiaoDich {    
	private String loaiDat;
    
	public String getLoaiDat() {
		return loaiDat;
	}

	public void setLoaiDat(String loaiDat) {
		this.loaiDat = loaiDat;
	}
// Ham Tao
	
	@Override
	public double getThanhTien() {
		if(getLoaiDat()=="A") {
			return getDienTich()*getDonGia()*1.5;
		}else {
			return getDienTich()*getDonGia();
		}
	}
	public GiaoDichdat(String ma, LocalDate ngayGD, double dienTich, double donGia, String loaiDat)
			throws IllegalAccessException {
		super(ma, ngayGD, dienTich, donGia);
		this.loaiDat = loaiDat;
	}

	@Override
	public String toString() {
		String s="";
		s+=s.format("|%10s|%10s|",getLoaiDat(),getThanhTien());
		return super.toString();
	}
  
}
