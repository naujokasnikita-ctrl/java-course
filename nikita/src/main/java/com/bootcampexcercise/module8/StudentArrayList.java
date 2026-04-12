package com.bootcampexcercise.module8;
import java.util.ArrayList;
public class StudentArrayList {
    public static void main(String[] args) {
    ArrayList<Student> students = new ArrayList<>();

    addStudent(students, new Student(1, "Andre", 74.2));
    addStudent(students, new Student(2, "Tyson", 55.7));
    addStudent(students, new Student(3, "Mike", 12.8));
    addStudent(students, new Student(4, "Dima", 99.9));

    System.out.println("all students:");
    printAllStudents(students);

    //Remove student
    students.removeIf(s -> s.getId() == 3);
    System.out.println("\nAfter removing ID 3:");
    printAllStudents(students);

    // highest grade
    findHighestGrade(students);
}

    // Method to Add student (prevent duplicate ID)
    public static void addStudent(ArrayList<Student> list, Student newStudent) {
        for (Student s : list) {
            if (s.getId() == newStudent.getId()) {
                System.out.println("Error: Student ID " + s.getId() + " already exists.");
                return;
            }
        }
        list.add(newStudent);
    }

    // Method to Print all students
    public static void printAllStudents(ArrayList<Student> list) {
        System.out.println("--- Student List ---");
        for (Student s : list) {
            s.printStudent();
        }
    }

    // Method to Find highest grade
    public static void findHighestGrade(ArrayList<Student> list) {
        if (list.isEmpty()) return;

        Student topStudent = list.get(0);
        for (Student s : list) {
            if (s.getGrade() > topStudent.getGrade()) {
                topStudent = s;
            }
        }
        System.out.print("\nTop Performing Student: ");
        topStudent.printStudent();
    }
}


