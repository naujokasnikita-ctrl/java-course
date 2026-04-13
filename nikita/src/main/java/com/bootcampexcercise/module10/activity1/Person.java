package com.bootcampexcercise.module10.activity1;

public abstract class Person {
    protected String name;
    protected int age;
    //getter and setters
    public String getName() {

        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {

        return age;
    }
    public void setAge(int age){

        this.age = age;
    }
    public abstract void introduce();

}
