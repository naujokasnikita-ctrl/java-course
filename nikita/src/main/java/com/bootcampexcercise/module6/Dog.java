package com.bootcampexcercise.module6;
// connect dog to animal (implement)
public class Dog implements Animal {

    @Override
    public void animalSound() {
        System.out.println("Dog says: 'Bark Bark!");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping!");

    }
}

