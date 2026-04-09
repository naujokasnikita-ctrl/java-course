package com.bootcampexcercise.module5;

public class Person_I {
    // we create the persons attributes
    public String name;
    public int age;


    // the default constructor
    public Person_I() {
        this.name = "Uknown";
        this.age = 0;
        System.out.println("I am Person_I");
    }

    //whit parameters behavior
    public Person_I(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getter string name
    public String getName(){ return name; }

    //setter for string name
    public void setName(String name) { this.name = name; }

    //getter for int age
    public int getAge() {return age;}

    //setter for int age
    public void setAge(int age) {this.age = age;}

    public void announce() {System.out.println("inside person class");}
}
