package entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Phong {
	@Id
	private int maPhong;
	@ManyToOne
	private LoaiPhong loaiPhong;
	private String trangThai;
	@ManyToOne
	private Tang tang;
	@OneToMany (mappedBy = "phong")
	private List<KhachTrongPhong> listKhachTrongPhong;
	@OneToMany (mappedBy = "phong")
	private List<DichVuPhong> listDichVuPhong;
	
	public Phong(int maPhong, LoaiPhong loaiPhong, String trangThai, Tang tang,
			List<KhachTrongPhong> listKhachTrongPhong, List<DichVuPhong> listDichVuPhong) {
		this.maPhong = maPhong;
		this.loaiPhong = loaiPhong;
		this.trangThai = trangThai;
		this.tang = tang;
		this.listKhachTrongPhong = listKhachTrongPhong;
		this.listDichVuPhong = listDichVuPhong;
	}
	public Phong() {
		
	}
	public int getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(int maPhong) {
		this.maPhong = maPhong;
	}
	public LoaiPhong getLoaiPhong() {
		return loaiPhong;
	}
	public void setLoaiPhong(LoaiPhong loaiPhong) {
		this.loaiPhong = loaiPhong;
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	public Tang getTang() {
		return tang;
	}
	public void setTang(Tang tang) {
		this.tang = tang;
	}
	public List<KhachTrongPhong> getListKhachTrongPhong() {
		return listKhachTrongPhong;
	}
	public void setListKhachTrongPhong(List<KhachTrongPhong> listKhachTrongPhong) {
		this.listKhachTrongPhong = listKhachTrongPhong;
	}
	public List<DichVuPhong> getListDichVuPhong() {
		return listDichVuPhong;
	}
	public void setListDichVuPhong(List<DichVuPhong> listDichVuPhong) {
		this.listDichVuPhong = listDichVuPhong;
	}
	@Override
	public String toString() {
		return "Phong [maPhong=" + maPhong + ", loaiPhong=" + loaiPhong + ", trangThai=" + trangThai + ", tang=" + tang
				+ ", listKhachTrongPhong=" + listKhachTrongPhong + ", listDichVuPhong=" + listDichVuPhong + "]";
	}
	
	
}
