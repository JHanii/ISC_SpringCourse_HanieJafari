package ir.freeland.springboot.persistence.converter;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Component
public class ConverterRun {
	
	@PersistenceContext
	private EntityManager entityManager;
	

	public void sampleRun() {
		entityManager=entityManager.getEntityManagerFactory().createEntityManager();		
		Session session = entityManager.unwrap(Session.class);
		Transaction transaction = session.getTransaction();
		
		//Save*****************************************
		transaction.begin();
		CPerson person = new CPerson();
		PersonName pname = new PersonName();
		pname.setName("Alireza");
		pname.setSurname("Fattahi");
		person.setPersonName(pname);
    	session.persist(person);
		transaction.commit();
		
		//Select*****************************************
		transaction.begin();
//		CPerson dbPersonName =  session.createNativeQuery(
//			      "select p.personName from PersonTable p where p.id = :id", CPerson.class)
//			      .setParameter("id",1)
//			      .getSingleResult();
//		 System.out.println( dbPersonName);
		 transaction.commit();
	}
}
