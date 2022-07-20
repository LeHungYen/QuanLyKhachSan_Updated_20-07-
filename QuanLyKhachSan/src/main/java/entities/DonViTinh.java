package entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class DonViTinh{
	@Id
	private int maDonVi;
	private String tenDonVi;
	private String trangThai;
	@OneToMany(mappedBy = "donViTinh")
	private List<DonViChiTiet> listDonViChiTiet;
	@OneToMany(mappedBy = "donViTinh")
	private List<DichVuPhong> listDichVuPhong;
	
	public DonViTinh(int maDonVi, String tenDonVi, String trangThai, List<DonViChiTiet> listDonViChiTiet,
			List<DichVuPhong> listDichVuPhong) {
		this.maDonVi = maDonVi;
		this.tenDonVi = tenDonVi;
		this.trangThai = trangThai;
		this.listDonViChiTiet = listDonViChiTiet;
		this.listDichVuPhong = listDichVuPhong;
	}
	
	public DonViTinh() {
	}

	public int getMaDonVi() {
		return maDonVi;
	}

	public void setMaDonVi(int maDonVi) {
		this.maDonVi = maDonVi;
	}

	public String getTenDonVi() {
		return tenDonVi;
	}

	public void setTenDonVi(String tenDonVi) {
		this.tenDonVi = tenDonVi;
	}

	public String getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}

	public List<DonViChiTiet> getListDonViChiTiet() {
		return listDonViChiTiet;
	}

	public void setListDonViChiTiet(List<DonViChiTiet> listDonViChiTiet) {
		this.listDonViChiTiet = listDonViChiTiet;
	}

	public List<DichVuPhong> getListDichVuPhong() {
		return listDichVuPhong;
	}

	public void setListDichVuPhong(List<DichVuPhong> listDichVuPhong) {
		this.listDichVuPhong = listDichVuPhong;
	}

	@Override
	public String toString() {
		return "DonViTinh [maDonVi=" + maDonVi + ", tenDonVi=" + tenDonVi + ", trangThai=" + trangThai
				+ ", listDonViChiTiet=" + listDonViChiTiet + ", listDichVuPhong=" + listDichVuPhong + "]";
	}
	
	
	
	
}
