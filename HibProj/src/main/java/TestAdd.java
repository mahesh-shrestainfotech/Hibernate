import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.mtc.app.entity.Product;
import com.mtc.app.util.HibernateUtil;

public class TestAdd {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		//Transient
		Product product = new Product("Node.js","Ebook",200);

		Transaction transaction = session.getTransaction();
		
		transaction.begin();
		
			session.save(product);
			
			Query<Product> query = session.createQuery("from Product");
			
			query.list();
			
		transaction.commit();
		
		session.close();
		
		sessionFactory.close();
	}

}
