package com.enalto.generics;

import java.util.Arrays;
import java.util.List;

public class GenericMethodTest {

    public static void main(String[] args) {

        GenericMethod genericMethod = new GenericMethod();

        genericMethod.print("Hello");
        genericMethod.print(10.20);
        genericMethod.print(100);

        genericMethod.print(10.20, 10);


        List<Integer> list = Arrays.asList(10, 20, 30, 50, 100);
        genericMethod.print("> print list");
        genericMethod.print(list);
        genericMethod.printAll(list.toArray());
    }


}
