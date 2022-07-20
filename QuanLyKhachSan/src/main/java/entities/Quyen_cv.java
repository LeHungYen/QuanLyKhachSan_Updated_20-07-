package entities;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Quyen_cv {
	@ManyToOne
	private Quyen quyen;
	@ManyToOne
	private ChucVu chucVu;
	public Quyen_cv(Quyen quyen, ChucVu chucVu) {
		this.quyen = quyen;
		this.chucVu = chucVu;
	}
	public Quyen_cv() {
	}
	public Quyen getQuyen() {
		return quyen;
	}
	public void setQuyen(Quyen quyen) {
		this.quyen = quyen;
	}
	public ChucVu getChucVu() {
		return chucVu;
	}
	public void setChucVu(ChucVu chucVu) {
		this.chucVu = chucVu;
	}
	@Override
	public String toString() {
		return "Quyen_cv [quyen=" + quyen + ", chucVu=" + chucVu + "]";
	}
	
	
}
