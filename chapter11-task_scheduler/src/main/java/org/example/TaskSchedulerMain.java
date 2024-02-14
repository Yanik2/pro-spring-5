package org.example;

import java.util.concurrent.TimeUnit;
import org.example.config.TaskSchedulerTaskConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TaskSchedulerMain {
  public static void main(String[] args) throws InterruptedException {
    final var ac = new AnnotationConfigApplicationContext(TaskSchedulerTaskConfig.class);

    TimeUnit.SECONDS.sleep(5);

    ac.close();
  }
}
