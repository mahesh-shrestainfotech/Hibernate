import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mtc.app.util.HibernateUtil;

public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		
		session.close();
		
		sessionFactory.close();
	

	}

}
