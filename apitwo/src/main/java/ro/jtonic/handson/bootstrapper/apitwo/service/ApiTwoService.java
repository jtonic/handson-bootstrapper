package ro.jtonic.handson.bootstrapper.apitwo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ApiTwoService {

  private final String name;

  public ApiTwoService(@Value("${apitwo.name}") String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
