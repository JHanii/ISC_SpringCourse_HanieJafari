package ir.freeland.springboot.relation.manytomany;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Component
public class ManyToManyRun {
	
	@PersistenceContext
	private EntityManager entityManager;
	

	public void sampleRun() {
		entityManager=entityManager.getEntityManagerFactory().createEntityManager();		
		Session session = entityManager.unwrap(Session.class);
		Transaction transaction = session.getTransaction();
		
		//*****************************************
		transaction.begin();		
		Student student = new Student();
		student.setName("Alireza");
		
		Course math = new Course();
		math.setName("Math");
		
		Course physics = new Course();
		physics.setName("Physics");
		
		student.setLikedCourses( Set.of(math,physics) );
		
		session.persist(student);
		
		
    	transaction.commit();
    	
	
	}
}
