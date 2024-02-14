package org.example.async;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Component;

@Component
public class TaskToExecute {

  private final TaskExecutor taskExecutor;

  public TaskToExecute(TaskExecutor taskExecutor) {
    this.taskExecutor = taskExecutor;
  }

  public void taskToExecute() {
    taskExecutor.execute(() -> {
      for (int i = 0; i < 10; i++) {
        System.out.println(Thread.currentThread().getName());
      }
    });
  }
}
