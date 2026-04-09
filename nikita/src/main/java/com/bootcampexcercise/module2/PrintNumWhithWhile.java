package com.bootcampexcercise.module2;

public class PrintNumWhithWhile {
    public static void main(String[] args){
        // we show the starting number
        int number1 = 1;
        // we create a loop to check is number1 still smaller then 100
        while (number1 < 100) {
            // we print the current odd number that is 1
            System.out.println(number1);
            // we add a step that gose every 2 number to ensure we get only the odd
            number1 = number1 + 2;
        }
    }
}
