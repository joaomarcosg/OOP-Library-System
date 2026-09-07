package main.java.joao.library.book.domain;

import main.java.joao.library.author.domain.Author;

public class Book {
    String name;
    String description;
    double price;
    String isbn;
    Author author;

    void showDetails() {
        System.out.println("Mostrando detalhes do livro");
        System.out.println("Nome: " + name);
        System.out.println("Descrição: " + description);
        System.out.println("Preço(R$): " +price);
        System.out.println("ISBN: " + isbn);
        System.out.println("---");
    }

    public boolean applyDiscount(double percent) {
        if (percent > 0.3) {
            return false;
        }
        this.price -= this.price * percent;
        return true;
    }
}
