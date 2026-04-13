package com.bootcampexcercise.module10.activity6;

public class Bike implements Vehicle {
    @Override
    public void start(){
        System.out.println("start the bike by pedaling");
    }
    @Override
    public void stop(){
        System.out.println("bike stops by pressing the brake handle");
    }
}
