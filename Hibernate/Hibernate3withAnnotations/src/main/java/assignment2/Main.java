package assignment2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate1.cfg.xml").addAnnotatedClass(Car.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Car c1=new Car("KL-07","AB 123 Polo","White","Volkswagen");
		session.save(c1);
		Car c2=new Car("KL-07","AB 234 Vento","Black","Volkswagen");
		session.save(c2);
		Car c3=new Car("KL-07","AC 345 Corolla","Silver","Toyota");
		session.save(c3);
		session.getTransaction().commit();
	    sessionFactory.close();
	}

}
