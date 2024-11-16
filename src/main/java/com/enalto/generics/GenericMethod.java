package com.enalto.generics;

public class GenericMethod {

    public <T> void print(T t) {
        System.out.println(t.toString());
    }

    public <T, V> void print(T t, V v) {
        System.out.println(t.toString() + " " + v.toString());
    }

    public <T> void printAll(T[] items) {
        for (T item : items) {
            print(item);
        }
    }

    public <T> boolean checkEquality(T t1, T t2) {
        return t1.equals(t2);
    }

    public <T extends Number> double calculate(T t1, T t2) {
        return t1.doubleValue() * t2.doubleValue();
    }

    public static <T extends Comparable<T>> T calculateMin(T num1, T num2) {
        return num1.compareTo(num2) < 0 ? num1 : num2;
    }

    public <T extends Comparable<T>> int countGreaterItems(T[] items, T t) {
        var count = 0;
        for (T item : items) {
            if (item.compareTo(t) > 0) {
                count++;
            }
        }
        return count;
    }
}
