package hw.calculator.calculator.controller;

import hw.calculator.calculator.service.HelloService;
import hw.calculator.calculator.service.HelloServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final HelloService helloService;

    public HelloController(HelloServiceImpl helloService) {
        this.helloService = helloService;
    }

    @GetMapping(path="/calculator")
    public String hello() {
        return helloService.hello();
    }

}
