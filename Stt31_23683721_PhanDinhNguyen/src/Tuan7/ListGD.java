package Tuan7;

import java.util.ArrayList;
import java.util.List;

public class ListGD {
     List<GiaoDich> ls;
     public ListGD() {
    	 ls = new ArrayList<GiaoDich>(2);
    	 
     }
	public boolean themGD(GiaoDich g) {
	if(ls.contains(g)==true) {	
        return false; 		
	}else {
		return ls.add(g);
	}
}
	//xuat giao dich
	public List<GiaoDich> getAll(){
		return ls;
	}
	//Sap xep
	public GiaoDich tim(String ma) {
		for(GiaoDich giaodich : ls) {
			if(giaodich.getMaGD().equalsIgnoreCase(ma));
			return giaodich;
		}
		return null;
	}
	// xoa Giap dih theo ma
	public boolean xoaGD(GiaoDich g) {
		if(tim(g.maGD)!=null) {
			ls.remove(g);
		}else {
			return false;
		}
		return false;
	}
}
