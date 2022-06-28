package com.github.gsManuel.Exercise_2.service;

import com.github.gsManuel.Exercise_2.controllers.Operations;
import com.github.gsManuel.Exercise_2.exceptions.IAException;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class CalculatorOperation implements Operations {

    Scanner sc = new Scanner(System.in);

    private double a;
    private double b;
    private double ans;

    public void add() {
        ans = Operations.add(a, b);
    }

    public void sub() {
        ans = Operations.sub(a, b);
    }

    public void mul() {
        ans = Operations.mul(a, b);
    }

    public void div() {
        ans = Operations.div(a, b);
    }

    /**
     * Method that make all the answer needed for execute the operation
     *
     * @return Character res
     * @throws IAException
     */
    public Character answers() throws IAException {
        askFirstNumber();
        char res = askOperation();
        askSecondNumber();
        return res;
    }

    public void printResult() {
        System.out.println("The result of the operation is: " + ans);
    }

    /**
     * Method that ask the user for first number to operate
     */
    private void askFirstNumber() {
        System.out.println("Give me the first number: " + "\n");
        a = sc.nextDouble();
        sc.close();
    }

    /**
     * Method that ask the user for second number to operate
     */
    private void askSecondNumber() {
        System.out.println("Give me the second number: " + "\n");
        b = sc.nextDouble();
        sc.close();
    }


    /**
     * Method that ask the user for operation he wants to resolve, if he writes an incorrect param an Exception is throwed
     * otherwise it returns a string with the operation that user wants.
     *
     * @return Character res
     * @throws IAException
     */
    private Character askOperation() throws IAException {
        System.out.println("Give me the operation you want to realize, you can choose between: '+', '-', '*', '/' " + "\n");
        char res = sc.next().charAt(0);
        switch (res) {
            case '+':
                sc.close();
                return res;
            case '-':
                sc.close();
                return res;
            case '*':
                sc.close();
                return res;
            case '/':
                sc.close();
                return res;
            default:
                sc.close();
                throw new IAException("Incorrect parameter for operation ");
        }
    }
}
