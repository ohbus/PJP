package com.wipro.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.wipro.bean.Car_Details;

public class Car_DetailsDAO {
	SessionFactory factory;
	
	public Car_DetailsDAO() {
		Configuration cfg = new Configuration().configure("myconfig.cfg.xml");
		factory = cfg.buildSessionFactory();
	}
	@SuppressWarnings("unchecked")
	public List<Car_Details> getDetails() {
		Session session = factory.openSession();
		Query<Car_Details> query = session.createQuery("From Car_Details");
		return query.list();
	}
}
