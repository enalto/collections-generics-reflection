package com.enalto.genericshomeworkexercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Library<T extends Algorithm> {
    private List<T> algorithms;

    public Library() {
        this.algorithms = new ArrayList<T>();
    }

    public T getLast() {
        if (algorithms.size() <= 0) {
            return null;
        }
        var lasItem = algorithms.get(algorithms.size() - 1);
        algorithms.remove(lasItem);
        return lasItem;
    }

    public void addItem(T item) {
        algorithms.add(item);
    }

}
