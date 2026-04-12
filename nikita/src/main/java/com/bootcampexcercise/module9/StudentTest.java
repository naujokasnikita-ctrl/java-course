package com.bootcampexcercise.module9;
import com.bootcampexcercise.module8.Student;
import com.bootcampexcercise.module8.StudentArrayList;
import org.junit.Test;
import java.util.ArrayList;
import org.junit.Assert.*;

import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void testAddStudent() {
        ArrayList<Student> list = new ArrayList<>();
        Student s = new Student(1, "Andre", 75.0);

        StudentArrayList.addStudent(list, s);

        assertEquals(1, list.size());
        assertEquals("Andre", list.get(0).getName());
    }

    //duplicate IDs
    @Test
    public void testDuplicateId() {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student(1, "Andre", 75.0);
        Student s2 = new Student(1, "Tyson", 80.0); // Same ID as Andre!

        StudentArrayList.addStudent(list, s1);
        StudentArrayList.addStudent(list, s2);
        assertEquals(1, list.size());
    }

    //removing a student
    @Test
    public void testRemoveStudent() {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(3, "Mike", 12.8));

        list.removeIf(s -> s.getId() == 3);

        assertTrue(list.isEmpty());
    }

    // finding the highest grade
    @Test
    public void testHighestGrade() {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(1, "Andre", 74.2));
        list.add(new Student(2, "Dima", 99.9)); // Highest
        list.add(new Student(3, "Tyson", 55.7));

        // Logic
        Student top = list.get(0);
        for (Student s : list) {
            if (s.getGrade() > top.getGrade()) {
                top = s;
            }
        }
        assertEquals(99.9, top.getGrade(), 0.01);
    }

   //empty list test
    @Test
    public void testHighestGradeEmptyList() {
        ArrayList<Student> list = new ArrayList<>();

        try {
            StudentArrayList.findHighestGrade(list);
            assertTrue(true);
        } catch (Exception e) {
            fail("The method crashed on an empty list!");
        }
    }
}

