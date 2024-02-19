package config;

import org.example.service.SingerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;

@Configuration
public class RmiClientConfig {

  @Bean
  public SingerService singerService() {
    final var proxy = new HttpInvokerProxyFactoryBean();
    proxy.setServiceInterface(SingerService.class);
    proxy.setServiceUrl("http://localhost:8080/invoker/httpInvoker/singerService");
    proxy.afterPropertiesSet();
    return (SingerService) proxy.getObject();
  }
}
