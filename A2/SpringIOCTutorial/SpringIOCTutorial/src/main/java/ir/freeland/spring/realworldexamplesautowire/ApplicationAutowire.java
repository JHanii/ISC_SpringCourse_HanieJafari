package ir.freeland.spring.realworldexamplesautowire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ApplicationAutowire {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(ApplicationAutowire.class, args);
		ExampleService exampleService = applicationContext.getBean(ExampleService.class);
		exampleService.printServiceNames();
	}
}
