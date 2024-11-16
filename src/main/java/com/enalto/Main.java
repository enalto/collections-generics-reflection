package com.enalto;

import com.enalto.generics.Store;

public class Main {
    public static void main(String[] args) {
        Store<String> item = new Store("item");

        System.out.println(item.getItem());
    }

    public static void add(int num1, int num2) {
        int result = num1 + num2;
        System.out.println(result);
    }

    public static void add(double num1, double num2) {
        double result = num1 + num2;
        System.out.println(result);
    }
}