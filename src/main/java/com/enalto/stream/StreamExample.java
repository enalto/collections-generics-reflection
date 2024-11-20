package com.enalto.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {

        List<Book> list = new ArrayList<>();

        list.add(new Book("Book 1", 500, BookType.HISTORY));
        list.add(new Book("Book 2 dhjdhsd", 250, BookType.PHILOSOPHY));
        list.add(new Book("Book 3 ghghgh", 150, BookType.NOVEL));
        list.add(new Book("Book 4 mmmm", 550, BookType.HISTORY));
        list.add(new Book("Book 5", 350, BookType.PHILOSOPHY));
        list.add(new Book("Book 6", 241, BookType.THRILLER));
        list.add(new Book("Book 7 vvvvv", 220, BookType.HISTORY));


        List<Book> list1 = list.stream().filter(book -> {
            String[] worlds = book.getTitle().split(" ");
            return worlds.length == 2;
        }).collect(Collectors.toList());

        System.out.println(list1);

        System.out.println("-".repeat(100));

        List<Book> bookList = list.stream().filter(book -> book.getBookType() == BookType.PHILOSOPHY)
                .sorted(Comparator.comparing(book -> book.getTitle()))
                .collect(Collectors.toList());

        Stream<String> stringStream = list.stream().map(Book::getTitle);

        List<Integer> listPages = list.stream().map(Book::getPages).toList();

        bookList.forEach(System.out::println);

        Map<BookType, List<Book>> map = list.stream()
                .collect(Collectors.groupingBy(Book::getBookType));

        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry);
        }

        System.out.println("-".repeat(100));

        System.out.println("longest book >"+getLongestBook(list));
    }

    public List<List<Integer>> generatePairs() {

        List<Integer> nums1 = Arrays.asList(1, 2, 3);
        List<Integer> nums2 = Arrays.asList(4, 5);

        List<List<Integer>> pairs = nums1.stream()
                .flatMap(i -> nums2.stream().map(j -> Arrays.asList(i, j))).collect(Collectors.toList());

        return pairs;
    }

    public static Optional<Book> getLongestBook(List<Book> list) {
        Optional<Book> bookOptional = list.stream()
                .reduce((book1, book2) -> book1.getPages() > book2.getPages() ? book1 : book2);
        return bookOptional;
    }
}
