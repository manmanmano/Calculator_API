package ee.taltech.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class FirstController {

    @GetMapping(value = "/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
