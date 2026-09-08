package main.java.joao.library.book.domain;

import main.java.joao.library.author.domain.Author;

public class Book {
    public String name;
    public String description;
    private double price;
    public String isbn;
    public Author author;

    public Book(Author author) {
        this();
        this.author = author;
    }

    public Book(){
        this.isbn = "000-00-00000-00-0";
    }

    public void showDetails() {
        System.out.println("Mostrando detalhes do livro");
        System.out.println("Nome: " + name);
        System.out.println("Descrição: " + description);
        System.out.println("Preço(R$): " +price);
        System.out.println("ISBN: " + isbn);
        System.out.println("---");
    }

    public void addPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean applyDiscount(double percent) {
        if (percent > 0.3) {
            return false;
        }
        this.price -= this.price * percent;
        return true;
    }
}
