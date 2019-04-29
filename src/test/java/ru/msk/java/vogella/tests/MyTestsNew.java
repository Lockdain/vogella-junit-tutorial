package ru.msk.java.vogella.tests;

import org.junit.Test;
import ru.msk.java.vogella.MyClass;

import static org.junit.Assert.*;

public class MyTestsNew {
    @Test
    public void shouldReturnEmptyString() {
        MyClass tester = new MyClass();

        // assert
        assertEquals("Should return an empty string", "", tester.doNothing());
    }
}
