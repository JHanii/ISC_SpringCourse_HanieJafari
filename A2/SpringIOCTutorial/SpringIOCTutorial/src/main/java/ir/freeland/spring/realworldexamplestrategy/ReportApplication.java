package ir.freeland.spring.realworldexamplestrategy;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReportApplication {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_stategy.xml");
		ReportConversionService  reportConversionService = context.getBean(ReportConversionService.class);
		reportConversionService.convertReport("DOC" , null);
		
	}

}
