package com.github.gsManuel.Exercise_2.service.calculatorOperationTests;

import com.github.gsManuel.Exercise_2.service.CalculatorOperation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
public class SubTests {
    private final CalculatorOperation calculator = mock(CalculatorOperation.class);

    @Test
    void givenCorrectParams_whenAdd_thenCorrectResult() {
        assertEquals(-1, calculator.add(4, 5));
        assertEquals(5, calculator.add(10, 5));
        assertEquals(-0.5, calculator.add(0, 0.5));
    }

}
