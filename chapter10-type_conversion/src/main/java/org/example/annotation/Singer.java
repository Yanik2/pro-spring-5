package org.example.annotation;

import org.example.beanvalidation.Gender;
import org.example.beanvalidation.Genre;

@CheckCountrySinger
public class Singer {
  private String firstName;
  private String lastName;
  private Genre genre;
  private Gender gender;

  public Singer(String firstName, String lastName, Genre genre, Gender gender) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.genre = genre;
    this.gender = gender;
  }

  public Singer() {
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Genre getGenre() {
    return genre;
  }

  public void setGenre(Genre genre) {
    this.genre = genre;
  }

  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }
}
