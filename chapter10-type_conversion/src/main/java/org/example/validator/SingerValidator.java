package org.example.validator;

import org.example.singer.Singer;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class SingerValidator implements Validator {
  @Override
  public boolean supports(Class<?> clazz) {
    return Singer.class.equals(clazz);
  }

  @Override
  public void validate(Object target, Errors errors) {
    ValidationUtils.rejectIfEmpty(errors, "firstName", "firstName.empty");
  }
}
