package com.enalto.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {

        /**
         * restore the ordered map
         */
        Map<Integer, String> treemap = new TreeMap<Integer, String>();
        treemap.put(2, "two");
        treemap.put(1, "one");
        treemap.put(4, "four");
        treemap.put(5, "five");
        treemap.put(10, "ten");
        treemap.put(6, "six");
        treemap.put(3, "three");
        treemap.put(7, "seven");
        treemap.put(9, "nine");
        treemap.put(8, "eight");

        for (Map.Entry<Integer, String> entry : treemap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());

        }

    }
}
