package ru.msk.java.vogella.rule;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

import java.util.logging.Logger;

/**
 * The following is a simple example for adding a log statement to an Android application before and after test execution.
 */
public class MyCustomRule implements TestRule {

    private final Logger log = Logger.getLogger(getClass().getName());

    private Statement base;
    private Description description;


    @Override
    public Statement apply(Statement base, Description description) {
        this.base = base;
        this.description = description;
        return new MyStatement(base);
    }

    public class MyStatement extends Statement {
        private final Statement base;

        public MyStatement(Statement base) {
            this.base = base;
        }

        @Override
        public void evaluate() throws Throwable {
            log.entering("MyCustomRule", description.getMethodName() + " Started");
            try {
                base.evaluate();
            } finally {
                log.exiting("MyCustomRule", description.getMethodName(), " Finished");
            }
        }
    }
}
