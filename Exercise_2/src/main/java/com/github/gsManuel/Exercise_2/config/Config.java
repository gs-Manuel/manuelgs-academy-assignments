package com.github.gsManuel.Exercise_2.config;

import com.github.gsManuel.Exercise_2.service.Calculator;
import com.github.gsManuel.Exercise_2.service.CalculatorOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("main.java.com.github.gsManuel.Exercise_2")
public class Config {
    @Bean
    public CalculatorOperation calculatorOperation() {
        return new CalculatorOperation();
    }
    
    public Calculator calculator(CalculatorOperation co) {
        return new Calculator(co);
    }
}
