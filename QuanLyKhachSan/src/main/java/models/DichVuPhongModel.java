package models;

import javax.persistence.ManyToOne;

import entities.DonViTinh;
import entities.HoaDon;
import entities.KhachHang;
import entities.Phong;
import entities.SanPhamVaDichVu;

public class DichVuPhongModel {
	private HoaDonModel hoaDonModel;
	private SanPhamVaDichVuModel sanPhamVaDichVuModel;
	private PhongModel phongModel;
	private KhachHangModel khachHangModel;
	private DonViTinhModel donViTinhModel;
	private double giaBan;
	private int soLuong;
	public HoaDonModel getHoaDonModel() {
		return hoaDonModel;
	}
	public void setHoaDonModel(HoaDonModel hoaDonModel) {
		this.hoaDonModel = hoaDonModel;
	}
	public SanPhamVaDichVuModel getSanPhamVaDichVuModel() {
		return sanPhamVaDichVuModel;
	}
	public void setSanPhamVaDichVuModel(SanPhamVaDichVuModel sanPhamVaDichVuModel) {
		this.sanPhamVaDichVuModel = sanPhamVaDichVuModel;
	}
	public PhongModel getPhongModel() {
		return phongModel;
	}
	public void setPhongModel(PhongModel phongModel) {
		this.phongModel = phongModel;
	}
	public KhachHangModel getKhachHangModel() {
		return khachHangModel;
	}
	public void setKhachHangModel(KhachHangModel khachHangModel) {
		this.khachHangModel = khachHangModel;
	}
	public DonViTinhModel getDonViTinhModel() {
		return donViTinhModel;
	}
	public void setDonViTinhModel(DonViTinhModel donViTinhModel) {
		this.donViTinhModel = donViTinhModel;
	}
	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	
	
}
