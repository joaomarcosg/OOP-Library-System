package main.java.joao.library.book.domain;

public class Book {
    String name;
    String description;
    double price;
    String isbn;

    void showDetails() {
        System.out.println(name);
        System.out.println(description);
        System.out.println(price);
        System.out.println(isbn);
    }
}
