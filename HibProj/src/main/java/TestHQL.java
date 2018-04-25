import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.mtc.app.entity.Product;
import com.mtc.app.util.HibernateUtil;

public class TestHQL {

	public static void searchByIdName(int id,String name) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		//Query<Product> query = session.createQuery("select p from Product p where p.id > 110 and p.name like 'S%'");		
		
		//Query<Product> query = session.createQuery("select p from Product p where p.id > ? and p.name like ?");
                                                                                       //0               //1		
		
		Query<Product> query = session.createQuery("select p from Product p where p.id > :pid and p.name like :pname");
		
		query.setParameter("pid", id);
		query.setParameter("pname",name );
		
//		query.setParameter(0,id);
//		query.setParameter(1,name);
		
		List<Product> productsList = query.list();
		
		productsList.stream().forEach(System.out::println);
		
		session.close();
		
		sessionFactory.close();

	}
	
	public static void main(String[] args) {

		searchByIdName(110,"T%");

	}

}
