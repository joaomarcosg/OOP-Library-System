package main.java.joao.library.fisicbook.domain;

import main.java.joao.library.author.domain.Author;
import main.java.joao.library.book.domain.Book;
import main.java.joao.library.product.domain.Promotional;

public class FisicBook extends Book implements Promotional {

    public FisicBook(Author author) {
        super(author);
    }

    public double getPrintingFee() {
        return this.getPrice() * 0.05;
    }

    @Override
    public boolean applyDiscount(double percent) {
        if (percent > 0.3) {
            return false;
        }
        double discount = this.getPrice() * percent;
        this.setPrice(this.getPrice() - discount);
        return true;
    }

}
