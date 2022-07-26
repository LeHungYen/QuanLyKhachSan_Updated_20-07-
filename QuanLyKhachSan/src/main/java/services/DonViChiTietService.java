package services;

import java.util.ArrayList;
import java.util.List;

import dao.DonViChiTietDao;
import entities.DonViChiTiet;
import models.DonViChiTietModel;
import utils.IoCContainer;

public class DonViChiTietService {
	private IoCContainer ioCContainer = new IoCContainer();
	private List<DonViChiTietModel> _listDonViChiTietModels = new ArrayList<DonViChiTietModel>();
	private DonViChiTietDao _DonViChiTietDao = (DonViChiTietDao) ioCContainer.getBean(DonViChiTietDao.class.toString());
	private DonViChiTiet _DonViChiTiet;
	private DonViChiTietModel _DonViChiTietModel = (DonViChiTietModel) IoCContainer.getBean(DonViChiTietModel.class.toString());;
	private int _stt = 0;

	public static DonViChiTiet updateDataDonViChiTietDependOnDonViChiTietModel(DonViChiTietModel DonViChiTietModel) {
		DonViChiTiet DonViChiTiet = new DonViChiTiet();
		DonViChiTiet.setDonViTinh(DonViChiTietModel.getDonViTinhModel());
		DonViChiTiet.setSanPhamVaDichVu(DonViChiTietModel.getSanPhamVaDichVuModel());
		DonViChiTiet.setGiaTriQuyDoi(DonViChiTietModel.getGiaTriQuyDoi());
		DonViChiTiet.setGiaBan(DonViChiTietModel.getGiaBan());
		DonViChiTiet.setTrangThai(DonViChiTietModel.getTrangThai());
		return DonViChiTiet;
	}
	public static DonViChiTietModel updateDataDonViChiTietModelDependOnDonViChiTiet(DonViChiTiet donViChiTiet) {
		DonViChiTietModel donViChiTietModel = new DonViChiTietModel();
		donViChiTietModel.setDonViTinhModel(donViChiTiet.getDonViTinh());
		donViChiTietModel.setSanPhamVaDichVuModel(donViChiTiet.getSanPhamVaDichVu());
		donViChiTietModel.setGiaTriQuyDoi(donViChiTiet.getGiaTriQuyDoi());
		donViChiTietModel.setGiaBan(donViChiTiet.getGiaBan());
		donViChiTietModel.setTrangThai(donViChiTiet.getTrangThai());
		return donViChiTietModel;
	}
	
	public static List<DonViChiTiet> updateListDonViChiTietDependOnListDonViChiTietModel(List<DonViChiTietModel> listDonViChiTietModel) {
		List<DonViChiTiet> listDonViChiTiet = new ArrayList<DonViChiTiet>();
		for (DonViChiTietModel donViChiTietModel : listDonViChiTietModel) {
			DonViChiTiet donViChiTiet = updateDataDonViChiTietDependOnDonViChiTietModel(donViChiTietModel);
			listDonViChiTiet.add(donViChiTiet);
		}
		return listDonViChiTiet;
	}
	
	public static List<DonViChiTietModel> updateListDonViChiTietModelDependOnListDonViChiTiet(List<DonViChiTiet> listDonViChiTiet) {
		List<DonViChiTietModel> listDonViChiTietModel = new ArrayList<DonViChiTietModel>();
		for (DonViChiTiet donViChiTiet : listDonViChiTiet) {
			DonViChiTietModel donViChiTietModel = updateDataDonViChiTietModelDependOnDonViChiTiet(donViChiTiet);
			listDonViChiTietModel.add(donViChiTietModel);
		}
		return listDonViChiTietModel;
	}

	public void them_sua(DonViChiTietModel DonViChiTietModel) {
		_DonViChiTiet = updateDataDonViChiTietDependOnDonViChiTietModel(DonViChiTietModel);
		_DonViChiTietDao.them_sua(_DonViChiTiet);
		_listDonViChiTietModels.add(DonViChiTietModel); // check lai
	}

	
	public void updateListDonViChiTietModel() {
		_DonViChiTietDao.updateListDonViChiTiet();
		List<DonViChiTiet> listDonViChiTiet = _DonViChiTietDao.getListDonViChiTiet();
		_listDonViChiTietModels = updateListDonViChiTietModelDependOnListDonViChiTiet(listDonViChiTiet);

	}

	public List<DonViChiTietModel> getListDonViChiTietModel() {
		return _listDonViChiTietModels;
	}

}
