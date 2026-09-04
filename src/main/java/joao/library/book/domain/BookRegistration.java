package main.java.joao.library.book.domain;

public class BookRegistration {
    static void main(String[] args) {
        Book book = new Book();

        book.name = "Java 8 prático";
        book.description = "Novos recursos da linguagem";
        book.price = 59.90;
        book.isbn = "978-85-66258-46-6";

        System.out.println(book.name);
        System.out.println(book.description);
        System.out.println(book.price);
        System.out.println(book.isbn);
    }
}
