package ir.freeland.springboot.persistence.base;

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
public class JpaBaseInRun {
	
	@PersistenceContext
	private EntityManager entityManager;
	

	public void sampleRun() {
		entityManager=entityManager.getEntityManagerFactory().createEntityManager();		
		Session session = entityManager.unwrap(Session.class);
		Transaction transaction = session.getTransaction();
		
		//Save*****************************************
		transaction.begin();
		Students student = new Students();
    	student.setName("Alireza");
    	student.setGender(Gender.MALE);
    	student.setBirthDate(new Date());
    	session.persist(student);
		
    	transaction.commit();
    	
    	//Find*****************************************
    	transaction.begin();
    	List<Students> allStudents = session.createQuery("from Students" , Students.class).getResultList();
    	allStudents.stream().forEach( s -> System.out.println(s));    	
    	transaction.commit();

    	//Update *****************************************
    	transaction.begin();
    	allStudents.get(0).setName("Roham");
    	transaction.commit();
    	
    	//Delete *****************************************
    	//transaction.begin();
    	//session.remove(  allStudents.get(1) );
    	//transaction.commit();
    	
    	
	}
}
