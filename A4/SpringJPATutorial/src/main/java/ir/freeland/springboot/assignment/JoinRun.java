package ir.freeland.springboot.assignment;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Component
public class JoinRun {
	
	@PersistenceContext
	private EntityManager entityManager;
	

	public void sampleRun() {
		entityManager=entityManager.getEntityManagerFactory().createEntityManager();		
		Session session = entityManager.unwrap(Session.class);
		Transaction transaction = session.getTransaction();
		
		//*****************************************
		transaction.begin();	
		
		Item item = new Item();
		item.setName("Galaxy S23");
		item.setCatalog("Suitable camera for taking stills and videos in non-challenging conditions...");
		item.setPrice(59.5);
		
		
		CorruptedItem corruptedItem = new CorruptedItem();
		corruptedItem.setItem(item);
		corruptedItem.setReason("Broken!");
		
		//session.persist(item);
		session.persist(corruptedItem);
			
    	transaction.commit();
    	
	}
}
