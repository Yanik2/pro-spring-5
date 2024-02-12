package org.example.main;

import org.example.singer.AnotherSinger;
import org.example.config.AppConfigWithConverter;
import org.example.singer.Singer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.convert.ConversionService;

public class SingerToAnotherSingerConversionDemo {
  public static void main(String [] args) {
    final var ac = new AnnotationConfigApplicationContext(AppConfigWithConverter.class);
    final var conversionService = ac.getBean(ConversionService.class);
    final var singer = ac.getBean(Singer.class);
    final var anotherSinger = conversionService.convert(singer, AnotherSinger.class);

    System.out.println(anotherSinger);
  }
}
