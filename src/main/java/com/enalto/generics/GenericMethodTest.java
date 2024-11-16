package com.enalto.generics;

public class GenericMethodTest {

    public static void main(String[] args) {

        GenericMethod genericMethod = new GenericMethod();

        genericMethod.print("Hello");
        genericMethod.print(10.20);
        genericMethod.print(100);

        genericMethod.print(10.20, 10);


        Integer[] numbers = {10, 20, 30, 40, 50};
        String[] names = {"Enalto", "Juliana", "Giovanna", "Vitoria", "Enaltinho"};
        genericMethod.print("> print list");

        genericMethod.printAll(names);
        genericMethod.printAll(numbers);

        System.out.println(genericMethod.checkEquality(12, 8));

        Integer[] numbers2 = {10, 20, 30, 40, 50};
        int count = genericMethod.countGreaterItems(numbers2, 30);
        System.out.println(count);

    }


}
