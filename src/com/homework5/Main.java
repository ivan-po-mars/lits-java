package com.homework5;

import java.util.*;

// Створити клас черги, додати метод який прийматиме в аргументах число в List і повертатиме останнє яке було додано;
public class Main {
    public class Queue {
        private LinkedList<Integer> q  = new LinkedList();

        public int addQueueItem(int item) {
            q.add(item);

            return item;
        }

        public LinkedList<Integer> getQ() {
            return q;
        }
    }

    public static void main(String[] args) {

        // Заповонити List рандомними числами;
        int quantity = 10;
        Random random = new Random(quantity);
        LinkedList<Integer> list = new LinkedList();

        for (int i = 0; i < quantity; i++) {
            int next =  random.nextInt(10);
            list.add(next);
        }

        System.out.println(list);

        List<Integer> evenList = new LinkedList<>();
        List<Integer> oddList = new LinkedList<>();

        for (int i = 0; i < list.size(); i++) {
            int item = list.get(i);
            if (item % 2 == 0) {
                evenList.add(item);
            } else {
                oddList.add(item);
            }
        }

        // Вивести всі парні значення List;
        System.out.println(evenList);

        // Вивести всі непарні значення List;
        System.out.println(oddList);
    }
}
