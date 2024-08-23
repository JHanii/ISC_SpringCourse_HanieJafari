package ir.freeland.spring.initialspring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_xml.xml");

    CalculationSetterInjection calculationSetterInjection = context.getBean(CalculationSetterInjection.class);
    calculationSetterInjection.complexCalculation();

    CalculationConstructorInjection calculationConstructorInjection =
        (CalculationConstructorInjection) context.getBean("calculationConstructorInjection");
    calculationConstructorInjection.complexCalculation();
  }
}
