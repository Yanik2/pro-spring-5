package org.example.main;

import org.example.asserttrue.AssertTrueValidationService;
import org.example.asserttrue.Singer;
import org.example.beanvalidation.Gender;
import org.example.beanvalidation.Genre;
import org.example.config.AppAssertTrueConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AssertTrueValidationDemo {
  public static void main(String[] args) {
    final var ac = new AnnotationConfigApplicationContext(AppAssertTrueConfig.class);
    final var validationService = ac.getBean(AssertTrueValidationService.class);
    final var singer = new Singer(
        "john",
        null,
        Genre.COUNTRY,
        Gender.MALE
    );

    final var violations = validationService.validateSinger(singer);
    System.out.println(violations);
  }
}
