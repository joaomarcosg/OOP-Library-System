package main.java.joao.library.book.domain;

import main.java.joao.library.author.domain.Author;
import main.java.joao.library.product.domain.Product;

public abstract class Book implements Product {
    private String name;
    private String description;
    private double price;
    private String isbn;
    private Author author;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
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

    public abstract boolean applyDiscount(double percent);

}
