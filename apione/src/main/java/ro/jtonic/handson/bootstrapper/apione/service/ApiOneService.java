package ro.jtonic.handson.bootstrapper.apione.service;

import org.springframework.stereotype.Component;
import ro.jtonic.handson.bootstrapper.apione.config.ApiOneProperties;
import ro.jtonic.handson.bootstrapper.common.config.KafkaConfig;

@Component
public class ApiOneService {

  private final ApiOneProperties apiOneProperties;
  private final KafkaConfig kafkaConfig;

  public ApiOneService(
      ApiOneProperties apiOneProperties,
      KafkaConfig kafkaConfig) {
    this.apiOneProperties = apiOneProperties;
    this.kafkaConfig = kafkaConfig;
  }

  public String get() {
    final String name = apiOneProperties.getName();
    kafkaConfig.send(String.format("Sending %s", name));
    return name;
  }
}
