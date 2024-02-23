package org.example.dsl;

import org.joda.time.DateTime;

public class Singer {
    private String firstName;
    private String lastName;
    private DateTime birthDate;
    private String ageCategory;

    public Singer(String firstName, String lastName, DateTime birthDate, String ageCategory) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.ageCategory = ageCategory;
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

    public DateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(DateTime birthDate) {
        this.birthDate = birthDate;
    }

    public String getAgeCategory() {
        return ageCategory;
    }

    public void setAgeCategory(String ageCategory) {
        this.ageCategory = ageCategory;
    }

    @Override
    public String toString() {
        return "Singer{" +
            "firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", birthDate='" + birthDate + '\'' +
            ", ageCategory='" + ageCategory + '\'' +
            '}';
    }
}
