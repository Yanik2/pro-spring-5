package org.example.groovy;

import java.io.IOException;
import org.example.dsl.Singer;
import org.example.dsl.SingerService;
import org.joda.time.DateTime;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DslMain {
    public static void main(String[] args) throws IOException {
        final var ac = new GenericXmlApplicationContext("classpath:app-context.xml");
        final var singerService = ac.getBean(SingerService.class);

        final var singer = new Singer();
        singer.setFirstName("john");
        singer.setLastName("tom");
        singer.setBirthDate(new DateTime(1977, 10, 16, 0,0,0,0));

        singerService.applyRule(singer);
        System.out.println(singer);

        System.in.read();

        singerService.applyRule(singer);
        System.out.println(singer);

        ac.close();
    }
}
