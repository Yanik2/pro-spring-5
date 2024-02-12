package org.example.main;

import org.example.beanvalidation.Singer;
import org.example.beanvalidation.SingerValidationService;
import org.example.config.AppValidationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ValidationDemo {
  public static void main(String[] args) {
    final var ac = new AnnotationConfigApplicationContext(AppValidationConfig.class);
    final var validationService = ac.getBean(SingerValidationService.class);
    final var singer = new Singer();

    final var violations = validationService.validateSinger(singer);

    System.out.println(violations);
  }
}
