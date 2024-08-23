package ir.freeland.spring.initialmanual;

public class CalculationSetterInjection {
  private Calculator calculator;
  private Display display;

  public void complexCalculation() {
    int result = calculator.plus(2, 3);

    display.output(String.format("2 + 3 = %d", result));
  }

  public void setCalculator(Calculator calculator) {
    this.calculator = calculator;
  }

  public void setDisplay(Display display) {
    this.display = display;
  }
}
