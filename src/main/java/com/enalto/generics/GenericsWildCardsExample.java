package com.enalto.generics;

import java.util.List;

public class GenericsWildCardsExample {

    public static void main(String[] args) {


    }

    public static void printList(List<?> list) {
        for (Object o : list) {
            System.out.println(o.toString());
        }
    }
}
