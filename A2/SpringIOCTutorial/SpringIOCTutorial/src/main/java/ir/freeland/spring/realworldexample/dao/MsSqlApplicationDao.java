package ir.freeland.spring.realworldexample.dao;

//Assignment
import org.springframework.stereotype.Service;

//Spring creates a bean for the class MsSqlApplicationDao 
//and registers it using the name “MsSqlApplicationDao“.
@Service  
public class MsSqlApplicationDao implements DaoInterface{

	@Override
	public void add() {
		System.out.println("Data added to MsSql Database .");
		
	}


}
