package models;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import entities.DonViTinh;
import entities.SanPhamVaDichVu;

public class DonViChiTietModel {
	DonViTinhModel donViTinhModel;
	SanPhamVaDichVuModel sanPhamVaDichVuModel;
	private int giaTriQuyDoi;
	private double giaBan;
	private String trangThai;
	
	public DonViChiTietModel(DonViTinhModel donViTinhModel, SanPhamVaDichVuModel sanPhamVaDichVuModel, int giaTriQuyDoi,
			double giaBan, String trangThai) {
		this.donViTinhModel = donViTinhModel;
		this.sanPhamVaDichVuModel = sanPhamVaDichVuModel;
		this.giaTriQuyDoi = giaTriQuyDoi;
		this.giaBan = giaBan;
		this.trangThai = trangThai;
	}
	public DonViChiTietModel() {
	}
	public DonViTinhModel getDonViTinhModel() {
		return donViTinhModel;
	}
	public void setDonViTinhModel(DonViTinhModel donViTinhModel) {
		this.donViTinhModel = donViTinhModel;
	}
	public SanPhamVaDichVuModel getSanPhamVaDichVuModel() {
		return sanPhamVaDichVuModel;
	}
	public void setSanPhamVaDichVuModel(SanPhamVaDichVuModel sanPhamVaDichVuModel) {
		this.sanPhamVaDichVuModel = sanPhamVaDichVuModel;
	}
	public int getGiaTriQuyDoi() {
		return giaTriQuyDoi;
	}
	public void setGiaTriQuyDoi(int giaTriQuyDoi) {
		this.giaTriQuyDoi = giaTriQuyDoi;
	}
	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	@Override
	public String toString() {
		return "DonViChiTietModel [donViTinhModel=" + donViTinhModel + ", sanPhamVaDichVuModel=" + sanPhamVaDichVuModel
				+ ", giaTriQuyDoi=" + giaTriQuyDoi + ", giaBan=" + giaBan + ", trangThai=" + trangThai + "]";
	}
	
	
	
}
