package ir.freeland.springboot.assignment;

import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import ir.freeland.springboot.persistence.model.Gender;
import ir.freeland.springboot.persistence.model.Students;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Component
public class ItemRun {
	
	@PersistenceContext
	private EntityManager entityManager;
	

	public void sampleRun() {
		entityManager=entityManager.getEntityManagerFactory().createEntityManager();		
		Session session = entityManager.unwrap(Session.class);
		Transaction transaction = session.getTransaction();
		
		//Save*****************************************
		transaction.begin();
		Item item = new Item();
		item.setName("Galaxy A55");
		item.setCatalog("Suitable camera for taking stills and videos in non-challenging conditions...");
		item.setPrice(29.5);
    	session.persist(item);
		
    	transaction.commit();
    	
    	//Find*****************************************
    	transaction.begin();
    	List<Item> allItems = session.createQuery("from item" , Item.class).getResultList();
    	allItems.stream().forEach( s -> System.out.println(s));    	
    	transaction.commit();

    	//Update *****************************************
    	transaction.begin();
    	allItems.get(0).setName("Samsung Galaxy A55");
    	transaction.commit();
    	
    	// Save a new record
    	transaction.begin();
		Item item2 = new Item();
		item.setName("Galaxy A24");
		item.setCatalog("Suitable camera for taking stills and videos in non-challenging conditions...");
		item.setPrice(19.5);
    	session.persist(item2);
		
    	transaction.commit();
    	
    	// Add the new one to the list
    	allItems = session.createQuery("from item" , Item.class).getResultList();
    	
    	//Delete the new record *****************************************
    	transaction.begin();
    	session.remove(  allItems.get(1) );
    	transaction.commit();
    	
    	
	}
}
