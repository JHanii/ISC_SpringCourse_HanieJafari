package ir.freeland.spring.assignment.validator;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

import java.util.Set;

import org.springframework.stereotype.Service;

@Service
public class ValidatingService {

  private Validator validator;

  public ValidatingService(Validator validator) {
    this.validator = validator;
  }

  public void validateInput(Input input) {
    ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    Validator validator = factory.getValidator();
    Set<ConstraintViolation<Input>> violations = validator.validate(input);
    if (!violations.isEmpty()) {
      throw new ConstraintViolationException(violations);
    }
  }

  public void validateInputWithInjectedValidator(Input input) {
    Set<ConstraintViolation<Input>> violations = validator.validate(input);
    if (!violations.isEmpty()) {
      throw new ConstraintViolationException(violations);
    }
  }
}