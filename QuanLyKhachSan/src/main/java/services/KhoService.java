package services;

import java.util.ArrayList;
import java.util.List;

import dao.KhoDao;
import entities.Kho;
import models.KhoModel;
import utils.IoCContainer;

public class KhoService implements IKhoService{
	private IoCContainer ioCContainer = new IoCContainer();
	private List<KhoModel> _listKhoModels = new ArrayList<KhoModel>();
	private KhoDao _KhoDao = (KhoDao) ioCContainer.getBean(KhoDao.class.toString());
	private Kho _Kho;
	private KhoModel _KhoModel = (KhoModel) IoCContainer.getBean(KhoModel.class.toString());;
	private int _stt = 0;

	public static Kho updateDataKhoDependOnKhoModel(KhoModel KhoModel) {
		Kho Kho = new Kho();
		Kho.setMaKho(KhoModel.getMaKho());
		Kho.setTenKho(KhoModel.getTenKho());
		Kho.setTrangThai(KhoModel.getTrangThai());
		Kho.setListPhieuKiemKho(KhoModel.getListPhieuKiemKhoModel()); //
		Kho.setListSanPhamVaDichVu(KhoModel.getListSanPhamVaDichVuModel()); //
		return Kho;
	}
	
	public static KhoModel updateDataKhoModelDependOnKho(Kho kho) {
		KhoModel khoModel = new KhoModel();
		khoModel.setMaKho(kho.getMaKho());
		khoModel.setTenKho(kho.getTenKho());
		khoModel.setTrangThai(kho.getTrangThai());
		khoModel.setListPhieuKiemKhoModel(kho.getListPhieuKiemKho()); //
		khoModel.setListSanPhamVaDichVuModel(kho.getListSanPhamVaDichVu()); //
		return khoModel;
	}
	
	public static List<Kho> updateListKhoDependOnListKhoModel(List<KhoModel> listKhoModel) {
		List<Kho> listKho = new ArrayList<Kho>();
		for (KhoModel khoModel2 : listKhoModel) {
			Kho kho = updateDataKhoDependOnKhoModel(khoModel2);
			listKho.add(kho);
		}
		return listKho;
	}
	
	public static List<KhoModel> updateListKhoModelDependOnListKho(List<Kho> listKho) {
		List<KhoModel> listKhoModel = new ArrayList<KhoModel>();
		for (Kho kho : listKho) {
			KhoModel khoModel = updateDataKhoModelDependOnKho(kho);
			listKhoModel.add(khoModel);
		}
		return listKhoModel;
	}

	public void them_sua(KhoModel KhoModel) {
		_Kho = updateDataKhoDependOnKhoModel(KhoModel);
		_KhoDao.them_sua(_Kho);
		_listKhoModels.add(KhoModel);// check lại
	}

	public void updateListKhoModel() {
		_KhoDao.updateListKho();
		List<Kho> listKho = _KhoDao.getListKho();
		_listKhoModels = updateListKhoModelDependOnListKho(listKho);

	}

	public List<KhoModel> getListKhoModel() {
		return _listKhoModels;
	}

}
