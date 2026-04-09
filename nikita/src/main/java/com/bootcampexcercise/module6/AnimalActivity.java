package com.bootcampexcercise.module6;

public class AnimalActivity {
     public static void main(String arg[] ){
      //reference
         Animal cat = new Cat();
         Animal dog = new Dog();

         // Create an object
         Mammal mammal = new Mammal("Buster");
         //we set the animal as cat
         mammal.setAnimal(cat);
         mammal.animalIsSleeping();
         mammal.animalIsSpeking();

         System.out.println("----------");
         // we set the animal as dog
         mammal.setAnimal(dog);
         mammal.animalIsSleeping();
         mammal.animalIsSpeking();
     }
}
//Animal with name: Buster is
//Cat is sleeping
//Animal with name: Busteris
//----------
//Animal with name: Buster is
//Dog is sleeping!
//Animal with name: Busteris
//
//Process finished with exit code 0