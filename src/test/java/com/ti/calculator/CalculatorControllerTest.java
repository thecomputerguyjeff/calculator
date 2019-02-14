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
    public void subtract_returnsResultServiceReturned() throws  Exception{

        when(calculatorService.subtract(70, 80)).thenReturn(5);
        assertThat(calculatorController.subtract(70, 80)).isEqualTo(5);
        verify(calculatorService).subtract(70,80);
    }

    @Test
    public void subtract_returnsResultServiceReturned2() throws  Exception{
        when(calculatorService.subtract(any(), any())).thenReturn(4);
        assertThat(calculatorController.subtract(70, 80)).isEqualTo(4);
    }

    @Test
    public  void subtract_callsServiceWithSameStuffCalledWith() throws Exception{
        when(calculatorService.subtract(2, 3)).thenReturn(-1);
        assertThat(calculatorController.subtract(2, 3)).isEqualTo(-1);
    }
}