package com.bootcampexcercise.modul.exercises;

public class AddWholeNum {
    public static void main(String []args) {
        int firstnum = 50;
        int secondnum = 100;
        int sum = 0;
       // for cikle 1 nurodai ciklo pradzia;nurodai ciklo pabaiga;nurodai ciklo eiga
        for (int i = firstnum; i <= secondnum; i = i+1 )
        {
            sum = sum + i;
        }
        System.out.println("sum of numbers from 50 to 100 is " + sum);
    }
}
