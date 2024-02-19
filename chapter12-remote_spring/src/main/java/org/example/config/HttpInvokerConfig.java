package org.example.config;

import org.example.service.SingerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;

@Configuration
public class HttpInvokerConfig {

  @Autowired
  private SingerService singerService;

  //last version of this is from 2009 year, so probably deprecated ;)
  @Bean(name = "/httpInvoker/singerService")
  public HttpInvokerServiceExporter httpInvokerServiceExporter() {
    final var invokerService = new HttpInvokerServiceExporter();
    invokerService.setService(singerService);
    invokerService.setServiceInterface(SingerService.class);
    return invokerService;
  }
}
