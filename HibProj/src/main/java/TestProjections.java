import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.mtc.app.entity.Product;
import com.mtc.app.util.HibernateUtil;

public class TestProjections {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		
		Query<Object[]> query = session.createQuery("select p.name,p.price from Product p where p.id > :pid and p.name like :pname");
		
		query.setParameter("pid", 110);
		query.setParameter("pname","T%" );
		
		List<Object[]> productsList = query.list();
		
		for (Object[] objects : productsList) {
			System.out.println("Name  : "+objects[0]);
			System.out.println("Price : "+objects[1]);
			System.out.println();
		}
		
		session.close();
		
		sessionFactory.close();



	}

}
