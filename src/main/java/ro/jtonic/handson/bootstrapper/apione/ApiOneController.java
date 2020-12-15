package ro.jtonic.handson.bootstrapper.apione;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apione")
public class ApiOneController {

  @GetMapping
  public String get() {
    return "One";
  }
}
