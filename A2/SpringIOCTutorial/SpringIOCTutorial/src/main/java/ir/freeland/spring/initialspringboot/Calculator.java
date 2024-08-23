package ir.freeland.spring.initialspringboot;

import org.springframework.stereotype.Service;

/**
 * Simple integer math methods
 *
 * Used only for demonstration purposes :P
 */
@Service
public class Calculator {
  public int plus(int a, int b) {
    return a + b;
  }

  public int minus(int a, int b) {
    return a - b;
  }

  public int multiply(int a, int b) {
    return a * b;
  }

  public int divide(int a, int b) {
    return a / b;
  }
}
