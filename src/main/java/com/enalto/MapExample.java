package com.enalto;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "Juliana");
        map.put(2, "Alex");
        map.put(3, "Bob");
        map.put(4, "Enalto");
        map.put(5, "Giovanna");
        map.put(6, "Vitoria");
        map.put(7, "Enaldinho");

//        for (Integer key : map.keySet()) {
//            System.out.println(key + ": " + map.get(key));
//        }

        for( Map.Entry<Integer, String> entry : map.entrySet() ) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println(map.get(8));

        boolean b = map.containsKey(8);
        System.out.println(b);

        System.out.println(map.get(5));
    }
}
