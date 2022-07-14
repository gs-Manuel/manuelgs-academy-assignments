package com.github.gsManuel.Exercise_2.controllers;

import com.github.gsManuel.Exercise_2.service.CalculatorOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Calculator {

    private static final Logger logger = LoggerFactory.getLogger(Calculator.class);
    private final CalculatorOperation CO;

    public Calculator() {
        CO = new CalculatorOperation();
        logger.info("Turning on calculator");
    }

    @GetMapping("/")
    public String index() {
        logger.info("Accessing index page");
        return "<center><h1>Calculator</h1></center><br><br>" +
                "<p>Commands you can use: </p>" +
                "<p>/add?a=[number]&b=[number] </p>  " +
                "<p>/sub?a=[number]&b=[number]</p>" +
                "<p>/div?a=[number]&b=[number]</p>" +
                "<p>/mul?a=[number]&b=[number]</p>" +
                "<p>/ans </p>";
    }

    @GetMapping("/ans")
    public String showAns() {
        logger.info("Asking for ans ");
        return "The result of the operation is: " + CO.getAns();
    }

    @GetMapping("/mul")
    public String mul(@RequestParam double a, @RequestParam double b) {
        logger.info("Asking for mul");
        return "The result of the operation is: " + CO.mul(a, b);
    }

    @GetMapping("/div")
    public String div(@RequestParam double a, @RequestParam double b) {
        logger.info("Asking for div");
        return "The result of the operation is: " + CO.div(a, b);
    }

    @GetMapping("/sub")
    public String sub(@RequestParam double a, @RequestParam double b) {
        logger.info("Asking for sub");
        return "The result of the operation is: " + CO.sub(a, b);
    }

    @GetMapping("/add")
    public String add(@RequestParam double a, @RequestParam double b) {
        logger.info("Asking for add");
        return String.valueOf(CO.add(a, b));
    }


}
