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
        book.setName("Java 8 prático");
        book.setDescription("Novos recursos da linguagem");
        book.addPrice(59.90);
        book.setIsbn("978-85-66258-46-6");
        book.setAuthor(author);

        book.showDetails();

        Author otherAuthor = new Author();
        otherAuthor.name = "Paulo Silveira";
        otherAuthor.email = "paulo.silveira@caelum.com.br";
        otherAuthor.cpf = "123.456.789-10";

        Book otherBook = new Book();
        otherBook.setName("Lógica de Programação");
        otherBook.setDescription("Crie os seus Primeiros Programas");
        otherBook.addPrice(59.90);
        otherBook.setIsbn("978-85-66250-22-0");
        otherBook.setAuthor(otherAuthor);

        otherBook.showDetails();

    }
}
