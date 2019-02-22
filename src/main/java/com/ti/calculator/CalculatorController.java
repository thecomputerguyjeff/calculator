package com.ti.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping(value = "/add/{x}/{y}")
    public Integer add(@PathVariable Integer x, @PathVariable Integer y) {

        return calculatorService.add(x,y);

    }

    @GetMapping(value = "/subtract/{x}/{y}")
    public Integer subtract(@PathVariable Integer x, @PathVariable Integer y){
        return calculatorService.subtract(x,y);
    }


    @GetMapping(value = "/divide/{x}/{y}")
    public Integer divide(@PathVariable Integer x, @PathVariable Integer y){
        return calculatorService.divide(x,y);
    }

    @GetMapping(value = "/multiply/{x}/{y}")
    public Integer multiply(@PathVariable Integer x, @PathVariable Integer y){
        return calculatorService.multiply(x,y);
    }
}
