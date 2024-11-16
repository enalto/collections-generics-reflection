package com.enalto.generics;

public class Store<T> {
    private T item;

    public Store(T item) {
        this.item = item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

