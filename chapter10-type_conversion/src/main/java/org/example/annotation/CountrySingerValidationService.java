package org.example.annotation;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import java.util.Set;
import org.springframework.stereotype.Service;

@Service
public class CountrySingerValidationService {
  private final Validator validator;

  public CountrySingerValidationService(Validator validator) {
    this.validator = validator;
  }

  public Set<ConstraintViolation<Singer>> validateSinger(Singer singer) {
    return validator.validate(singer);
  }
}
