package org.example.asserttrue;

import jakarta.validation.constraints.AssertTrue;
import org.example.beanvalidation.Gender;
import org.example.beanvalidation.Genre;

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

  @AssertTrue(message = "Should not have last name null")
  public boolean isCountrySinger() {
    if (Genre.COUNTRY.equals(this.genre)) {
      return this.lastName != null;
    }
    return true;
  }
}
