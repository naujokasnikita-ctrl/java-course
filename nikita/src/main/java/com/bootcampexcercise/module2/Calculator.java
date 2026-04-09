package com.bootcampexcercise.module2;

public class Calculator {
    public static void main(String[] args) {
        // we create 2 variables
        int number1 = 10;
        int number2 = 2;

        //we print the answer
        System.out.println("result");

        //method will retur an int
        System.out.println("Sum:" + sum(number1, number2));
        System.out.println("Subtract:" + subtract(number1, number2));
        System.out.println("Multiply:" + multiply(number1, number2));
        System.out.println("divide;" + divide(number1, number2));
    }
    // we return the sum
    public static int sum(int number1, int number2) {
        return number1 + number2;
    }
    // we return the subtract
    public static int subtract(int number1, int number2) {
        return number1 - number2;
    }
    //we return the multiplication
    public static int multiply(int number1, int number2) {
        return number1 * number2;
    }
    //we retur the division
    public static int divide(int number1, int number2) {
        return number1 /number2;
    }

}
