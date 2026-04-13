package com.bootcampexcercise.module10.activity2;

public class Abstractivity {
    public static void main(String []args){
        Employee employee = new Employee();
        employee.setName("Igor");
        employee.setAge(28);
        employee.setJobTitle("Tester");
        employee.setCompany("Accenture");
        employee.setSalary(2300);
        employee.introduce();
        System.out.println();

        Student student =new Student();
        student.setName("Oleg");
        student.setAge(21);
        student.setSchoolName("null");
        student.introduce();
    }

}
