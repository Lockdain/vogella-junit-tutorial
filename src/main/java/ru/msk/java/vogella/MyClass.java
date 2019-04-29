package ru.msk.java.vogella;

import java.math.BigInteger;

public class MyClass {

    public int multiply(int a, int b) {
        int res = 0;
        BigInteger control = BigInteger.valueOf(a).multiply(BigInteger.valueOf(b));
        res = (Integer.MAX_VALUE < control.longValue()) ? 0 : a * b;

        return res;
    }

    public int divide(int a, int b) {
        int res = 0;
        if (b == 0) {
            throw new IllegalArgumentException("Divider should not be null");
        }

        return a / b;
    }
}
