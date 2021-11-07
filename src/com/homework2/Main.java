package com.homework2;

public class Main {
    public static void main(String[] args) {
        /*
        Заповнити масив тільки парними числами
        Заповнити масив рандомними числами, почитатйте про класс Random
        Вивести середнє значення масиву
        Вивести найменше значення в масиві
        Вивести найбільше значення масиву
        Вивести значення парних індексів масиву
        Вивести перших 20 символів з таблиці ASCI
         */

        // Заповнити масив тільки парними числами
        int [] array1 = new int[10];

        for (int i = 0; i < array1.length; i++) {
            if ((i % 2) == 0) {
                array1[i] = i;
            }
        }

        System.out.println(Arrays.toString(array1));

        // Заповнити масив рандомними числами, почитатйте про класс Random;
        int [] array2 = new int[10];

        Random random = new Random(10);

        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString((array2)));

        // Вивести середнє значення масиву
        int [] array3 = { 1, 2, 3, 4, 5, 6, 7 };

        double sum = 0;
        double aver = 0;

        for (int i = 0; i < array3.length; i++) {
            sum += array3[i];
        }

        aver = sum / array2.length;

        System.out.println(aver);

        // Вивести найменше значення в масиві
        // Вивести найбільше значення масиву
        int [] array4 = { 34, 45, 3, 6, 16, 67, 55, 4 };

        int min = array4[0];
        int max = array4[0];

        for (int i: array4) {
            if (i < min) {
                min = i;
            };

            if (i > max) {
                max = i;
            }
        }

        System.out.println(min);
        System.out.println(max);

        //  Вивести значення парних індексів масиву
        int [] array5 = { 1, 2, 3, 4, 5, 6, 7 };
        int sum2 = 0;

        for (int i = 0; i < array5.length; i++) {
            if (i % 2 == 0) {
                System.out.println(array5[i]);
                sum2 += array5[i];
            }
        }

        System.out.println(sum2);

        //  Вивести перших 20 символів з таблиці ASCI
        int num = 1;

        while (num <= 20) {
            char numChar = (char) num;
            System.out.println(num);
            // I'm not sure how to print it
            System.out.println(numChar);
            num++;
        }
    }
}
