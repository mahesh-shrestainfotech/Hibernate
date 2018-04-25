import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.mtc.app.entity.Product;
import com.mtc.app.entity.Supplier;
import com.mtc.app.util.HibernateUtil;

public class TestCriteriaJoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
	
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		
		CriteriaQuery<Object[]> criteria = criteriaBuilder.createQuery(Object[].class);
		
		Root<Product> productRoot = criteria.from(Product.class);
		Root<Supplier> supplierRoot = criteria.from(Supplier.class);
	
		criteria.multiselect(productRoot,supplierRoot);
		
		criteria.where(criteriaBuilder.equal(productRoot.<Supplier>get("supplier"), supplierRoot.<Integer>get("id")));
		
		Query<Object[]> query = session.createQuery(criteria);
		
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
