package main.java.joao.library.magazine.domain;

import main.java.joao.library.product.domain.Product;
import main.java.joao.library.product.domain.Promotional;

public class Magazine implements Product, Promotional {
    private String name;
    private String description;
    private double price;
    private Publisher publisher;

    public boolean applyDiscount(double percent) {
        if (percent > 0.1) {
            return false;
        }
        double discount = this.getPrice() * percent;
        this.setPrice(this.getPrice() - discount);
        return true;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
}
