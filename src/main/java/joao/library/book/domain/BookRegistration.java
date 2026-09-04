package main.java.joao.library.book.domain;

public class BookRegistration {
    static void main(String[] args) {
        Book book = new Book();

        book.name = "Java 8 prático";
        book.description = "Novos recursos da linguagem";
        book.price = 59.90;
        book.isbn = "978-85-66258-46-6";

        book.showDetails();

        Book otherBook = new Book();

        otherBook.name = "Lógica de Programação";
        otherBook.description = "Crie os seus Primeiros Programas";
        otherBook.price = 59.90;
        otherBook.isbn = "978-85-66250-22-0";

        otherBook.showDetails();

    }
}
