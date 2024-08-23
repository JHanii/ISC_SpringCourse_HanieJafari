package ir.freeland.spring.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import ir.freeland.spring.aop.model.Employee;
import ir.freeland.spring.aop.service.EmployeeService;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ApplicationAOP {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext =  SpringApplication.run(ApplicationAOP.class, args);
		EmployeeService employeeService = applicationContext.getBean(EmployeeService.class);
		employeeService.addEmployee(new Employee(1L, "Alireza", "Fattahi", "afattahi54@gmail.com"));
		employeeService.getEmployeeById(100L);
		employeeService.getAllEmployees();
		
		employeeService.getEmployeeById(2L);
	}
}
