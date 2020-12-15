package ro.jtonic.handson.bootstrapper.apione.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "apione")
public class ApiOneProperties {

  private String name = "none";
}
