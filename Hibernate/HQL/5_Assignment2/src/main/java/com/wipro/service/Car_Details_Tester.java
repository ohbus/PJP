package com.wipro.service;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.wipro.bean.Car_Details;

public class Car_Details_Tester {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		String hql = "FROM Car_Details cd";
		Query query = session.createQuery(hql);
		List list = query.list();
		System.out.println("\nDisplaying Records :-->>\n");
		Iterator it = list.iterator();
		System.out.println("Regno\tManufacturer");
		System.out.println("=======================");
		while(it.hasNext())
		{
			Object o = (Object)it.next();
			Car_Details cd = (Car_Details)o;
			System.out.print(cd.getRegno() + "\t" + cd.getManufacturer() + "\n");
		}
		factory.close();
	}

}
