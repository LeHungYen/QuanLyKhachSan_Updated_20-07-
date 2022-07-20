package services;

import java.util.ArrayList;

import dao.NhanVienDao;
import entities.ChucVu;
import entities.SanPhamVaDichVu;
import entities.NhanVien;
import models.ChucVuModel;
import models.SanPhamVaDichVuModel;
import models.NhanVienModel;
import utils.IoCContainer;

public class NhanVienService implements INhanVienService {
	private IoCContainer ioCContainer = new IoCContainer();
	private ArrayList<NhanVienModel> _listNhanVienModels = new ArrayList<NhanVienModel>();
	private NhanVienDao _nhanVienDao = (NhanVienDao) ioCContainer.getBean(NhanVienDao.class.toString());
	private NhanVien _nhanVien;
	private NhanVienModel _nhanVienModel = (NhanVienModel) IoCContainer.getBean(NhanVienModel.class.toString());;
	private int _stt = 0;
	private int _maxID;
	
	public static NhanVien updateDataNhanVienDependOnNhanVienModel(NhanVienModel nhanVienModel) {
		NhanVien nhanVien = new NhanVien();
		nhanVien.setMaNV(nhanVienModel.getMaNV());
		nhanVien.setTenNV(nhanVienModel.getTenNV());
		nhanVien.setSdt(nhanVienModel.getSdt());
		nhanVien.setGioiTinh(nhanVienModel.getGioiTinh());
		nhanVien.setEmail(nhanVienModel.getEmail());
		nhanVien.setChucVu(nhanVienModel.getChucVuModel());
		nhanVien.setTrangThai(nhanVienModel.getTrangThai());
		nhanVien.setCmnd(nhanVienModel.getCmnd());
		nhanVien.setUserName(nhanVienModel.getUserName());
		nhanVien.setPassword(nhanVienModel.getPassword());
		nhanVien.setListPhieuNhapKho(nhanVienModel.getListPhieuNhapKhoModel());
		nhanVien.setListPhieuKiemKho(nhanVienModel.getListPhieuKiemKhoModel());
		nhanVien.getListHoaDon(nhanVienModel.getListHoaDonModel());
//		nhanVien.setNgaySinh(nhanVienModel.getNgaySinh());
		
	}
	
	public NhanVienModel updateDataNhanVienModelDependOnNhanVien(NhanVien nhanVien) {
		NhanVienModel nhanVienModel = new NhanVienModel();
		nhanVienModel.setMaNV(nhanVien.getMaNV());
		nhanVienModel.setTenNV(nhanVien.getTenNV());
		nhanVienModel.setSdt(nhanVien.getSdt());
		nhanVienModel.setGioiTinh(nhanVien.getGioiTinh());
		nhanVienModel.setEmail(nhanVien.getEmail());
		nhanVienModel.setChucVuModel(nhanVien.getChucVu());
		nhanVienModel.setTrangThai(nhanVien.getTrangThai());
		nhanVienModel.setCmnd(nhanVien.getCmnd());
		nhanVienModel.setUserName(nhanVien.getUserName());
		nhanVienModel.setPassword(nhanVien.getPassword());
		nhanVienModel.setListPhieuNhapKhoModel(nhanVien.getListPhieuNhapKho());
		nhanVienModel.setListPhieuKiemKhoModel(nhanVien.getListPhieuKiemKho());
		nhanVienModel.getListHoaDonModel(nhanVien.getListHoaDonModel());
//		nhanVienModel.setNgaySinh(nhanVienModel.getNgaySinh());
		
	}
	
	public void them(NhanVienModel nhanVienModel) {
		updateDataNhanVienDependOnNhanVienModel(nhanVienModel);
		_nhanVienDao.them(_nhanVien);
		nhanVienModel.setStt(_stt);
		_listNhanVienModels.add(_stt, nhanVienModel);
		_stt++;
	}

	public void sua(NhanVienModel nhanVienModel) {
		suaNhanVien(nhanVienModel);
		int stt = nhanVienModel.getStt();
		_listNhanVienModels.remove(stt);
		_listNhanVienModels.add(stt, nhanVienModel);
	}
	
	public void xoa(NhanVienModel nhanVienModel) {
		suaNhanVien(nhanVienModel);
		int stt = nhanVienModel.getStt();
		_listNhanVienModels.remove(stt);
		_stt = 0;
		for(int i =0; i<_listNhanVienModels.size();i++) {
			_listNhanVienModels.get(i).setStt(_stt);
			_stt++;
		}
	}

	public void suaNhanVien(NhanVienModel nhanVienModel) {
		updateDataNhanVienDependOnNhanVienModel(nhanVienModel);
		_nhanVien.setMatKhau("");
		_nhanVienDao.sua(_nhanVien);
	}
	
	public ChucVuModel updateDataChucVuModelDependOnChucVu(ChucVu chucVu) {
		ChucVuModel chucVuModel = new ChucVuModel();
		chucVuModel.setMaChucVu(chucVu.getMaChucVu());
		chucVuModel.setTenChucVu(chucVu.getTenChucVu());
		return chucVuModel;
	}
	
	public void updateListNhanVienModel() {
		_nhanVienDao.updateListNhanVien();
		ArrayList<NhanVien> listNhanVien = _nhanVienDao.getListNhanVien();
		for (NhanVien nhanVien : listNhanVien) {
			_nhanVienModel = new NhanVienModel();
//			_nhanVienModel = (NhanVienModel) IoCContainer.getBean(NhanVienModel.class.toString());
			_nhanVienModel.setStt(_stt);
			_nhanVienModel.setMaNV(nhanVien.getMaNV());
			_nhanVienModel.setTenNV(nhanVien.getTenNV());
			_nhanVienModel.setSdt(nhanVien.getSdt());
			_nhanVienModel.setGioiTinh(nhanVien.getGioiTinh());
			_nhanVienModel.setEmail(nhanVien.getEmail());
			_nhanVienModel.setChucVuModel(updateDataChucVuModelDependOnChucVu(nhanVien.getChucVu()));
			_nhanVienModel.setMaChucVu(nhanVien.getMaChucVu());
			_nhanVienModel.setDiaChi(nhanVien.getDiaChi());
			_nhanVienModel.setNgaySinh(nhanVien.getNgaySinh());
			_nhanVienModel.setCmnd(nhanVien.getCmnd());
			_nhanVienModel.setMatKhau(nhanVien.getMatKhau());
			_nhanVienModel.setTrangThai(nhanVien.getTrangThai());
			_listNhanVienModels.add(_nhanVienModel);
			_stt++;
		}
		_maxID = _nhanVienDao.getMaxID();
	}
	
	public int getMaxID() {
		return _maxID;
	}

	public ArrayList<NhanVienModel> getListNhanVienModel() {
		return _listNhanVienModels;
	}

}
