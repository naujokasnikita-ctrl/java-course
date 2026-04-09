package com.bootcampexcercise.module2;

public class FindInArray {
    public static void main(String[] args){
        // we create a integer number array
        int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,21};
        // we try to find bigest number
        int largest = numbers[0];
//we crate a loop
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest){
                largest = numbers[i];
            }
        }
        System.out.println("Largest number" + largest);
    }
}
