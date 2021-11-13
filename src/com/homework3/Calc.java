package com.homework3;

import java.util.Arrays;
import java.util.Random;

public class Calc {
    public String getArray1ToString() {
        // Заповнити масив тільки парними числами
        int [] array1 = new int[10];

        for (int i = 0; i < array1.length; i++) {
            if ((i % 2) == 0) {
                array1[i] = i;
            }
        }

        return Arrays.toString(array1);
    }

    public String getArray2ToString() {
        // Заповнити масив рандомними числами, почитатйте про класс Random;
        int [] array2 = new int[10];

        Random random = new Random(10);

        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(10);
        }

        return Arrays.toString((array2));
    }

    public Double getArray3ToString() {
        // Вивести середнє значення масиву
        int [] array3 = { 1, 2, 3, 4, 5, 6, 7 };

        double sum = 0;
        double aver = 0;

        for (int i = 0; i < array3.length; i++) {
            sum += array3[i];
        }

        aver = sum / array3.length;

        return aver;
    }

    public int getArray4ToString() {
        // Вивести найменше значення в масиві
        int [] array4 = { 34, 45, 3, 6, 16, 67, 55, 4 };

        int min = array4[0];

        for (int i: array4) {
            if (i < min) {
                min = i;
            };
        }

        return min;
    }

    public int getArray5ToString() {
        // Вивести найбільше значення масиву
        int [] array4 = { 34, 45, 3, 6, 16, 67, 55, 4 };

        int max = array4[0];

        for (int i: array4) {
            if (i > max) {
                max = i;
            }
        }

        return max;
    }

    public Integer  getArray6ToString() {
        //  Вивести значення парних індексів масиву
        int [] array5 = { 1, 2, 3, 4, 5, 6, 7 };
        int sum2 = 0;

        for (int i = 0; i < array5.length; i++) {
            if (i % 2 == 0) {
                System.out.println(array5[i]);
                sum2 += array5[i];
            }
        }

        return sum2;
    }
}

