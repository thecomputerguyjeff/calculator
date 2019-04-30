package com.ti.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
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
    public Object add(@PathVariable Integer x, @PathVariable Integer y) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, "*");
        return ResponseEntity.ok().headers(httpHeaders).body(calculatorService.add(x,y));
    }

    @GetMapping(value = "/subtract/{x}/{y}")
    public Integer subtract(@PathVariable Integer x, @PathVariable Integer y){
        return calculatorService.subtract(x,y);
    }


    @GetMapping(value = "/divide/{x}/{y}")
    public Integer divide(@PathVariable Integer x, @PathVariable Integer y){
        return calculatorService.divide(x,y);
    }
}
