package ir.freeland.spring.initialmanual;

public class Application {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    Display display = new Display();

    CalculationSetterInjection calculationSetterInjection = new CalculationSetterInjection();
    calculationSetterInjection.setCalculator(calculator);
    calculationSetterInjection.setDisplay(display);
    calculationSetterInjection.complexCalculation();

    CalculationConstructorInjection
        calculationConstructorInjection = new CalculationConstructorInjection(calculator, display);
    calculationConstructorInjection.complexCalculation();
  }
}
