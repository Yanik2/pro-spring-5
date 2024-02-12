package org.example.config;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.util.Locale;
import org.example.formatter.ApplicationConversionServiceFactoryBean;
import org.example.singer.Singer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example.formatter")
public class AppConfigFormatter {

  @Autowired
  private ApplicationConversionServiceFactoryBean conversionService;

  @Bean
  public Singer singer() throws MalformedURLException, ParseException {
    final var singer = new Singer();
    singer.setFirstName("John");
    singer.setLastName("Mayer");
    singer.setPersonalSite(new URL("http://google.com"));
    singer.setBirthDate(
        conversionService.getDateTimeFormatter().parse("1977-10-16", Locale.ENGLISH));
    return singer;
  }
}
