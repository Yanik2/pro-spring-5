package org.example.main;

import org.example.config.AppConfig;
import org.example.singer.Singer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class ConversionDemo {
  public static void main(String[] args) {
    final var context = new AnnotationConfigApplicationContext(AppConfig.class);

    Singer singer = context.getBean(Singer.class);
    System.out.println(singer);
  }
}
