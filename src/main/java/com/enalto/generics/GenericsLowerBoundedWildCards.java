package com.enalto.generics;

import java.util.*;

public class GenericsLowerBoundedWildCards {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> list2 = new ArrayList<>();

        copy(list, list2);

        System.out.println(list2);
    }

    public static <T> void copy(List<? extends T> source,
                                List<? super T> target) {
        target.addAll(source);
    }
}
