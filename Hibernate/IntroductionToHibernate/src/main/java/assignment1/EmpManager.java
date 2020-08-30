package assignment1;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
public class EmpManager {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		String hql = "DESC EMP";
		NativeQuery<?> a = session.createNativeQuery(hql);
		Emp e=new Emp("Roy",101,"Engineer");
		session.save(e);
	    session.getTransaction().commit();
	    sessionFactory.close();
	    }
	}
