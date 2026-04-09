package com.bootcampexcercise.module2;

public class AddWholeNum {
    public static void main(String []args) {
        int firstnum = 50;
        int secondnum = 100;
        int sum = 0;
       // we crate a loop and in it show the star the end and the step
        for (int i = firstnum; i <= secondnum; i = i+1 )
        {
            sum = sum + i;
        }
        System.out.println("sum of numbers from 50 to 100 is " + sum);
    }
}
