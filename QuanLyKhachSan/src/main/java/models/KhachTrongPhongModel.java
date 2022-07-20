package models;

import java.sql.Date;

import javax.persistence.ManyToOne;

import entities.HoaDon;
import entities.KhachHang;
import entities.Phong;

public class KhachTrongPhongModel {
	private HoaDonModel hoaDonModel;
	private KhachHangModel khachHangModel;
	private PhongModel phongModel;
	private Date ngayCheckOut;
	private double giaPhong;
	private double phuPhi;
	private String ghiChu;
	
	public KhachTrongPhongModel(HoaDonModel hoaDonModel, KhachHangModel khachHangModel, PhongModel phongModel,
			Date ngayCheckOut, double giaPhong, double phuPhi, String ghiChu) {
		this.hoaDonModel = hoaDonModel;
		this.khachHangModel = khachHangModel;
		this.phongModel = phongModel;
		this.ngayCheckOut = ngayCheckOut;
		this.giaPhong = giaPhong;
		this.phuPhi = phuPhi;
		this.ghiChu = ghiChu;
	}
	public KhachTrongPhongModel() {
	}
	public HoaDonModel getHoaDonModel() {
		return hoaDonModel;
	}
	public void setHoaDonModel(HoaDonModel hoaDonModel) {
		this.hoaDonModel = hoaDonModel;
	}
	public KhachHangModel getKhachHangModel() {
		return khachHangModel;
	}
	public void setKhachHangModel(KhachHangModel khachHangModel) {
		this.khachHangModel = khachHangModel;
	}
	public PhongModel getPhongModel() {
		return phongModel;
	}
	public void setPhongModel(PhongModel phongModel) {
		this.phongModel = phongModel;
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
		return "KhachTrongPhongModel [hoaDonModel=" + hoaDonModel + ", khachHangModel=" + khachHangModel
				+ ", ngayCheckOut=" + ngayCheckOut + ", giaPhong=" + giaPhong + ", phuPhi=" + phuPhi + ", ghiChu="
				+ ghiChu + "]";
	}
	
	
}
