package ir.freeland.springboot.relation.joincolumn;

import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Component
public class JoinColoumnRun {
	
	@PersistenceContext
	private EntityManager entityManager;
	

	public void sampleRun() {
		entityManager=entityManager.getEntityManagerFactory().createEntityManager();		
		Session session = entityManager.unwrap(Session.class);
		Transaction transaction = session.getTransaction();
		
		//*****************************************
//		transaction.begin();		
//		OfficialEmployee alireza = new OfficialEmployee();
//		alireza.setName("Alireza");
//
//		
//		Email email1 = new Email();
//		email1.setAddress("afattahi@yahoo.com");
//		email1.setEmployee(alireza);
//		
//		Email email2 = new Email();
//		email2.setAddress("afattahi54@gmail.com");
//		email2.setEmployee(alireza);
//
//		session.persist(email1);
//		session.persist(email2);
//		session.persist(alireza);
//		
//		
//    	transaction.commit();
    	
    	//*****************************************
		transaction.begin();		
		Office isc = new Office();
		isc.setName("ISC");
		
		OfficeAddress officeAddress1 = new OfficeAddress();
		officeAddress1.setZipCode("Tehran");
		isc.setAddress(officeAddress1);
		
		
		session.persist(isc); // no need to persist office address
		
    	transaction.commit();
    	
	
	}
}
