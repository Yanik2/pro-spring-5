package org.example;

import java.util.concurrent.TimeUnit;
import org.example.annotation.AnnotatedTaskService;
import org.example.config.AnnotationTaskConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationMain {
  public static void main(String[] args) throws InterruptedException {
    final var ac = new AnnotationConfigApplicationContext(AnnotationTaskConfig.class);
    final var service = ac.getBean(AnnotatedTaskService.class);

    TimeUnit.SECONDS.sleep(5);

    ac.close();
  }
}
