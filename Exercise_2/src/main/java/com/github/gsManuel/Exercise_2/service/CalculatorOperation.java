package com.github.gsManuel.Exercise_2.service;

import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class CalculatorOperation {

    Scanner sc = new Scanner(System.in);

    private double a;
    private double b;
    private double ans;

    public double mul(double a, double b) {
        ans = a * b;
        return ans;
    }

    public double div(double a, double b) {
        ans = a / b;
        return ans;
    }

    public double sub(double a, double b) {
        ans = a - b;
        return ans;
    }

    public double add(double a, double b) {
        ans = a + b;
        return ans;
    }

    public double getAns() {
        return ans;
    }
}
