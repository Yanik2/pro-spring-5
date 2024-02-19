package client;

import config.RmiClientConfig;
import org.example.service.SingerService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = RmiClientConfig.class)
@ExtendWith(SpringExtension.class)
public class RmiTestClient {
  @Autowired
  private SingerService singerService;

  @Test
  void test() {
    final var singer = singerService.findById(1);
    System.out.println(singer);
  }
}
