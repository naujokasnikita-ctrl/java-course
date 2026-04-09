package com.bootcampexcercise.module2;

public class MultiplicationTable {
    public static void main(String[] args) {
    int firstnum = 11;
    int secondnum = 20;

    // we make a cirke we set the star position the end and the step
    for (int i = firstnum; i <= secondnum; i = i+1 ){
        // we print
        System.out.println("multiplication table" + i + "");
        // we multiply each number
        for (int k = 1; k <= 10; k++ ){
            System.out.println(i + "x" + k + " = " + (i * k));
        }
        System.out.println();
     }
    }
}
