package ir.freeland.spring.realworldexample.dao;

//Assignment
import org.springframework.stereotype.Service;

//Spring creates a bean for the class MySqlApplicationDao 
//and registers it using the name “MySqlApplicationDao“.
@Service  
public class MySqlApplicationDao implements DaoInterface{

	@Override
	public void add() {
		System.out.println("Data added to MySql Database .");
		
	}

}
