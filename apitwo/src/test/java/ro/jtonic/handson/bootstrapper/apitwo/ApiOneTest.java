package ro.jtonic.handson.bootstrapper.apitwo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import ro.jtonic.handson.bootstrapper.apitwo.service.ApiTwoService;

@SpringBootTest(classes = ApiTwo.class,
    properties = {"apitwo.name:Tony"})
@ActiveProfiles(profiles = {"default", "apione"})
public class ApiOneTest {

  @Autowired
  private ApiTwoService apiTwoService;

  @DisplayName("Bootstrap")
  @Test
  void testGet() {
    assertThat(apiTwoService).isNotNull();
    assertThat(apiTwoService.getName()).isEqualTo("Tony");
  }
}
