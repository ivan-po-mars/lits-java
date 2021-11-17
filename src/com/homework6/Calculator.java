package com.company;

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

    public static int div(int x, int y) throws CalculatorException {
        if (y == 0) {
            throw new CalculatorException("Incorrect Divide To Zero");
        }
        int result = x/y;
        return result;
    }
}
