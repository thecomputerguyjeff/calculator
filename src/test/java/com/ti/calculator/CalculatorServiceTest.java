package com.ti.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorServiceTest {

    @InjectMocks
    private CalculatorService calculatorService;

    @Test
    public void add_returnsThree_whenOneandTwoArePassed() throws Exception {
        Integer actual = calculatorService.add(1,2);
        Integer expected = 3;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void add_returns4_whenTwoAndTwoArePassed() throws Exception {
        Integer actual = calculatorService.add(2,2);
        Integer expected = 4;
        assertThat(actual).isEqualTo(expected);
    }

    @Test(expected = NullPointerException.class)
    public void add_returns_whenTwoAndNullArePassed() throws Exception {
        Integer actual = calculatorService.add(2,null);

    }
    @Test
    public void divideReturns2WhenPassed6and3() throws Exception {
        Integer actual = calculatorService.divide(6,3);
        Integer expected = 2;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void divideReturns7When14and2arePassed() throws Exception {
        Integer actual = calculatorService.divide(14,2);
        Integer expected = 7;
        assertThat(actual). isEqualTo(expected);
    }
    @Test(expected = NullPointerException.class)
    public void divideReturnsErrorWhenNullPassed() throws Exception {
        Integer actual = calculatorService.divide(2,null);


    }
    @Test(expected = java.lang.ArithmeticException.class)
    public void divideThrowsExceptionWhenPassedZeroDivisor() throws Exception {
        Integer actual = calculatorService.divide(2,0);


    }
    @Test
    public void multiply_Returns4When2And2ArePassed()throws Exception{
        Integer actual=calculatorService.multiply(2,2);
        Integer expected=4;
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    public void multiply_Returns6When2And3ArePassed()throws Exception{
        Integer actual=calculatorService.multiply(2,3);
        Integer expected=6;
        assertThat(actual).isEqualTo(expected);
    }
    @Test(expected = NullPointerException.class)
    public void multiply_ReturnsWhen2AndNullArePassed()throws Exception{
        Integer actual=calculatorService.multiply(2,null);

    }

}