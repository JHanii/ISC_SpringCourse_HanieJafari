package ir.freeland.spring.assignment.validator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ApplicationVallidator {
	
	public static void main(String[] args)  {
		ApplicationContext applicationContext =  SpringApplication.run(ApplicationVallidator.class, args);
		
		Input input = new Input();
		input.setID("");
		input.setEmail("invalid");
		    
		var validator = applicationContext.getBean(ValidatingService.class);		
		
		validator.validateInput(input);
	}
}
