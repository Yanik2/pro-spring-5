package org.example.beanvalidation;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Singer {
  @NotNull
  @Size(min=2, max=60)
  private String firstName;

  private String lastName;

  @NotNull
  private Genre genre;

  private Gender gender;
}
