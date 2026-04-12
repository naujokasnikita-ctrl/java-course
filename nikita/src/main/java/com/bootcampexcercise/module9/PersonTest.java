package com.bootcampexcercise.module9;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import  static org.junit.Assert.*;
public class PersonTest {
    // create a person
    private Person person;
//runs before every test
    @Before
    public void setUp() {
        person = new Person();
    }//runs after every test
    @After
    public void tearDown() {
        person = null;
    }
    //testing getter and setter
    @Test
    public void testWeightAndHeight(){
        person.setHeight(1.96f);
        person.setWeight(100);
        assertEquals(1.96f,person.getHeight(),0.001);
        assertEquals(100, person.getWeight());
    }
    //testing if the bmi calculator works whit valid inputs
    @Test
    public void testBmiCalculatorWithValidInput(){
        String result = person.calculateBMI(1.96f, 100);
        assertTrue(result.contains("BMI:"));
    }
    //testing bad inputs
    @Test
    public void testBmiCalculatorWithInvalidInput(){
        String result = person.calculateBMI(3.20f, -20);
        assertEquals("Invalid input ", result);
    }
    //testing a person with a unrealistic weight
    @Test
    public void testTooHeavyPerson(){
        String result = person.calculateBMI(1.80f, 9999);
        assertEquals("invalid input", result);
    }


}
