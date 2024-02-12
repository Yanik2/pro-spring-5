package org.example.main;

import org.example.config.AppConfigFormatter;
import org.example.singer.Singer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FormatterDemo {
  public static void main(String[] args) {
    final var ac = new AnnotationConfigApplicationContext(AppConfigFormatter.class);
    final var singer = ac.getBean(Singer.class);

    System.out.println(singer);
  }
}
