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
}
