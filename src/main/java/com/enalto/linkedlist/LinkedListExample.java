package com.enalto.linkedlist;

import java.util.*;

public class LinkedListExample {

    public static void main(String[] args) {


        Integer[] numbers = {1, 2, 3, 4};
        List<Integer> list = new LinkedList<>();
        Collections.addAll(list, numbers);

        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(10);
        list.add(15);

        list.removeFirst();
        list.removeLast();

        for (Integer number : list) {
            System.out.println(number);
        }

        System.out.println("Empty ? "+list.isEmpty());

    }
}
