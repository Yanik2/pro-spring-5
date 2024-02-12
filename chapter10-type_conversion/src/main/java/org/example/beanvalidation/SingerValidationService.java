package org.example.beanvalidation;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import java.util.Set;
import org.springframework.stereotype.Service;

@Service("singerValidationService")
public class SingerValidationService {

  private final Validator validator;

  public SingerValidationService(Validator validator) {
    this.validator = validator;
  }

  public Set<ConstraintViolation<Singer>> validateSinger(Singer singer) {
    return validator.validate(singer);
  }
}
