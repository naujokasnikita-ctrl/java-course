package com.bootcampexcercise.module3;

public class Calculator {

    //step 1,constant label
    public static final String CALC_TYPE_BASIC = "Basic";

    //step 2 stores the type for this calculator
    private String calculatorType;

    //step 3 construct builds the calculator
    public Calculator(String calculatorType) {
        this.calculatorType = calculatorType;
    }

    // allow the client to se the type
    public String getCalculatorType() {
        return calculatorType;
    }

    // add method
    public int add(int a, int b) {
        return a + b;
    }

    //subtract method
    public int subtract(int a, int b) {
        return a - b;
    }

    //multiply method using array
    public int multiply(int[] numbers) {
        int result = 1;
        for (int num : numbers) {result = result * num;}
        return result;
    }

    // divide method
    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("ERROR: DIVISION BY ZERO");
            return 0;
        }
        return a / b;
    }
}
