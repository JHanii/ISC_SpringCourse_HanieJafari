package ir.freeland.springboot.persistence.lifecycle;

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
public class LifecycleInRun {
	
	@PersistenceContext
	private EntityManager entityManager;
	

	public void managedEntity() {
		entityManager=entityManager.getEntityManagerFactory().createEntityManager();
		
		Session session = entityManager.unwrap(Session.class);
		Transaction transaction = session.getTransaction();
		transaction.begin();

		List<Students> students = session.createQuery("from Students" , Students.class).getResultList();
    
    	students.get(0).setName("new name");
    	
    	List<Students> students2 = session.createQuery("from Students" , Students.class).getResultList();

    	Students student = new Students();
    	student.setName("Alireza");
    	student.setGender(Gender.MALE);
    	student.setBirthDate(new Date());
    	session.persist(student);
    	
    	List<Students> students3 = session.createQuery("from Students" , Students.class).getResultList();
    	
    	transaction.commit();
    	
		//List<Student> students = session.createQuery("from Students" , Student.class).getResultList();
	
	}
}
