package com.bootcampexcercise.module3;

public class CarInstences {
    public static void main(String[] args){
        //only car name
        Car car1 =new Car("volvoXC60");
        System.out.println("car name:" + car1.getName());

        //car with all parameters
        Car car2 = new Car("volvoXC90", "blue",2018 );

        System.out.println("Vehicle parameters");
        System.out.println("name" + car2.getName());
        System.out.println("color" + car2.getColor());
        System.out.println("year of manufacture" + car2.getModelNo());

    }
}
