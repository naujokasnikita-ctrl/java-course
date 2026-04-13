package com.bootcampexcercise.module10.activity2;

import com.bootcampexcercise.module10.activity1.Person;

public class Student extends Person {
    public String SchoolName;
    //getter setter
    public String getSchoolName() {
        return SchoolName;
    }
    public void setSchoolName(String schoolName) {
        this.SchoolName = SchoolName;
    }
    @Override
    public void introduce() {
        System.out.println("I am study in university" + SchoolName);
    }
}
