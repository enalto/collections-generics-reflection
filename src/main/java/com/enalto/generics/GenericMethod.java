package com.enalto.generics;

public class GenericMethod {

    public <T> void print(T t) {
        System.out.println(t.toString());
    }

    public <T, V> void print(T t, V v) {
        System.out.println(t.toString() + " " + v.toString());
    }

    public <T> void printAll(T[] items){
        for(T item : items){
            print(item);
        }
    }
}
