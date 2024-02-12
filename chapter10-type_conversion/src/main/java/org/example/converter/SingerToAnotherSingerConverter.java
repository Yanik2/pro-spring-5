package org.example.converter;

import org.example.singer.AnotherSinger;
import org.example.singer.Singer;
import org.springframework.core.convert.converter.Converter;

public class SingerToAnotherSingerConverter implements Converter<Singer, AnotherSinger> {
  @Override
  public AnotherSinger convert(Singer source) {
    return new AnotherSinger(
        source.getLastName(),
        source.getFirstName(),
        source.getBirthDate(),
        source.getPersonalSite()
    );
  }
}
