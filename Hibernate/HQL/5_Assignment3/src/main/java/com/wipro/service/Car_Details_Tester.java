package com.wipro.service;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
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
		Transaction t = session.beginTransaction();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter REGNO : ");
		String reg = sc.nextLine();
		sc.close();
		
		String hql = "FROM Car_Details c WHERE c.regno=?0";
		Query query = session.createQuery(hql);
		try {
			query.setParameter(0, reg);
			Car_Details cd = (Car_Details) query.uniqueResult();
			System.out.println("\nDisplaying Records :-->>\n");
			System.out.println("Regno\tColor\tManufacturer\tModel");
			System.out.println("========================================");
			System.out.print(cd.getRegno() + "\t" + cd.getColor() + "\t" + cd.getManufacturer() + "\t" + cd.getModel() + "\n");
			
			t.commit();
			session.close();
			factory.close();
		}
		catch(Exception e) {
			System.out.println("Regno Not Found!");
		}
	}

}
