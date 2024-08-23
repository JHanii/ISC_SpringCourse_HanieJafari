package ir.freeland.spring.formating.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ir.freeland.spring.formating.model.Employee;



@Configuration
public class Config {
	
	@Bean
	Employee emplpyee(){
		Employee employee = new Employee();
		employee.setFirstName("Alireza");
		employee.setLastName("Fattahi");
		employee.setEmailId("afattahi54@gmail.com");
		employee.setId(100L);
		employee.setSalary(20000);
		return employee;
	}
}
