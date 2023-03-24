package org.tester.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
        Calculator calculator = new Calculator();

   @Test
    void addTest() {
        assertEquals(4,calculator.add(2,2));
        assertEquals(-4,calculator.add(0,-4));
        assertEquals(-4,calculator.add(-2,-2));
        assertEquals(0,calculator.add(-2,2));
    }


   @Test
    void subtractTest() {
        assertEquals(0,calculator.subtract(2,2));
        assertEquals(4,calculator.subtract(0,-4));
        assertEquals(0,calculator.subtract(-2,-2));
        assertEquals(-4,calculator.subtract(-2,2));
    }

   @Test
    void divideTest() {
        assertEquals(1,calculator.divide(2,2));
        assertTrue( calculator.divide(0,-4) == 0);
        assertEquals(1,calculator.divide(-2,-2));
        assertEquals(-1,calculator.divide(-2,2));
    }

   @Test
    void multiplyTest() {
        assertEquals(4,calculator.multiply(2,2));
        assertTrue( calculator.multiply(0,-4) == 0);
        assertEquals(4,calculator.multiply(-2,-2));
        assertEquals(-4,calculator.multiply(-2,2));
    }
}