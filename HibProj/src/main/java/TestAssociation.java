import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mtc.app.actionbazaar.Bid;
import com.mtc.app.actionbazaar.Item;
import com.mtc.app.entity.Product;
import com.mtc.app.util.HibernateUtil;

public class TestAssociation {

	public static void addItem() {
		Item item = new Item();
		item.setItemId(1L);
		item.setBidStartDate(LocalDate.of(2018,4,15));
		item.setBidEndDate(LocalDate.of(2018,4,25));
		item.setCreatedDate(LocalDate.now());
		item.setInitialPrice(new BigDecimal(200));
		item.setItemName("iPhone");
		
		Set<Bid> bids = new HashSet<Bid>();
		
		bids.add(new Bid(99901L,new BigDecimal(210),LocalDate.of(2018,4,15)));
		bids.add(new Bid(99902L,new BigDecimal(230),LocalDate.of(2018,4,16)));
		bids.add(new Bid(99903L,new BigDecimal(205),LocalDate.of(2018,4,16)));
		
		item.setBids(bids);
	
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();

		Transaction transaction = session.getTransaction();
		
		transaction.begin();
		
			session.save(item);
			
		transaction.commit();
		
		session.close();
		
		sessionFactory.close();

	}
	
	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();

		Item item = session.get(Item.class,1L);
		
		Set<Bid> bids = item.getBids();
		
		System.out.println("ItemId   : "+item.getItemId());
		System.out.println("ItemName : "+item.getItemName());
		
		System.out.println("Bids : ");
		
		for (Bid bid : bids) {
			System.out.println("BidId   : "+bid.getBidId());
			System.out.println("BidDate : "+bid.getBidDate());
			System.out.println("Price   : "+bid.getBidPrice());
			System.out.println();
		}
		
		session.close();
		
		sessionFactory.close();
		
	}

}










