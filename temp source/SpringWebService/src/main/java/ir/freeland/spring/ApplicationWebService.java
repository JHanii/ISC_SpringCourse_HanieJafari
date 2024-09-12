package ir.freeland.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import ir.freeland.spring.client.CountryClient;

import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class ApplicationWebService implements CommandLineRunner {
	private final ApplicationContext context;
    public static void main(String[] args)  {
        SpringApplication.run(ApplicationWebService.class, args);
    }
    public ApplicationWebService(ApplicationContext context) {
        this.context = context;
      }
    
    @Override
    public void run(String... args) {
    	CountryClient CountryClient = context.getBean(CountryClient.class);
    	System.out.println( CountryClient.getCountry("Spain").getCountry().getCurrency() );
    	

    }
}