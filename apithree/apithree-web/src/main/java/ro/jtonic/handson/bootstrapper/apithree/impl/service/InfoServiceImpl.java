package ro.jtonic.handson.bootstrapper.apithree.impl.service;

import org.springframework.stereotype.Component;
import ro.jtonic.handson.bootstrapper.apithree.api.InfoService;

@Component
public class InfoServiceImpl implements InfoService {

  @Override
  public String getDescription() {
    return "[ApiThreeWeb implementation] Description";
  }
}
