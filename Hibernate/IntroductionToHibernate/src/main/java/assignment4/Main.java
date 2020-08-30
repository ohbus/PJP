package assignment4;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class Main {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate4.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Product p1=new Product("Austex",101,20000);
		session.save(p1);
		Product p2=new Product("Baby Donuts",110,10000);
		session.save(p2);
		Product p3=new Product("Billion Air",200,30000);
		session.save(p3);
		Product p4=new Product("Coffeebags",300,40000);
		session.save(p4);
		Product p5=new Product("Farm Glue",400,50000);
		session.save(p5);
	    session.getTransaction().commit();
	    sessionFactory.close();

	}

}
