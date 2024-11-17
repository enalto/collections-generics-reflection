package com.enalto.collection;

import java.util.Arrays;
import java.util.List;

public class CollectionExample {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 0);
    }

    public static void reverse(List<Integer> list) {

        // here is your implementation

//        List<Integer> reverseList = new ArrayList<>();
//        for (int i = list.size() - 1; i >= 0; i--) {
//            reverseList.add(list.get(i));
//        }
//        return reverseList;
//    }
        for (int i = 0, mid = list.size() / 2, j = list.size() - 1; i < mid; i++, j--) {
            int num1 = list.get(i);
            int num2 = list.get(j);
            list.set(i, num2);
            list.set(j, num1);
        }
    }
}
