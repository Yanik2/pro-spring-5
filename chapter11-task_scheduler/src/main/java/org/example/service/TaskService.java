package org.example.service;

import org.springframework.stereotype.Service;

@Service
public class TaskService {

  public void scheduledTask() {
    System.out.println(Thread.currentThread().getName());
    System.out.println("Scheduled task execution...");
  }
}
