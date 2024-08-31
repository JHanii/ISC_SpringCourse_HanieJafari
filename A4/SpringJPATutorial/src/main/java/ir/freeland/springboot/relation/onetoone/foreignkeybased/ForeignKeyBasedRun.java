package ir.freeland.springboot.relation.onetoone.foreignkeybased;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Component
public class ForeignKeyBasedRun {
	
	@PersistenceContext
	private EntityManager entityManager;
	

	public void sampleRun() {
		entityManager=entityManager.getEntityManagerFactory().createEntityManager();		
		Session session = entityManager.unwrap(Session.class);
		Transaction transaction = session.getTransaction();
		
		//*****************************************
		transaction.begin();		
		Address myAddress = new Address();
		myAddress.setCity("Tehran");
		myAddress.setStreet("Tajrish");
		
		User myUser = new User();
		myUser.setUserName("Alireza");
		myUser.setAddress(myAddress);
		
		session.persist(myUser);
		
		
    	transaction.commit();
    	
	
    	//*****************************************
    	transaction.begin();
    	User myUser2 = new User();
		myUser2.setUserName("Roham");		
		
		session.persist(myUser2);
    	
    	transaction.commit();
    	
    	//*****************************************
    	transaction.begin();
    	List<User> users = session.createQuery("from User u where u.userName like '%Alireza%' " , User.class).getResultList();		
    	users.stream().forEach( u -> System.out.println( u.getAddress().getCity() ));
    	transaction.commit();
    	
    	//*****************************************
    	transaction.begin();    	
    	session.remove(myUser);
    	transaction.commit();
	}
}
