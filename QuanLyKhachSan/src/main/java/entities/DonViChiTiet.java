package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@IdClass(DonViChiTiet.class)
public class DonViChiTiet implements Serializable{
	@Id
	@ManyToOne
	DonViTinh donViTinh;
	@Id
	@ManyToOne
	SanPhamVaDichVu sanPhamVaDichVu;
	private int giaTriQuyDoi;
	private double giaBan;
	private String trangThai;
	
	public DonViChiTiet(DonViTinh donViTinh, SanPhamVaDichVu sanPhamVaDichVu, int giaTriQuyDoi, double giaBan,
			String trangThai) {
		this.donViTinh = donViTinh;
		this.sanPhamVaDichVu = sanPhamVaDichVu;
		this.giaTriQuyDoi = giaTriQuyDoi;
		this.giaBan = giaBan;
		this.trangThai = trangThai;
	}
	public DonViChiTiet() {
		
	}
	public DonViTinh getDonViTinh() {
		return donViTinh;
	}
	public void setDonViTinh(DonViTinh donViTinh) {
		this.donViTinh = donViTinh;
	}
	public SanPhamVaDichVu getSanPhamVaDichVu() {
		return sanPhamVaDichVu;
	}
	public void setSanPhamVaDichVu(SanPhamVaDichVu sanPhamVaDichVu) {
		this.sanPhamVaDichVu = sanPhamVaDichVu;
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
		return "DonViChiTiet [donViTinh=" + donViTinh + ", sanPhamVaDichVu=" + sanPhamVaDichVu + ", giaTriQuyDoi="
				+ giaTriQuyDoi + ", giaBan=" + giaBan + ", trangThai=" + trangThai + "]";
	}
	
	
}
