package ro.jtonic.handson.bootstrapper.apione.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.jtonic.handson.bootstrapper.apione.service.ApiOneService;

@RestController
@RequestMapping("/apione")
public class ApiOneController {

  private final ApiOneService apiOneService;

  public ApiOneController(ApiOneService apiOneService) {
    this.apiOneService = apiOneService;
  }

  @GetMapping
  public String get() {
    return apiOneService.get();
  }
}
