package ir.freeland.springboot.relation.onetoone.jointable;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Component
public class JointableRun {
	
	@PersistenceContext
	private EntityManager entityManager;
	

	public void sampleRun() {
		entityManager=entityManager.getEntityManagerFactory().createEntityManager();		
		Session session = entityManager.unwrap(Session.class);
		Transaction transaction = session.getTransaction();
		
		//*****************************************
		transaction.begin();		
		
		WorkStation workStation = new WorkStation();
		workStation.setFloor("First");
		workStation.setWorkstationNumber(2);
		
		Employee employee = new Employee();
		employee.setName("Alireza");
		employee.setWorkStation(workStation);
		
		
		workStation.setEmployee(employee);
		
		//session.persist(employee);
		session.persist(workStation);
		
		
    	transaction.commit();
    	
	}
}
