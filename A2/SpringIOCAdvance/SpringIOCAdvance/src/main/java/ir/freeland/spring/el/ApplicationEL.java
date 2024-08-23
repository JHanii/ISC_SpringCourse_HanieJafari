package ir.freeland.spring.el;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import ir.freeland.spring.el.model.Department;
import ir.freeland.spring.el.model.Worker;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ApplicationEL {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws ParseException {
		ApplicationContext applicationContext =  SpringApplication.run(ApplicationEL.class, args);
		Worker worker = applicationContext.getBean(Worker.class);
		System.out.println( "-------------------------------------" );
		System.out.println("The worker is ready to use: \n" + worker );
		
		System.out.println( "-------------------------------------" );
		ExpressionParser parser = new SpelExpressionParser();		
		worker.setDateOfBirth(new SimpleDateFormat("YYYY-MM-DD").parse("1985-12-01"));
		EvaluationContext context = new StandardEvaluationContext(worker);
	    int birthYear = (Integer) parser.parseExpression("dateOfBirth.Year + 1900").getValue(context);	
	    System.out.println("I can manupulate with properties\nBirth date:"+birthYear);
	    
	    System.out.println( "-------------------------------------" );
	    String[] awards = {"Star of the Month", "Champion", "Accelerator"};
	    worker.setAwards(awards);
	    String award = parser.parseExpression("awards[2]").getValue(context, String.class);
	    System.out.println("I can manupulate with arrays\nThird award:"+award);
	    
	    
	    System.out.println( "-------------------------------------" );
	    Worker worker1 = new Worker("Alireza", "IRAN");
	    Worker worker2 = new Worker("Roham", "IRAN");
	    Worker worker3 = new Worker("Joe", "USA");
	    
	    var workers = new ArrayList<Worker>();
	    workers.add(worker1);
	    workers.add(worker2);
	    workers.add(worker3);
	    Department dept = new Department();
	    dept.setWorkers(workers);
	    EvaluationContext depContext = new StandardEvaluationContext(dept);

	    List<Worker> iraninaWorkers = (List<Worker>) parser.parseExpression("workers.?[country == 'IRAN']").getValue(depContext);
	    System.out.println("Workers from IRAN are\nIraninan:"+iraninaWorkers);
	   
	    List<String> countries = (List<String>) parser.parseExpression("workers.![country]").getValue(depContext);
	    System.out.println("Workers are from\nCountries:"+countries);
	    
 

	}
}
