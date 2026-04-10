package com.bootcampexcercise.module8;

public class Student {
    private int id;
    private String name;
    private double grade;

    //we create the constructor
    public Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    //getter for id
    public int getId() {
        return id;
    }

    //setter for id
    public void setId(int id) {
        this.id = id;
    }

    //getter for name
    public String getName() {
        return name;
    }

    //setter for name
    public void setName(String name) {
        this.name = name;
    }

    //getter for grade
    public double getGrade() {
        return grade;
    }

    //setter for grade
    public void setGrade(double grade) {
        this.grade = grade;
    }
// the print for a student that contains id name and grade
    public void printStudent() {
        System.out.println("id: " + id + "name: " + name + "grade: " + grade );
    }
}
