package com.bootcampexcercise.module6;

public class Mammal {
    private Animal myAnimal;
    private String name;
   //construct
   public Mammal(String name){
       this.name = name;
   }
   //set animal
    public void setAnimal(Animal animal){
       myAnimal=animal;
    }
    // sleep method
    public void animalIsSleeping(){
       System.out.println("Animal with name: " + name + " is  ");
      //we call the sleep method
       myAnimal.sleep();

    }
    public void animalIsSpeking(){
       System.out.println("Animal with name: " + name +"is    ");
    }
}
