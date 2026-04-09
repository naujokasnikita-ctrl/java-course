package com.bootcampexcercise.module5;

public class InheritanceActivity {
    public static void main(String[] args){
        //set attributes
        Person_I myPerson = new Person_I();
        myPerson.name = "Sarah Johnson";
        myPerson.age = 21;

        System.out.println("--- Person Info ---");
        // Print Info
        System.out.println("Name: " + myPerson.name);
        System.out.println("Age: " + myPerson.age);

        System.out.println("-----------------------------");

        // 2. Employee  attributes
        Employee_I myEmployee = new Employee_I();
        myEmployee.name = "Shawn Cun";
        myEmployee.age = 32;
        myEmployee.salary = 70000;
        myEmployee.title = "Developer";

        System.out.println("--- Employee Info ---");
        // Print Employee object
        System.out.println("Name: " + myEmployee.name);
        System.out.println("Age: " + myEmployee.age);
        System.out.println("Title: " + myEmployee.title);
        System.out.println("Salary: " + myEmployee.salary);

        System.out.println("-----------------------------");
    }
}


