package org.example.beanvalidation;

public enum Genre {
  POP("P"),
  JAZZ("J"),
  BLUES("B"),
  COUNTRY("C");

  private String code;

  Genre(String code) {
    this.code = code;
  }
}
