package com.github.gsManuel.Exercise_2.service.calculator;

import com.github.gsManuel.Exercise_2.service.Calculator;
import com.github.gsManuel.Exercise_2.service.CalculatorOperation;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class RunTest {
    private Calculator calculator;

    @BeforeAll
    public void setUp() {
        calculator = new Calculator(new CalculatorOperation());
    }

    @Test
    private void given_whenRun_thenIterate5times() {
    }
}
