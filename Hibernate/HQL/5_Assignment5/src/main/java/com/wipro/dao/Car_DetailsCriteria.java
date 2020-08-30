package com.wipro.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.wipro.bean.Car_Details;

public class Car_DetailsCriteria {
	
	SessionFactory factory;
	public Car_DetailsCriteria() {
		Configuration cfg = new Configuration().configure("myconfig.cfg.xml");
		factory = cfg.buildSessionFactory();
	}
	public List<Car_Details> getCarByColor(String color) {
		Session session = factory.openSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Car_Details> cr = cb.createQuery(Car_Details.class);
		Root<Car_Details> root = cr.from(Car_Details.class);
		cr.select(root);
		Predicate predicate = cb.equal(root.get("color"), color);
		cr.where(predicate);
		Query<Car_Details> query = session.createQuery(cr);
		return query.list();
	}
}
