package com.bootcampexcercise.module10.activity3;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.err.println("Error: Cannot divide by zero.");
            return 0;
        }
    }

    public int multiply(int a, int b) throws InvalidMultiplyInputException {
        try {
            if (a == 0 || b == 0) {
                throw new InvalidMultiplyInputException("Input cannot be zero");
            }
            return a * b;
        } catch (InvalidMultiplyInputException e) {
            System.err.println("Caught Custom Exception: " + e.getMessage());
            throw e; // Rethrowing after catching as per requirement
        }
    }
}


