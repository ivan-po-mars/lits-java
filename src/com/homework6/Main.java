package com.homework6;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) throws DivOnZeroException {
    int quantity = 10;
    Random random = new Random(quantity);
    List<Integer> list = new ArrayList();

    for (int i = 0; i < quantity; i++) {
      int next =  random.nextInt(10);
      list.add(next);
    }

    System.out.println(list);

    // За допомогою Stream API вивести парні List і створити новий ліст
    List<Integer> evenList = list.stream().
            filter(item -> item % 2 == 0).
            collect(Collectors.toList());

    System.out.println(evenList);

    // За допомогою Stream API вивести не парні List і створити новий ліст
    List<Integer> oddList = list.stream().
            filter(item -> item % 2 != 0).
            collect(Collectors.toList());

    System.out.println(oddList);

    // За допомогою Stream API знайти суму усіх чисел в лісті
    int listSum = list.stream()
            .mapToInt(Integer::intValue)
            .sum();

    System.out.println(listSum);

    // За допомогою Stream API знайти суму усіх парних чисел
    int listEvenSum = list.stream()
            .filter(item -> item % 2 == 0)
            .mapToInt(Integer::intValue)
            .sum();

    System.out.println(listEvenSum);

    try {
      Calculator calculator = new Calculator();
      System.out.println( calculator.div(2, 2));
      System.out.println( calculator.sub(2, 2));
      System.out.println( calculator.multiply(2, 2));
      System.out.println( calculator.div(2, 2));
      System.out.println( calculator.div(2, 0));
    } catch (DivOnZeroException e) {
      System.out.println(e);
    }
  }
}
