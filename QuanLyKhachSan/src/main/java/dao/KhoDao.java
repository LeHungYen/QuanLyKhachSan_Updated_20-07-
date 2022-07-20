package dao;

import java.util.ArrayList;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import entities.Kho;
import entities.NhanVien;
import utils.DB_Connection;

public class KhoDao implements IKhoDao{
	private ArrayList<Kho> _listKhos = new ArrayList<Kho>();
	
	public void them_sua(Kho kho) {
		Session session = new DB_Connection().getSession();
		session.beginTransaction();
		session.saveOrUpdate(kho);
		session.getTransaction().commit();
		session.close();
	}

	public void updateListKho() {
		Session session = new DB_Connection().getSession();
		session.beginTransaction();
		SQLQuery query = session.createSQLQuery("select * from Kho");
		query.addEntity(Kho.class);
		_listKhos = (ArrayList<Kho>) query.list();
		session.getTransaction().commit();
		session.close();
		
	}

	public ArrayList<Kho> getListKho() {
		return _listKhos;
	}
	
}