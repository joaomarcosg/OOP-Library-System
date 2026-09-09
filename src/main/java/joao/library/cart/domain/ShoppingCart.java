package main.java.joao.library.cart.domain;

import main.java.joao.library.book.domain.Book;

public class ShoppingCart {
    private double total;

    public void add(Book book) {
        System.out.println("Adding " + book);
        book.applyDiscount(0.05);
        total += book.getPrice();
    }

    public double getTotal() {return total;}

}
