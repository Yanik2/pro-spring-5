package org.example.main;

import org.example.annotation.CountrySingerValidationService;
import org.example.annotation.Singer;
import org.example.beanvalidation.Genre;
import org.example.config.AppCountrySingerValidatorConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConstraintValidationDemo {
  public static void main(String[] args) {
    final var ac = new AnnotationConfigApplicationContext(AppCountrySingerValidatorConfig.class);
    final var validationService = ac.getBean(CountrySingerValidationService.class);
    final var singer = new Singer();
    singer.setFirstName("john");
    singer.setGenre(Genre.COUNTRY);

    final var violations = validationService.validateSinger(singer);
    System.out.println(violations);
  }
}
