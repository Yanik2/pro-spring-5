package org.example.main;

import org.example.config.AppValidatorConfig;
import org.example.singer.Singer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class ValidatorDemo {
  public static void main(String[] args) {
    final var ac = new AnnotationConfigApplicationContext(AppValidatorConfig.class);
    final var singer = new Singer();
    final var validator = ac.getBean("singerValidator", Validator.class);
    final var result = new BeanPropertyBindingResult(singer, "John");
    ValidationUtils.invokeValidator(validator, singer, result);

    result.getAllErrors().forEach(er -> System.out.println(er.getCode()));
  }
}
