package org.example.asserttrue;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import java.util.Set;
import org.springframework.stereotype.Service;

@Service
public class AssertTrueValidationService {
  private final Validator validator;

  public AssertTrueValidationService(Validator validator) {
    this.validator = validator;
  }

  public Set<ConstraintViolation<Singer>> validateSinger(Singer singer) {
    return validator.validate(singer);
  }
}
