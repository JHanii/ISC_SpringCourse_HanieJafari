package ir.freeland.spring.initialspring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalculationSetterInjection {
  private Calculator calculator;
  private Display display;

  public void complexCalculation() {
    int result = calculator.plus(2, 3);

    display.output(String.format("2 + 3 = %d", result));
  }

  @Autowired
  public void setCalculator(Calculator calculator) {
    this.calculator = calculator;
  }

  @Autowired
  public void setDisplay(Display display) {
    this.display = display;
  }
}
