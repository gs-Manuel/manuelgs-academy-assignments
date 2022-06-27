package com.github.gsManuel.Exercise_2.service;

import com.github.gsManuel.Exercise_2.controllers.CalculatorOperation;
import com.github.gsManuel.Exercise_2.exceptions.IAException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class Calculator {
    private static final Logger logger = LoggerFactory.getLogger(Calculator.class);
    private final CalculatorOperation CO;
    private boolean state = false;

    public Calculator(CalculatorOperation co) {
        this.CO = co;
    }

    private void run() {
        turnOn();
        int opCounter = 0;
        while (state == true) {
            try {
                char res = CO.answers();
                opCounter += 1;
                switch (res) {
                    case '+':
                        CO.add();
                        CO.printResult();
                    case '-':
                        CO.sub();
                        CO.printResult();
                    case '*':
                        CO.mul();
                        CO.printResult();
                    case '/':
                        CO.div();
                        CO.printResult();
                }
                //Ruptura en la 5a iteraccion
                if (opCounter < 5) {
                    turnOff();
                }
            } catch (IAException e) {
                logger.error(e.getMessage());
            }
        }
    }

    private void turnOn() {
        state = true;
    }

    private void turnOff() {
        state = false;
    }
}
