package ir.freeland.spring.formating;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import ir.freeland.spring.formating.model.Employee;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ApplicationFormating {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext =  SpringApplication.run(ApplicationFormating.class, args);
		Employee employee = applicationContext.getBean(Employee.class);
		System.out.println(employee);
	}
}
