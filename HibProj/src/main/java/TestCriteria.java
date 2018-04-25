import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.mtc.app.entity.Product;
import com.mtc.app.util.HibernateUtil;

public class TestCriteria {

	public static void main(String[] args) {

		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
	
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		
		CriteriaQuery<Product> criteria = criteriaBuilder.createQuery(Product.class);
		
		Root<Product> root = criteria.from(Product.class);
		
		//criteria.select(root).where(criteriaBuilder.gt(root.<Integer>get("id"),110));
		
		criteria.select(root).where(criteriaBuilder.and(criteriaBuilder.gt(root.<Integer>get("id"),110),criteriaBuilder.like(root.<String>get("name"),"T%")));
		
		Query<Product> query = session.createQuery(criteria);
		
		List<Product> products = query.list();
		
		products.stream().forEach(System.out::println);
		
		session.close();
		
		sessionFactory.close();
		
		
		

	}

}
