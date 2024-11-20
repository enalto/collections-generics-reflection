package com.enalto.stream;

import java.util.Objects;

public class Book {
    private String title;
    private int pages;
    private BookType bookType;

    public Book(String title, int pages, BookType bookType) {
        this.title = title;
        this.pages = pages;
        this.bookType = bookType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pages == book.pages && Objects.equals(title, book.title) && bookType == book.bookType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, pages, bookType);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", bookType=" + bookType +
                '}';
    }
}
