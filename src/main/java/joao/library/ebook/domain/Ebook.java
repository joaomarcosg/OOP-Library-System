package main.java.joao.library.ebook.domain;

import main.java.joao.library.author.domain.Author;
import main.java.joao.library.book.domain.Book;
import main.java.joao.library.product.domain.Promotional;

public class Ebook extends Book implements Promotional {
    private String waterMark;

    public Ebook(Author author) {
        super(author);
    }

    public String getWaterMark() {
        return waterMark;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }

    @Override
    public boolean applyDiscount(double percent) {
        if (percent > 0.15) {
            return false;
        }
        double discount = this.getPrice() * percent;
        this.setPrice(this.getPrice() - discount);
        return true;
    }
}
