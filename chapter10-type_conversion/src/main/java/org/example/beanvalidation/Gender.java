package org.example.beanvalidation;

public enum Gender {
  MALE("M"), FEMALE("F");

  private String code;

  Gender(String code) {
    this.code = code;
  }
}
