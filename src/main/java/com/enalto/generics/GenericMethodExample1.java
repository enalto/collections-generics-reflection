package com.enalto.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodExample1 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();

        List<Integer> list1 = add(list, 10, 20);
        System.out.println(list1);
    }

    public static <T> List<T> add(List<T> list, T item1, T item2) {
        list.add(item1);
        list.add(item2);
        return list;
    }
}
