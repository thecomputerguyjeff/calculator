package com.ti.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SuppressWarnings("MagicConstant")
@RunWith(MockitoJUnitRunner.class)
public class CalculatorControllerTest {

    @Mock
    private CalculatorService calculatorService;

    @InjectMocks
    private CalculatorController calculatorController;

    @Test
    public void add_returnsTheResultThatServiceAddReturned() throws Exception {
        when(calculatorService.add(any(),any())).thenReturn(3);
        assertThat(calculatorController.add(100,200)).isEqualTo(3);
        verify(calculatorService).add(100, 200);
    }

    @Test
    public void add_returnsTheResultThatServiceAddReturned2() throws Exception {
        when(calculatorService.add(any(),any())).thenReturn(4);
        assertThat(calculatorController.add(100,200)).isEqualTo(4);
        verify(calculatorService).add(100, 200);
    }

    @Test
    public void add_callsCalculatorSericeWithSameStuffItWasCalledWith() throws Exception {
        when(calculatorService.add(2,3)).thenReturn(5);
        assertThat(calculatorController.add(2,3)).isEqualTo(5);
    }

    @Test
    public void divideReturnsResultThatServiceDivideReturned() throws Exception {
        when(calculatorService.divide(any(),any())).thenReturn(5);
        assertThat(calculatorController.divide(100,25)).isEqualTo(5);
        verify(calculatorService).divide(100,25);
    }

    @Test
    public void subtract_returnsResultServiceReturned() throws  Exception{

        when(calculatorService.subtract(70, 80)).thenReturn(5);
        assertThat(calculatorController.subtract(70, 80)).isEqualTo(5);
        verify(calculatorService).subtract(70,80);
    }

    @Test
    public void subtract_returnsResultServiceReturned2() throws  Exception {
        when(calculatorService.subtract(any(), any())).thenReturn(4);
        assertThat(calculatorController.subtract(70, 80)).isEqualTo(4);
    }

    @Test
    public void divideReturnsResultThatServiceDivideReturned2() throws Exception {
        when(calculatorService.divide(any(), any())).thenReturn(3);
        assertThat(calculatorController.divide(18, 6)).isEqualTo(3);
        verify(calculatorService).divide(18, 6);
    }

    @Test
    public void divideCallsServiceDivideWithSameParameters(){
        when(calculatorService.divide(12,3)).thenReturn(4);
        assertThat(calculatorController.divide(12,3)).isEqualTo(4);
    }
    @Test
    public void multiply_ReturnsResultThatServiceMultiplyReturned(){
        when(calculatorService.multiply(any(),any())).thenReturn(8);
        assertThat(calculatorController.multiply(3,5)).isEqualTo(8);
        verify(calculatorService).multiply(3,5);
    }
    @Test
    public void multiply_ReturnsResultThatServiceMultiplyReturned2(){
        when(calculatorService.multiply(any(),any())).thenReturn(25);
        assertThat(calculatorController.multiply(67,87)).isEqualTo(25);
        verify(calculatorService).multiply(67,87);
    }
    @Test
    public void multiply_CallsCalculatorServiceWithSameStuffItWasCalledWith(){
        when(calculatorService.multiply(5,6)).thenReturn(30);
        assertThat(calculatorController.multiply(5,6)).isEqualTo(30);
    }

    @Test
    public  void subtract_callsServiceWithSameStuffCalledWith() throws Exception{
        when(calculatorService.subtract(2, 3)).thenReturn(-1);
        assertThat(calculatorController.subtract(2, 3)).isEqualTo(-1);
    }
}