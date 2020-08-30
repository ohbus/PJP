package assignment3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate3.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Employee e1=new Employee("Roy","Trainee",20000);
		session.save(e1);
		Employee e2=new Employee("William","Receptionist",10000);
		session.save(e2);
		Employee e3=new Employee("Charles","Office Manager",30000);
		session.save(e3);
		Employee e4=new Employee("Donald","Branch Manager",40000);
		session.save(e4);
		Employee e5=new Employee("George","Business Analyst",50000);
		session.save(e5);
	    session.getTransaction().commit();
	    sessionFactory.close();

	}

}
