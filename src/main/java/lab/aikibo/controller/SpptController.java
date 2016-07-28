package lab.aikibo.controller;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpptController {
  private final AtomicLong counter = new AtomicLong();

  @RequestMapping("/pbb/getSppt")
  public Sppt getSppt(@RequestParam(value="nop") String nop, @RequestParam(value="thn") String thn) {
    return new Sppt(nop, thn, "tamami", 10000);
  }
}
