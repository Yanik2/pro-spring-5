package org.example.converter;

import jakarta.annotation.PostConstruct;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.core.convert.converter.Converter;

public class StringToDateTimeConverter implements Converter<String, DateTime> {
  private static final String DEFAULT_PATTERN = "yyyy-MM-dd";
  private DateTimeFormatter dateTimeFormatter;
  private String pattern = DEFAULT_PATTERN;

  @PostConstruct
  public void init() {
    this.dateTimeFormatter = DateTimeFormat.forPattern(pattern);
  }
  @Override
  public DateTime convert(String source) {
    return dateTimeFormatter.parseDateTime(source);
  }
}
