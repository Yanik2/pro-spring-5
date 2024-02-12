package org.example.formatter;

import jakarta.annotation.PostConstruct;
import java.text.ParseException;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.format.Formatter;
import org.springframework.format.support.FormattingConversionServiceFactoryBean;
import org.springframework.stereotype.Component;

@Component("conversionService")
public class ApplicationConversionServiceFactoryBean
    extends FormattingConversionServiceFactoryBean {

  private DateTimeFormatter dateTimeFormatter;
  private Set<Formatter<?>> formatters = new HashSet<>();

  @PostConstruct
  void init() {
    this.dateTimeFormatter = DateTimeFormat.forPattern("yyyy-MM-dd");
    formatters.add(getDateTimeFormatter());
    this.setFormatters(formatters);
  }

  public Formatter<DateTime> getDateTimeFormatter() {
    return new Formatter<>() {
      @Override
      public DateTime parse(String text, Locale locale) throws ParseException {
        return dateTimeFormatter.parseDateTime(text);
      }

      @Override
      public String print(DateTime object, Locale locale) {
        return dateTimeFormatter.print(object);
      }
    };
  }
}
