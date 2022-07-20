package utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import entities.ChucVu;
import entities.DichVuPhong;
import entities.DonViChiTiet;
import entities.DonViTinh;
import entities.HoaDon;
import entities.Kho;
import entities.NhanVien;
import entities.NhomSPVaDichVu;
import entities.PhieuKiemKho;
import entities.PhieuKiemKhoChiTiet;
import entities.PhieuNhapKho;
import entities.PhieuNhapKhoChiTiet;
import entities.SanPhamVaDichVu;

public class DB_Connection {
	public static Session getSession(Configuration configuration) {
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties())
				.buildServiceRegistry();
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		Session session = sessionFactory.openSession();
		return session;
	}

	public static Session getSession() {
		Configuration configuration = new Configuration().configure().addAnnotatedClass(ChucVu.class)
				.addAnnotatedClass(DonViChiTiet.class).addAnnotatedClass(DonViTinh.class)
				.addAnnotatedClass(DichVuPhong.class).addAnnotatedClass(HoaDon.class).addAnnotatedClass(Kho.class)
				.addAnnotatedClass(NhanVien.class).addAnnotatedClass(NhomSPVaDichVu.class)
				.addAnnotatedClass(PhieuKiemKho.class).addAnnotatedClass(PhieuKiemKhoChiTiet.class)
				.addAnnotatedClass(PhieuNhapKho.class).addAnnotatedClass(PhieuNhapKhoChiTiet.class)
				.addAnnotatedClass(SanPhamVaDichVu.class);
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties())
				.buildServiceRegistry();
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		Session session = sessionFactory.openSession();
		return session;
	}

//	public static Session getSession(Class name) {
//		Configuration configuration = new Configuration().configure().addAnnotatedClass(name);
//		Session session = getSession(configuration);
//		return session;
//	}

	public static Session getSession(Class name, Class name1) {
		Configuration configuration = new Configuration().configure().addAnnotatedClass(name).addAnnotatedClass(name1);
		Session session = getSession(configuration);
		return session;
	}

	public static Session getSession(Class name, Class name1, Class name2) {
		Configuration configuration = new Configuration().configure().addAnnotatedClass(name).addAnnotatedClass(name1)
				.addAnnotatedClass(name2);
		Session session = getSession(configuration);
		return session;
	}

	public static Session getSession(Class name, Class name1, Class name2, Class name3) {
		Configuration configuration = new Configuration().configure().addAnnotatedClass(name).addAnnotatedClass(name1)
				.addAnnotatedClass(name2).addAnnotatedClass(name3);
		Session session = getSession(configuration);
		return session;
	}
}
