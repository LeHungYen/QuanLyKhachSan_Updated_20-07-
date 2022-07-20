package services;

import java.util.ArrayList;
import java.util.List;

import dao.DonViTinhDao;
import entities.DonViTinh;
import models.DonViTinhModel;
import utils.IoCContainer;

public class DonViTinhService {
	private IoCContainer ioCContainer = new IoCContainer();
	private List<DonViTinhModel> _listDonViTinhModels = new ArrayList<DonViTinhModel>();
	private DonViTinhDao _DonViTinhDao = (DonViTinhDao) ioCContainer.getBean(DonViTinhDao.class.toString());
	private DonViTinh _DonViTinh;
	private DonViTinhModel _DonViTinhModel = (DonViTinhModel) IoCContainer.getBean(DonViTinhModel.class.toString());;
	private int _stt = 0;

	public static DonViTinh updateDataDonViTinhDependOnDonViTinhModel(DonViTinhModel DonViTinhModel) {
		DonViTinh DonViTinh = new DonViTinh();
		DonViTinh.setMaDonVi(DonViTinhModel.getMaDonVi());
		DonViTinh.setTenDonVi(DonViTinhModel.getTenDonVi());
		DonViTinh.setTrangThai(DonViTinhModel.getTrangThai());
		DonViTinh.setListDonViChiTiet(DonViTinhModel.getListDonViChiTietModel());//
		DonViTinh.setListDichVuPhong(DonViTinhModel.getListDichVuPhongModel());//
		return DonViTinh;
	}
	public static DonViTinhModel updateDataDonViTinhModelDependOnDonViTinh(DonViTinh DonViTinh) {
		DonViTinhModel donViTinhModel = new DonViTinhModel();
		donViTinhModel.setMaDonVi(DonViTinh.getMaDonVi());
		donViTinhModel.setTenDonVi(DonViTinh.getTenDonVi());
		donViTinhModel.setTrangThai(DonViTinh.getTrangThai());
		donViTinhModel.setListDonViChiTietModel(DonViTinh.getListDonViChiTiet());
		donViTinhModel.setListDichVuPhongModel(DonViTinh.getListDichVuPhong());
		return donViTinhModel;
	}

	public static List<DonViTinh> updateListDonViTinhDependOnListDonViTinhModel (List<DonViTinhModel> listDonViTinhModel){
		List<DonViTinh> listDonViTinh = new ArrayList<DonViTinh>();
		for (DonViTinhModel donViTinhModel : listDonViTinhModel) {
			DonViTinh donViTinh = updateDataDonViTinhDependOnDonViTinhModel(donViTinhModel);
			listDonViTinh.add(donViTinh);
		}
		return listDonViTinh;
	}
	public static List<DonViTinhModel> updateListDonViTinhModelDependOnListDonViTinh (List<DonViTinh> listDonViTinh){
		List<DonViTinhModel> listDonViTinhModel = new ArrayList<DonViTinhModel>();
		for (DonViTinh donViTinh : listDonViTinh) {
			DonViTinhModel donViTinhModel = updateDataDonViTinhModelDependOnDonViTinh(donViTinh);
			listDonViTinhModel.add(donViTinhModel);
		}
		return listDonViTinhModel;
	}
	
	public void them_sua(DonViTinhModel DonViTinhModel) {
		_DonViTinh = updateDataDonViTinhDependOnDonViTinhModel(DonViTinhModel);
		_DonViTinhDao.them_sua(_DonViTinh);
		_listDonViTinhModels.add(DonViTinhModel);
		_stt++;
	}

	
	public void updateListDonViTinhModel() {
		_DonViTinhDao.updateListDonViTinh();
		List<DonViTinh> listDonViTinh = _DonViTinhDao.getListDonViTinh();
		_listDonViTinhModels = updateListDonViTinhModelDependOnListDonViTinh(listDonViTinh);

	}

	public List<DonViTinhModel> getListDonViTinhModel() {
		return _listDonViTinhModels;
	}

}
