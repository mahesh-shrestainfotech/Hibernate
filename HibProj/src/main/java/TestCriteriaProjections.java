import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.mtc.app.entity.Product;
import com.mtc.app.util.HibernateUtil;

public class TestCriteriaProjections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
	
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		
		CriteriaQuery<Object[]> criteria = criteriaBuilder.createQuery(Object[].class);
		
		Root<Product> root = criteria.from(Product.class);
		
		criteria.multiselect(root.<String>get("name"),root.<Float>get("price"));
		
		Query<Object[]> query = session.createQuery(criteria);
		
		
		List<Object[]> objectsArrList = query.list();
	
		for (Object[] objects : objectsArrList) {
			System.out.println("Name : "+objects[0]);
			System.out.println("Price: "+objects[1]);
			System.out.println();
		}

		session.close();
		
		sessionFactory.close();
	}

}



