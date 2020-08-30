package assignment2;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class Main {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate2.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Flower f=new Flower("F1","Rose","Red",10);
		session.save(f);
	    session.getTransaction().commit();
	    sessionFactory.close();
	    }
	}
