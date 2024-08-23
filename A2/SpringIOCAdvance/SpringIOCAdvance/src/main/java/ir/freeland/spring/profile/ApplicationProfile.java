package ir.freeland.spring.profile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import ir.freeland.spring.profile.datasource.DatasourceConfig;

@SpringBootApplication
public class ApplicationProfile {
	
	public static void main(String[] args)  {
		ApplicationContext applicationContext =  SpringApplication.run(ApplicationProfile.class, args);
		var datasource = applicationContext.getBean(DatasourceConfig.class);
		datasource.setup();
	
	}
}
