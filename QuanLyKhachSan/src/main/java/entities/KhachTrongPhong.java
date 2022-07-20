package entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class KhachTrongPhong {
	@ManyToOne
	private HoaDon hoaDon;
	@ManyToOne
	private KhachHang khachHang;
	@ManyToOne
	private Phong phong;
	private Date ngayCheckOut;
	private double giaPhong;
	private double phuPhi;
	private String ghiChu;
	
	public KhachTrongPhong(HoaDon hoaDon, KhachHang khachHang, Phong phong, Date ngayCheckOut, double giaPhong,
			double phuPhi, String ghiChu) {
		this.hoaDon = hoaDon;
		this.khachHang = khachHang;
		this.phong = phong;
		this.ngayCheckOut = ngayCheckOut;
		this.giaPhong = giaPhong;
		this.phuPhi = phuPhi;
		this.ghiChu = ghiChu;
	}
	
	public KhachTrongPhong() {
		
	}

	public HoaDon getHoaDon() {
		return hoaDon;
	}

	public void setHoaDon(HoaDon hoaDon) {
		this.hoaDon = hoaDon;
	}

	public KhachHang getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}

	public Phong getPhong() {
		return phong;
	}

	public void setPhong(Phong phong) {
		this.phong = phong;
	}

	public Date getNgayCheckOut() {
		return ngayCheckOut;
	}

	public void setNgayCheckOut(Date ngayCheckOut) {
		this.ngayCheckOut = ngayCheckOut;
	}

	public double getGiaPhong() {
		return giaPhong;
	}

	public void setGiaPhong(double giaPhong) {
		this.giaPhong = giaPhong;
	}

	public double getPhuPhi() {
		return phuPhi;
	}

	public void setPhuPhi(double phuPhi) {
		this.phuPhi = phuPhi;
	}

	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	@Override
	public String toString() {
		return "KhachTrongPhong [hoaDon=" + hoaDon + ", khachHang=" + khachHang + ", phong=" + phong + ", ngayCheckOut="
				+ ngayCheckOut + ", giaPhong=" + giaPhong + ", phuPhi=" + phuPhi + ", ghiChu=" + ghiChu + "]";
	}
	
	
}
