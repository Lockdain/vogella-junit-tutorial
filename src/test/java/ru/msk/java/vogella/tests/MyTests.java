package ru.msk.java.vogella.tests;

import org.junit.Ignore;
import org.junit.Test;
import ru.msk.java.vogella.MyClass;

import static org.junit.Assert.*;

public class MyTests {

    @Test
    public void multiplicationOfZeroIntShouldReturnZero() {
        MyClass tester = new MyClass();

        // asserts
        assertEquals("Max Integer value exceeded", 0, tester.multiply(Integer.MAX_VALUE, 2));
        assertEquals("0 x 0 must be 0", 0, tester.multiply(0, 0));
        assertEquals("10 x 0 must be 0", 0, tester.multiply(10, 0));
        assertEquals("0 x 10 must be 0", 0, tester.multiply(0, 10));
    }

    @Test
    public void multiplicationOfIntegersShouldReturnRightValue() {
        MyClass tester = new MyClass();

        // asserts
        assertEquals("50 x 10 must be 500", 500, tester.multiply(50, 10));
    }

    @Test(expected = IllegalArgumentException.class)
    public void divideByZeroShouldReturnException() {
        MyClass tester = new MyClass();

        // assert
        assertEquals("Division by zero exception", 0, tester.divide(0, 0));
    }
}