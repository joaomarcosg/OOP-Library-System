package main.java.joao.library.cart.domain;

import main.java.joao.library.book.domain.Book;

public class ShoppingCart {

    public void add(Book book) {
        System.out.println("Adding " + book);
    }

}
