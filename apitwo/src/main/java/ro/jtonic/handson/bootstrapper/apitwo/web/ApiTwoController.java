package ro.jtonic.handson.bootstrapper.apitwo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.jtonic.handson.bootstrapper.apitwo.service.ApiTwoService;

@RestController
@RequestMapping("/apitwo")
public class ApiTwoController {

  private final ApiTwoService apiTwoService;

  public ApiTwoController(ApiTwoService apiTwoService) {
    this.apiTwoService = apiTwoService;
  }

  @GetMapping
  public String get() {
    return String.format("Name: %s", this.apiTwoService.getName());
  }
}
