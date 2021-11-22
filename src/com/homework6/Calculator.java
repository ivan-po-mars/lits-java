package com.homework6;

public class Calculator {
    public static int add(int x, int y) {
        int result = x + y;
        return result;
    }

    public static int sub(int x, int y) {
        int result = x-y;
        return result;
    }

    public static int multiply(int x, int y) {
        int result = x*y;
        return result;
    }

    public static int div(int x, int y) throws DivOnZeroException {
        if (y == 0) {
            throw new DivOnZeroException("Incorrect Divide To Zero");
        }
        int result = x/y;
        return result;
    }
}
