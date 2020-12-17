package ro.jtonic.handson.bootstrapper.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationExcludeFilter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.TypeExcludeFilter;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.event.EventListener;
import ro.jtonic.handson.bootstrapper.common.annotation.EntryPoint;

/*
 * Readme:
 *  - The Bootstrap delegates the bean registration do APIs (modules).
 *  - It does not interfere in bean registration.
 */
@SpringBootApplication
@ComponentScan(
    useDefaultFilters = false,
    basePackages = "ro.jtonic.handson.bootstrapper",
    excludeFilters = {
        @Filter(type = FilterType.CUSTOM, classes = TypeExcludeFilter.class),
        @Filter(type = FilterType.CUSTOM, classes = AutoConfigurationExcludeFilter.class)
    },
    includeFilters = {
        @Filter(type = FilterType.ANNOTATION, classes = EntryPoint.class)
    }
)
public class Bootstrap {

  public static void main(String[] args) {
    SpringApplication.run(Bootstrap.class, args);
  }

  private final Logger LOG = LoggerFactory.getLogger(getClass());

  @EventListener
  public void showBeansRegistered(ApplicationReadyEvent event) {
    String[] beanNames = event.getApplicationContext()
        .getBeanDefinitionNames();

    for (String beanName : beanNames) {
      LOG.info("Loaded beans: {}", beanName);
    }
  }
}
