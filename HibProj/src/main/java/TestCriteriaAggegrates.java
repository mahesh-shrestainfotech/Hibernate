import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.mtc.app.entity.Product;
import com.mtc.app.util.HibernateUtil;

public class TestCriteriaAggegrates {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
	
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		
		CriteriaQuery<Float> criteria = criteriaBuilder.createQuery(Float.class);
	
		Root<Product> root = criteria.from(Product.class);
		
		criteria.select(criteriaBuilder.max(root.<Float>get("price")));
		
		Query<Float> query = session.createQuery(criteria);
		
		Float maxPrice = query.uniqueResult();
		
		System.out.println("MaxPrice : "+maxPrice);
		
		session.close();
		
		sessionFactory.close();

	}

}
