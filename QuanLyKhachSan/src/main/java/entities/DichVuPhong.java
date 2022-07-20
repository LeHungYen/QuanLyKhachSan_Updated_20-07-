package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@IdClass(DichVuPhong.class)
public class DichVuPhong implements Serializable{
	@ManyToOne
	private HoaDon hoaDon;
	@ManyToOne
	private SanPhamVaDichVu sanPhamVaDichVu;
	@ManyToOne
	private Phong phong;
	@ManyToOne
	private KhachHang khachHang;
	@ManyToOne
	private DonViTinh donViTinh;
	private double giaBan;
	private int soLuong;
	
	public DichVuPhong(HoaDon hoaDon, SanPhamVaDichVu sanPhamVaDichVu, Phong phong, KhachHang khachHang,
			DonViTinh donViTinh, double giaBan, int soLuong) {
		this.hoaDon = hoaDon;
		this.sanPhamVaDichVu = sanPhamVaDichVu;
		this.phong = phong;
		this.khachHang = khachHang;
		this.donViTinh = donViTinh;
		this.giaBan = giaBan;
		this.soLuong = soLuong;
	}
	public DichVuPhong() {
		
	}
	public HoaDon getHoaDon() {
		return hoaDon;
	}
	public void setHoaDon(HoaDon hoaDon) {
		this.hoaDon = hoaDon;
	}
	public SanPhamVaDichVu getSanPhamVaDichVu() {
		return sanPhamVaDichVu;
	}
	public void setSanPhamVaDichVu(SanPhamVaDichVu sanPhamVaDichVu) {
		this.sanPhamVaDichVu = sanPhamVaDichVu;
	}
	public Phong getPhong() {
		return phong;
	}
	public void setPhong(Phong phong) {
		this.phong = phong;
	}
	public KhachHang getKhachHang() {
		return khachHang;
	}
	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}
	public DonViTinh getDonViTinh() {
		return donViTinh;
	}
	public void setDonViTinh(DonViTinh donViTinh) {
		this.donViTinh = donViTinh;
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
	@Override
	public String toString() {
		return "DichVuPhong [hoaDon=" + hoaDon + ", sanPhamVaDichVu=" + sanPhamVaDichVu + ", phong=" + phong
				+ ", khachHang=" + khachHang + ", donViTinh=" + donViTinh + ", giaBan=" + giaBan + ", soLuong="
				+ soLuong + "]";
	}
	
	
	
}