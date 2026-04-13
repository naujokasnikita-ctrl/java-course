package com.bootcampexcercise.module10.activity4;
import com.bootcampexcercise.module10.activity2.Employee;

import java.util.ArrayList;
import java.util.List;
public class EmployeeList {
    public static void main(String[] args){
        Employee e1 = new Employee("Igor", 28, "Tester", "Accenture", 2300);
        Employee e2 = new Employee("Oleg", 21, "Developer", "Google", 3500);
        Employee e3 = new Employee("Ieva", 22, "Manager", "Northvolt", 4000);
        Employee e4 = new Employee("Stefan", 25, "Analyst", "Amazon", 2900);
        Employee e5 = new Employee("Clause", 30, "Security", "Samsun", 3100);

        List<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);

        String topEarner = Employee.getHighestPaidEmp(empList);
        System.out.println("The Employee whose salary is the highest is: " + topEarner);
    }
}



