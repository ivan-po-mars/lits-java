package com.homework1;

public class Main {
    public static void main(String[] args) {
        // 1

        int a = 1;
        int b = 2;
        int w = 3;
        int q = 4;
        int r = 5;
        int I = 6;
        int v = 7;
        int i = 8;
        int z = 9;
        int x = 10;
        int y = 11;
        int c = 12;

        int res1 = a+b*(w/q)*r+I;
        int res2 = b+v-i*z;
        int res3 = x+y+z*c;

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);

        // 2

        int h = 72;
        int e = 101;
        int l = 108;
        int l2= 108;
        int o = 111;
        int w2= 119;
        int o2= 111;
        int r2= 114;
        int l3= 108;
        int d = 100;
        int end = 33;

        System.out.println("" + (char) h + (char) e + (char) l + (char) l2 + (char) o + " " +  (char) w2 + (char) o2 + (char) r2 + (char) l3 + (char) d + (char) end);

        // 3

        boolean b1 =  10 < 9;
        boolean b2 =  3 == 4;
        boolean b3 =  2 != 2;
        boolean b4 =  9 >= 8;

        System.out.println("10 < 9 = " + b1);
        System.out.println("3 == 4 = " + b2);
        System.out.println("2 != 2 = " + b3);
        System.out.println("9 >= 8 = " + b4);
    }
}
