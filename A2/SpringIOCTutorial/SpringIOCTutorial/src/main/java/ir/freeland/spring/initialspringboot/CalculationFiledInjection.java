package ir.freeland.spring.initialspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalculationFiledInjection {
  @Autowired
  private Calculator calculator;
  
  @Autowired
  private Display display;

  public void complexCalculation() {
    int result = calculator.plus(2, 3);

    display.output(String.format("2 + 3 = %d", result));
  }

}
