package ro.jtonic.handson.bootstrapper.apithree.impl.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.jtonic.handson.bootstrapper.apithree.api.InfoService;

@RestController
@RequestMapping("/apithree")
public class ApiThreeController {

  private final InfoService infoService;

  public ApiThreeController(InfoService infoService) {
    this.infoService = infoService;
  }

  @GetMapping
  public String getDescription() {
    return infoService.getDescription();
  }
}
