package main.java.joao.library.cart.console;

import main.java.joao.library.author.domain.Author;
import main.java.joao.library.cart.domain.ShoppingCart;
import main.java.joao.library.ebook.domain.Ebook;
import main.java.joao.library.fisicbook.domain.FisicBook;

public class SalesRecord {
    static void main(String[] args) {

        Author author = new Author();
        author.setName("Mauricio Aniche");

        FisicBook fisicBook = new FisicBook(author);
        fisicBook.setName("Test-Driven Development");

        Ebook ebook = new Ebook(author);
        ebook.setName("Test-Driven Development");

        ShoppingCart cart = new ShoppingCart();
        cart.add(fisicBook);
        cart.add(ebook);
    }
}
