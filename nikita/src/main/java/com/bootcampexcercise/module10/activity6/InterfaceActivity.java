package com.bootcampexcercise.module10.activity6;

public class InterfaceActivity {
    public static void main(String[]args){
        Vehicle bike = new Bike();
        bike.start();
        bike.stop();
        System.out.println();

        Vehicle car = new Car();
        car.start();
        car.stop();
    }
}
