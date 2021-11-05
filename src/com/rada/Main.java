package com.rada;

public class Main {
    public static void main(String[] args) {
        /*
            < - Більше
            > - Менше
            <= - Більше рівне
            > - Менше рівне
            == - одинакові значення
            != - не одинакові значення
            sout - System.out.println()
            psvm - main() method
        */

        byte b = 127;
        short s = 32000;
        int i = 13;
        long l = 13;

        float f = 13;
        double d = 13;

        boolean bool = true;

        char ch = 'a';

        int inch = ch;

        System.out.println(bool);
        System.out.println(ch);
        System.out.println(inch);

        System.out.println(s);
        System.out.println(b);
        System.out.println((i + d) * l);
        System.out.println("var i1 = "+ i + ", l1 = "+ l + ", d1 = "+d+ ". ");

        System.out.println("Hello world");
    }
}
