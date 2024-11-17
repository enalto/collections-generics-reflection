package com.enalto.genericshomeworkexercise;

import java.util.Optional;

public class App {

    public static void main(String[] args) {

        Library<Algorithm> library = new Library<>();
        library.addItem(new SearchAlgorithm());
        library.addItem(new SortingAlgorithm());
        library.addItem(new GraphAlgorithm());

        Algorithm lasItem = library.getLast();

        while (lasItem != null) {
            lasItem.execute();
            lasItem = library.getLast();
        }
    }
}
