package com.bootcampexcercise.module10.activity2;
import com.bootcampexcercise.module10.activity1.Person;

import java.util.List;
public class Employee extends Person {
    //atributes
    private String jobTitle;
    private String company;
    private double salary;
    public Employee() {
        super();
    }
    //construct
    public Employee(String name, int age, String jobTitle, String company, double salary){
        setName(name);
        setAge(age);
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company =company;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public void introduce(){
        System.out.println("my name is" + name + "i am" + age + "year old");
        System.out.println("i work as " + jobTitle + " in " + company+ "and my salary is" + salary);
    }
    public static String getHighestPaidEmp(List<Employee> empList) {
        if (empList == null || empList.isEmpty()) {
            return "No employees in list";
        }

        Employee highest = empList.get(0);

        for (Employee emp : empList) {
            if (emp.getSalary() > highest.getSalary()) {
                highest = emp;
            }
        }

        return highest.getName();
    }




}
