package ir.freeland.spring.initialspringboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ApplicationSpringboot implements CommandLineRunner {
  private final ApplicationContext context;

  public ApplicationSpringboot(ApplicationContext context) {
    this.context = context;
  }

  public static void main(String[] args) {
    SpringApplication.run(ApplicationSpringboot.class, args);
  }

  @Override
  public void run(String... args) {
    CalculationSetterInjection calculationSetterInjection = context.getBean(CalculationSetterInjection.class);
    calculationSetterInjection.complexCalculation();

    CalculationConstructorInjection calculationConstructorInjection = context.getBean(CalculationConstructorInjection.class);
    calculationConstructorInjection.complexCalculation();
    
    CalculationFiledInjection calculationFiledInjection = context.getBean(CalculationFiledInjection.class);
    calculationFiledInjection.complexCalculation();
  }
}

