package com.github.gsManuel.Exercise_2.config;

import com.github.gsManuel.Exercise_2.controllers.CalculatorOperation;
import com.github.gsManuel.Exercise_2.service.Calculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public CalculatorOperation calculatorOperation(){
        return new CalculatorOperation();
    }
    @Bean
    public Calculator calculator(CalculatorOperation co){
        return new Calculator(co);
    }
}
