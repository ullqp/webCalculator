package hw.calculator.calculator.controller;

import hw.calculator.calculator.service.MathService;
import hw.calculator.calculator.service.MathServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class MathController {
    private final MathService mathService;

    public MathController(MathServiceImpl mathService) {
        this.mathService = mathService;
    }

    @GetMapping(path="/plus")
    public String calculateSum(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return mathService.calculateSum(num1, num2);
    }

    @GetMapping(path="/minus")
    public String calculateDif(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return mathService.calculateDif(num1, num2);
    }

    @GetMapping(path="/multiply")
    public String calculateMulti(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return mathService.calculateMulti(num1, num2);
    }

    @GetMapping(path="/divide")
    public String calculateDiv(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return mathService.calculateDiv(num1, num2);
    }

}
