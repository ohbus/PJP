package com.wipro.service;

import java.util.Iterator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class CriteriaTester {

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Configuration cfg = new Configuration().configure("myconfig.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Query query = session.createQuery("SELECT count(distinct cd.regno) from Car_Details cd");
		Iterator count = query.iterate();
		System.out.println("No. of Rows : "+count.next());
	}

}
