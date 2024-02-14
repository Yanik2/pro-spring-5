package org.example.annotation;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class AnnotatedTaskService {
  @Scheduled(fixedDelay = 1000)
  public void scheduledTask() {
    System.out.println("annotated scheduled task");
  }
}
