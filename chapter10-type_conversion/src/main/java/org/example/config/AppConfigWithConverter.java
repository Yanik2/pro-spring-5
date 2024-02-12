package org.example.config;

import java.net.URL;
import java.util.HashSet;
import java.util.Set;
import org.example.converter.SingerToAnotherSingerConverter;
import org.example.converter.StringToDateTimeConverter;
import org.example.singer.Singer;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.convert.converter.Converter;

@PropertySource("classpath:application.properties")
@Configuration
@ComponentScan(basePackages = "org.example")
public class AppConfigWithConverter {

  @Value("${date.format.pattern}")
  private String dateTimePattern;

  @Bean
  public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
    return new PropertySourcesPlaceholderConfigurer();
  }

  @Bean
  public Singer john(@Value("${countrySinger.firstName}") String firstName,
                     @Value("${countrySinger.lastName}") String lastName,
                     @Value("${countrySinger.birthDate}") DateTime birthDate,
                     @Value("${countrySinger.personalSite}") URL personalSite) {
    Singer singer = new Singer();
    singer.setFirstName(firstName);
    singer.setLastName(lastName);
    singer.setBirthDate(birthDate);
    singer.setPersonalSite(personalSite);
    return singer;
  }

  @Bean
  public ConversionServiceFactoryBean conversionService() {
    ConversionServiceFactoryBean conversionService = new ConversionServiceFactoryBean();
    Set<Converter> convs = new HashSet<>();
    convs.add(converter());
    convs.add(singerToAnotherSingerConverter());

    conversionService.setConverters(convs);
    conversionService.afterPropertiesSet();
    return conversionService;
  }

  @Bean
  public SingerToAnotherSingerConverter singerToAnotherSingerConverter() {
    return new SingerToAnotherSingerConverter();
  }

  @Bean
  public StringToDateTimeConverter converter() {
    final var converter = new StringToDateTimeConverter();
    converter.init();
    return converter;
  }
}
