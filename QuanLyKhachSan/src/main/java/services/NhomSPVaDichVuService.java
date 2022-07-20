package services;

import java.util.ArrayList;
import java.util.List;

import dao.NhomSPVaDichVuDao;
import entities.NhomSPVaDichVu;
import models.NhomSPVaDichVuModel;
import utils.IoCContainer;

public class NhomSPVaDichVuService implements INhomSPvaDichVuService{
	private IoCContainer ioCContainer = new IoCContainer();
	private List<NhomSPVaDichVuModel> _listNhomSPVaDichVuModels = new ArrayList<NhomSPVaDichVuModel>();
	private NhomSPVaDichVuDao _NhomSPVaDichVuDao = (NhomSPVaDichVuDao) ioCContainer.getBean(NhomSPVaDichVuDao.class.toString());
	private NhomSPVaDichVu _NhomSPVaDichVu;
	private NhomSPVaDichVuModel _NhomSPVaDichVuModel = (NhomSPVaDichVuModel) IoCContainer.getBean(NhomSPVaDichVuModel.class.toString());;

	public static NhomSPVaDichVu updateDataNhomSPVaDichVuDependOnNhomSPVaDichVuModel(NhomSPVaDichVuModel NhomSPVaDichVuModel) {
		NhomSPVaDichVu NhomSPVaDichVu = new NhomSPVaDichVu();
		NhomSPVaDichVu.setMaNhomSP(NhomSPVaDichVuModel.getMaNhomSP());
		NhomSPVaDichVu.setTenNhomSP(NhomSPVaDichVuModel.getTenNhomSP());
		NhomSPVaDichVu.setNhomHangHoa(NhomSPVaDichVuModel.getNhomHangHoa());
		NhomSPVaDichVu.setGhiChu(NhomSPVaDichVuModel.getGhiChu());
		NhomSPVaDichVu.setTrangThai(NhomSPVaDichVuModel.getTrangThai());
		NhomSPVaDichVu.setListSanPhamVaDichVu(NhomSPVaDichVuModel.getListSanPhamVaDichVu());//
		return NhomSPVaDichVu;
	}
	public static NhomSPVaDichVuModel updateDataNhomSPVaDichVuModelDependOnNhomSPVaDichVu(NhomSPVaDichVu NhomSPVaDichVu) {
		NhomSPVaDichVuModel nhomSPVaDichVuModel = new NhomSPVaDichVuModel();
		nhomSPVaDichVuModel.setMaNhomSP(NhomSPVaDichVu.getMaNhomSP());
		nhomSPVaDichVuModel.setTenNhomSP(NhomSPVaDichVu.getTenNhomSP());
		nhomSPVaDichVuModel.setNhomHangHoa(NhomSPVaDichVu.getNhomHangHoa());
		nhomSPVaDichVuModel.setGhiChu(NhomSPVaDichVu.getGhiChu());
		nhomSPVaDichVuModel.setTrangThai(NhomSPVaDichVu.getTrangThai());
		nhomSPVaDichVuModel.setListSanPhamVaDichVu(NhomSPVaDichVu.getListSanPhamVaDichVu());//
		return nhomSPVaDichVuModel;
	}
	
	public static List<NhomSPVaDichVuModel> updateListNhomSPVaDichVuModelDependOnListNhomSPVaDichVu (List<NhomSPVaDichVu> listNhomSPVaDichVu){
		List<NhomSPVaDichVuModel> listNhomSPVaDichVuModel = new ArrayList<NhomSPVaDichVuModel>();
		for (NhomSPVaDichVu nhomSPVaDichVu : listNhomSPVaDichVu) {
			NhomSPVaDichVuModel nhomSPVaDichVuModel = updateDataNhomSPVaDichVuModelDependOnNhomSPVaDichVu(nhomSPVaDichVu);
			listNhomSPVaDichVuModel.add(nhomSPVaDichVuModel);
		}
		return listNhomSPVaDichVuModel;
	}
	
	public static List<NhomSPVaDichVu> updateListNhomSPVaDichVuDependOnListNhomSPVaDichVuModel (List<NhomSPVaDichVuModel> listNhomSPVaDichVuModel){
		List<NhomSPVaDichVu> listNhomSPVaDichVu = new ArrayList<NhomSPVaDichVu>();
		for (NhomSPVaDichVuModel nhomSPVaDichVuModel : listNhomSPVaDichVuModel) {
			NhomSPVaDichVu nhomSPVaDichVu = updateDataNhomSPVaDichVuDependOnNhomSPVaDichVuModel(nhomSPVaDichVuModel);
			listNhomSPVaDichVu.add(nhomSPVaDichVu);
		}
		return listNhomSPVaDichVu;
	}

	public void them_sua(NhomSPVaDichVuModel NhomSPVaDichVuModel) {
		_NhomSPVaDichVu = updateDataNhomSPVaDichVuDependOnNhomSPVaDichVuModel(NhomSPVaDichVuModel);
		_NhomSPVaDichVuDao.them_sua(_NhomSPVaDichVu);
		_listNhomSPVaDichVuModels.add(NhomSPVaDichVuModel); // check lai
	}

	public void updateListNhomSPVaDichVuModel() {
		_NhomSPVaDichVuDao.updateListNhomSPVaDichVu();
		List<NhomSPVaDichVu> listNhomSPVaDichVu = _NhomSPVaDichVuDao.getListNhomSPVaDichVu();
		_listNhomSPVaDichVuModels = updateListNhomSPVaDichVuModelDependOnListNhomSPVaDichVu(listNhomSPVaDichVu);

	}

	public List<NhomSPVaDichVuModel> getListNhomSPVaDichVuModel() {
		return _listNhomSPVaDichVuModels;
	}
	

}
