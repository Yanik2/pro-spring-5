package org.example.singer;

import java.net.URL;
import org.joda.time.DateTime;

public class AnotherSinger {
  private String firstName;
  private String lastName;
  private DateTime birthDate;
  private URL personalSite;

  public AnotherSinger(String firstName, String lastName, DateTime birthDate, URL personalSite) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthDate = birthDate;
    this.personalSite = personalSite;
  }

  public AnotherSinger() {
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

  public DateTime getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(DateTime birthDate) {
    this.birthDate = birthDate;
  }

  public URL getPersonalSite() {
    return personalSite;
  }

  public void setPersonalSite(URL personalSite) {
    this.personalSite = personalSite;
  }

  @Override
  public String toString() {
    return "AnotherSinger{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", birthDate=" + birthDate +
        ", personalSite=" + personalSite +
        '}';
  }
}
