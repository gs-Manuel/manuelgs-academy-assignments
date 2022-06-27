package com.github.gsManuel.Exercise_2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface Operations {

    @GetMapping("/add")
    static double add(@RequestParam double a, @RequestParam double b) {
        return a + b;
    }

    @GetMapping("/sub")
    static double sub(@RequestParam double a, @RequestParam double b) {
        return a - b;
    }

    @GetMapping("/mul")
    static double mul(@RequestParam double a, @RequestParam double b) {
        return a * b;
    }

    @GetMapping("/div")
    static double div(@RequestParam double a, @RequestParam double b) {
        return a / b;
    }

}
