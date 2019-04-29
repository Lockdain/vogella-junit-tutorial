package ru.msk.java.vogella.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ru.msk.java.vogella.tests.MyTests;
import ru.msk.java.vogella.tests.MyTestsNew;

@RunWith(Suite.class)
@Suite.SuiteClasses({MyTests.class, MyTestsNew.class})
public class TestSuite {
}
