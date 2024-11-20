package com.enalto.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {

        List<Book> list = new ArrayList<>();

        list.add(new Book("Book 1", 500, BookType.HISTORY));
        list.add(new Book("Book 2", 250, BookType.PHILOSOPHY));
        list.add(new Book("Book 3", 150, BookType.NOVEL));
        list.add(new Book("Book 4", 550, BookType.HISTORY));
        list.add(new Book("Book 5", 350, BookType.PHILOSOPHY));
        list.add(new Book("Book 6", 241, BookType.THRILLER));
        list.add(new Book("Book 7", 220, BookType.HISTORY));

        List<Book> bookList = list.stream().filter(book -> book.getBookType() == BookType.PHILOSOPHY)
                .sorted(Comparator.comparing(book -> book.getTitle()))
                .collect(Collectors.toList());

        Stream<String> stringStream = list.stream().map(Book::getTitle);

        List<Integer> listPages = list.stream().map(Book::getPages).toList();

        bookList.forEach(System.out::println);

        Map<BookType, List<Book>> map = list.stream()
                .collect(Collectors.groupingBy(Book::getBookType));

        for(Map.Entry entry: map.entrySet()){
            System.out.println(entry);
        }

    }
}
