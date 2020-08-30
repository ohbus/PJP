package com.wipro.service;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Car_Details_Tester {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
				
		String hql = "SELECT c.regno, c.color, c.manufacturer, c.model FROM Car_Details as c WHERE c.manufacturer LIKE 'V%'";
		Query query = session.createQuery(hql);
		List<Object> ol = query.list();
		Iterator it = ol.iterator();
		try {
			System.out.println("\nDisplaying Records :-->>\n");
			System.out.println("Regno\tColor\tManufacturer\tModel");
			System.out.println("=============================================");
			while(it.hasNext())
			{
				Object[] obj = (Object[])it.next();
				System.out.print(obj[0] + "\t");
				System.out.print(obj[1] + "\t");
				System.out.print(obj[2] + "\t");
				System.out.print(obj[3] + "\n");
			}
			t.commit();
			session.close();
			factory.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
