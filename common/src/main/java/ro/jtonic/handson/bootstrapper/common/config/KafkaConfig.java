package ro.jtonic.handson.bootstrapper.common.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfig {

  public boolean send(String msg) {
    System.out.printf("Message send by kafka: %s%n", msg);
    return true;
  }
}
