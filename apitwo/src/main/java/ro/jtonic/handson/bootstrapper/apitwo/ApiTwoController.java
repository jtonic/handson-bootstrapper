package ro.jtonic.handson.bootstrapper.apitwo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apitwo")
public class ApiTwoController {

  @GetMapping
  public String get() {
    return "Two";
  }
}
