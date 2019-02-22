package com.ti.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements CalculatorInterface{

    public Integer add(Integer x, Integer y) {

        return x + y;
    }

    public Integer subtract(Integer x, Integer y){
        return x-y;
    }

    public Integer divide(Integer x, Integer y) {return x/y;}

    public Integer multiply(Integer x, Integer y) {
        return x*y;
    }
}