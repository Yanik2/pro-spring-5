package org.example;

import org.example.async.TaskToExecute;
import org.example.config.AppAsyncTaskConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AsyncMain {
  public static void main(String[] args) {
    final var ac = new AnnotationConfigApplicationContext(AppAsyncTaskConfig.class);
    final var taskToExecute = ac.getBean(TaskToExecute.class);

    taskToExecute.taskToExecute();
    ac.close();
  }
}
