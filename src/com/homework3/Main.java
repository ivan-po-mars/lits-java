package com.homework3;

public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc();

        Person person = new Person("vitaliy", "andrushko");

        System.out.println(person.getFirstName());

        var array1 = calc.getArray1ToString();
        var array2 = calc.getArray2ToString();
        var array3 = calc.getArray3ToString();
        var array4 = calc.getArray4ToString();
        var array5 = calc.getArray5ToString();
        var array6 = calc.getArray6ToString();

        System.out.println(array1);
        System.out.println(array2);
        System.out.println(array3);
        System.out.println(array4);
        System.out.println(array5);
        System.out.println(array6);
    }
}
