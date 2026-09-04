package main.java.joao.library.book.domain;

public class Book {
    String name;
    String description;
    double price;
    String isbn;

    void showDetails() {
        System.out.println("Mostrando detalhes do livro");
        System.out.println("Nome: " + name);
        System.out.println("Descrição: " + description);
        System.out.println("Preço(R$): " +price);
        System.out.println("ISBN: " + isbn);
        System.out.println("---");
    }
}
