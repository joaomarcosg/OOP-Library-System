package main.java.joao.library.book.console;

import main.java.joao.library.author.domain.Author;
import main.java.joao.library.book.domain.Book;

public class BookRegistration {
    static void main(String[] args) {
        Author author = new Author();
        author.name = "Rodrigo Turini";
        author.email = "rodrigo.turini@caelum.com.br";
        author.cpf = "123.456.789-10";

        Book book = new Book();
        book.name = "Java 8 prático";
        book.description = "Novos recursos da linguagem";
        book.addPrice(59.90);
        book.isbn = "978-85-66258-46-6";
        book.author = author;

        book.showDetails();

        Author otherAuthor = new Author();
        otherAuthor.name = "Paulo Silveira";
        otherAuthor.email = "paulo.silveira@caelum.com.br";
        otherAuthor.cpf = "123.456.789-10";

        Book otherBook = new Book();
        otherBook.name = "Lógica de Programação";
        otherBook.description = "Crie os seus Primeiros Programas";
        otherBook.addPrice(59.90);
        otherBook.isbn = "978-85-66250-22-0";
        otherBook.author = otherAuthor;

        otherBook.showDetails();

    }
}
