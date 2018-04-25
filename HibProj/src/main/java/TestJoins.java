import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.mtc.app.entity.Product;
import com.mtc.app.entity.Supplier;
import com.mtc.app.util.HibernateUtil;

public class TestJoins {

	public static void main(String[] args) {

		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Query<Object[]> query = session.createQuery("select p,s from Product p right outer join p.supplier s");
		
		List<Object[]> objectsArrList = query.list();
		
		for (Object[] objects : objectsArrList) {
			
			Product product = (Product)objects[0];
			Supplier supplier = (Supplier)objects[1];
			
			if(product!=null)
				System.out.println(product);
			
			if(supplier!=null)
				System.out.println(supplier);
			
			System.out.println();
		}
		
		session.close();
		
		sessionFactory.close();

	}

}
