package assignment1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate1.cfg.xml").addAnnotatedClass(Car.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		/*Car c=new Car();
		c.setRegno("sa");
		c.setManufacturer("hello");
		c.setColor("yellow");
		c.setModel("swift");
		session.saveOrUpdate(c);*/
		session.getTransaction().commit();
	    sessionFactory.close();
	}

}
