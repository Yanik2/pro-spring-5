package org.example.annotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.example.beanvalidation.Genre;

public class CountrySingerValidator implements ConstraintValidator<CheckCountrySinger, Singer> {
  @Override
  public boolean isValid(Singer singer, ConstraintValidatorContext constraintValidatorContext) {
    if (Genre.COUNTRY.equals(singer.getGenre())) {
      return singer.getLastName() != null && singer.getGenre() != null;
    }
    return true;
  }
}
