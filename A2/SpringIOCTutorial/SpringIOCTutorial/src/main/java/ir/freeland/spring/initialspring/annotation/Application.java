package ir.freeland.spring.initialspring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class  Application {
  @SuppressWarnings("resource")
public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_annotation.xml");
    
    
    CalculationSetterInjection calculationSetterInjection = context.getBean(CalculationSetterInjection.class);
    calculationSetterInjection.complexCalculation();

    CalculationConstructorInjection calculationConstructorInjection = context.getBean(CalculationConstructorInjection.class);
    calculationConstructorInjection.complexCalculation();
    
    CalculationFiledInjection calculationFiledInjection = context.getBean(CalculationFiledInjection.class);
    calculationFiledInjection.complexCalculation();
  }
}
