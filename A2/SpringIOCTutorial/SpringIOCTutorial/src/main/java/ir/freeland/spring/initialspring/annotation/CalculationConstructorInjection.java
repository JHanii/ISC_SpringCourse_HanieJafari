package ir.freeland.spring.initialspring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalculationConstructorInjection {
  private final Calculator calculator;
  private final Display display;

  // From Spring 4.3 a class with only one constructor does not need the autowired annotation
  @Autowired
  public CalculationConstructorInjection(Calculator calculator, Display display) {
    this.calculator = calculator;
    this.display = display;
  }

  public void complexCalculation() {
    int result = calculator.plus(2, 3);

    display.output(String.format("2 + 3 = %d", result));
  }
}
