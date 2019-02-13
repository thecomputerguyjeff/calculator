package com.ti.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public Integer add(Integer x, Integer y) {
        return x + y;
    }
}
