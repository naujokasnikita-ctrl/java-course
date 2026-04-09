package com.bootcampexcercise.module2;

public class FindLargest {
    public static void main(String[] args) {
        int x = 10;
        int y = 88;
        int z = 2;
// we asume that int x is the largest
        int largest = x;
//we check if y is bigger then x
        if (y > largest) {
            largest = y;

        }
//we check if z is bigger then the curent largest number
        if (z > largest) {
            largest = z;

        }
        System.out.println("largest: " + largest);
    }
}
