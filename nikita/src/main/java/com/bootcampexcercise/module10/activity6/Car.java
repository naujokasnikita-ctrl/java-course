package com.bootcampexcercise.module10.activity6;

public class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("car starts by presing the button");
    }
    @Override
    public void stop(){
        System.out.println("the car stops by presing the brake pedal");
    }
}
