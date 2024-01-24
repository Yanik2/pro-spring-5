package org.example;

import org.example.singer.Singer;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
  public static void main(String[] args) {
    final var context = new GenericXmlApplicationContext();
    context.load("classpath:prop-editor-app-context.xml");
    context.refresh();

    Singer singer = context.getBean("eric", Singer.class);
    System.out.println(singer);
    singer = context.getBean("countrySinger", Singer.class);
    System.out.println(singer);
    context.close();
  }
}