package cz.ibisoft.utils.echo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class EchoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EchoApplication.class, args);
    }
}

@RestController
class EcchoController {

    @GetMapping("/echo")
    public String echo() {
        return "Echo echo echo...";
    }
}
