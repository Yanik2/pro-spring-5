package org.example;

import java.util.concurrent.TimeUnit;
import org.example.config.TaskConfig;
import org.example.service.TaskService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  public static void main(String[] args) throws InterruptedException {
    final var ac = new AnnotationConfigApplicationContext(TaskConfig.class);
    final var taskService = ac.getBean(TaskService.class);
    System.out.println(Thread.currentThread().getName());
    TimeUnit.SECONDS.sleep(15);
    System.out.println("Should be closed");
    ac.close();
  }
}