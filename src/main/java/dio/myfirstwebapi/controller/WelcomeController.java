package dio.myfirstwebapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController                                         // Torna  a classe em um component "visível" externamente por HTTP.
public class WelcomeController {

    @GetMapping
    public String welcome(){
        return "Welcome to my Spring Boot Web API";
    }
}
