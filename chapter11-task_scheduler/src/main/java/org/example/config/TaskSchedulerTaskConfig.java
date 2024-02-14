package org.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

@Configuration
@ComponentScan("org.example.annotation")
@EnableScheduling
public class TaskSchedulerTaskConfig {
  @Bean
  public TaskScheduler taskScheduler() {
    final var taskScheduler = new ThreadPoolTaskScheduler();
    taskScheduler.setPoolSize(9);
    return taskScheduler;
  }
}
