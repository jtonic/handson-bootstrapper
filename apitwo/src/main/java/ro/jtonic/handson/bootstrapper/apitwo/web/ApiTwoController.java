package ro.jtonic.handson.bootstrapper.apitwo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.jtonic.handson.bootstrapper.apithree.api.InfoService;
import ro.jtonic.handson.bootstrapper.apitwo.service.ApiTwoService;

@RestController
@RequestMapping("/apitwo")
public class ApiTwoController {

  private final ApiTwoService apiTwoService;
  private final InfoService infoService;

  public ApiTwoController(ApiTwoService apiTwoService,
                          InfoService infoService) {
    this.apiTwoService = apiTwoService;
    this.infoService = infoService;
  }

  @GetMapping
  public String get() {
    return String.format("Name: %s", this.apiTwoService.getName());
  }

  @GetMapping("/description")
  public String getDescription() {
    return this.infoService.getDescription();
  }
}
