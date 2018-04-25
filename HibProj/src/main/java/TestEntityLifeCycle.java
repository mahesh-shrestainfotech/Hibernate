import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mtc.app.entity.Product;
import com.mtc.app.entity.Supplier;
import com.mtc.app.util.HibernateUtil;

public class TestEntityLifeCycle {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction transaction = session.getTransaction();

		transaction.begin();

		// persistent
		Product product = session.get(Product.class, 104);

		Supplier supplier = product.getSupplier();	

		session.delete(product);
		
//		session.evict(product);
//		
//		product.setPrice(350);
//		
//		session.merge(product);

		transaction.commit();

		session.close();

		sessionFactory.close();

	}

}
