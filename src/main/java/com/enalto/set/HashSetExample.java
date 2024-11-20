package com.enalto.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {

        Set<String> set = new HashSet<String>();

        set.add("Juliana");
        set.add("Giovanna");
        set.add("Enalto");
        set.add("Vitoria");
        set.add("Helena");

        set.stream().forEach(System.out::println);
        
    }
}
