package main.java.joao.library.cart.domain;

import main.java.joao.library.book.domain.Book;
import main.java.joao.library.product.domain.Product;

public class ShoppingCart {
    private double total;

    public void add(Product product) {
        System.out.println("Adding " + product);
        total += product.getPrice();
    }

    public double getTotal() {return total;}

}
