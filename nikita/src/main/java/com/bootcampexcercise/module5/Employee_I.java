package com.bootcampexcercise.module5;

public class Employee_I extends  Person_I {

    //attribures
    public int salary;
    public String title;


    //behavior def construct
    public Employee_I () { System.out.println("I am an employee_I construct");}

    //getter for the int salary
    public int getSalary() { return salary;}

    //setter for the int salary
    public void setSalary(int salary) {this.salary = salary;}

    //getter for string title
    public String getTitle() {return title;}

    //setter for string title
    public void setTitle(String title) {this.title = title;}

    public void announce() {
        super.announce();
        System.out.println("inside employee class");
    }

}
