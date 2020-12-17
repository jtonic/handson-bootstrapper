package ro.jtonic.handson.bootstrapper.apitwo;

import org.springframework.context.annotation.ComponentScan;
import ro.jtonic.handson.bootstrapper.common.annotation.EntryPoint;

@EntryPoint
@ComponentScan //fixme:In multi module springboot application better don't do this. Use @Bean
public class ApiTwoEntryPoint {

}
