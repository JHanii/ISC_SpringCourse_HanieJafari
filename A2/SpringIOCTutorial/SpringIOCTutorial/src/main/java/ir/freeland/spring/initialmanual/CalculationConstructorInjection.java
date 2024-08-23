package ir.freeland.spring.initialmanual;

public class CalculationConstructorInjection {
  private final Calculator calculator;
  private final Display display;

  public CalculationConstructorInjection(Calculator calculator, Display display) {
    this.calculator = calculator;
    this.display = display;
  }

  public void complexCalculation() {
    int result = calculator.plus(2, 3);

    display.output(String.format("2 + 3 = %d", result));
  }
}
