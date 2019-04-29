package ru.msk.java.vogella;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * The org.junit.runner.JUnitCore class provides the runClasses() method.
 * This method allows you to run one or several tests classes.
 * As a return parameter you receive an object of the type org.junit.runner.Result.
 * This object can be used to retrieve information about the tests.
 * <p>
 * The following class demonstrates how to run the MyClassTest.
 * This class executes your test class and write potential failures to the console.
 */
public class MyTestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(MyTests.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
    }
}
