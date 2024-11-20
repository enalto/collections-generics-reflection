package com.enalto.linkedhashmap;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class LinkedHashMapExample {

    public static void main(String[] args) {

        LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();

        List<String> list = new ArrayList<String>();

        map.put("google.com", "content");
        map.put("yahoo.com", "content");

        System.out.println(map.containsKey("google.com"));

        System.out.println(map.size());

        System.out.println(map.firstEntry().getKey());
        map.remove(map.firstEntry().getKey());
        System.out.println(map);
    }


}
