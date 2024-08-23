package ir.freeland.spring.realworldexample.dao;

//Assignment
import org.springframework.stereotype.Service;

//Spring creates a bean for the class OracleSqlApplicationDao 
//and registers it using the name “OracleSqlApplicationDao“.
@Service  
public class OracleSqlApplicationDao implements DaoInterface {

	@Override
	public void add() {
		System.out.println("Data added to Oracle Database .");
		
	}

}
