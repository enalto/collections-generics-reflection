package com.enalto.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<String, Integer>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("E", 5);
        map.put("F", 6);
        map.put("G", 7);
        map.put("H", 8);
        map.put("I", 9);
        map.put("J", 10);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


        System.out.println("-".repeat(100));

        Map<String, Integer> hashMap = new LinkedHashMap<>();

        hashMap.put("AAA", 1);
        hashMap.put("BBB", 2);
        hashMap.put("CCC", 3);
        hashMap.put("DDD", 4);
        hashMap.put("EEE", 5);
        hashMap.put("FFF", 6);
        hashMap.put("GGG", 7);
        hashMap.put("HHH", 8);
        hashMap.put("III", 9);
        hashMap.put("JJJ", 10);

        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }
}
