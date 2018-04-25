import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.mtc.app.util.HibernateUtil;

public class TestHQLAggregates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Query<Float> query = session.createQuery("select max(p.price) from Product p");
		
		Float price = query.uniqueResult();
		
		System.out.println("Max Price : "+price);
		
		session.close();
		
		sessionFactory.close();
		

	}

}
