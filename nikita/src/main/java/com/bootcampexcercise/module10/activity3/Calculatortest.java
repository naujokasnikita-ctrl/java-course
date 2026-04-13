package com.bootcampexcercise.module10.activity3;
import org.junit.Test;
import static org.junit.Assert.*;
public class Calculatortest {
    Calculator calc = new Calculator();
    // 4min
    @Test
    public void testAddIntPositive() {
        assertEquals(10, calc.add(5, 5));
    }

    @Test
    public void testAddIntNegative() {
        assertEquals(-2, calc.add(-5, 3));
    }

    @Test
    public void testAddDoublePositive() {
        assertEquals(5.5, calc.add(2.5, 3.0), 0.001);
    }

    @Test
    public void testAddDoubleNegative() {
        assertEquals(0.0, calc.add(-1.1, 1.1), 0.001);
    }

    @Test
    public void testSubtractPositive() {
        assertEquals(5, calc.subtract(10, 5));
    }

    @Test
    public void testSubtractNegative() {
        assertEquals(-15, calc.subtract(-10, 5));
    }

    @Test
    public void testDivideStandard() {
        assertEquals(2, calc.divide(10, 5));
    }

    @Test
    public void testDivideByZeroHandling() {
        assertEquals(0, calc.divide(10, 0));
    }

    @Test
    public void testMultiplyStandard() throws InvalidMultiplyInputException {
        assertEquals(20, calc.multiply(4, 5));
    }

    @Test(expected = InvalidMultiplyInputException.class)
    public void testMultiplyException() throws InvalidMultiplyInputException {
        calc.multiply(0, 5);
    }
}

