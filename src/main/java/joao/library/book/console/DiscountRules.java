package main.java.joao.library.book.console;

import main.java.joao.library.author.domain.Author;
import main.java.joao.library.book.domain.Book;
import main.java.joao.library.fisicbook.domain.FisicBook;

public class DiscountRules {

    static void main(String[] args) {
        Author author = new Author();
        author.setName("Rodrigo Turini");
        Book book = new FisicBook(author);
        book.addPrice(59.90);

        System.out.println("Valor atual(R$): " + book.getPrice());

        if (!book.applyDiscount(0.1)) {
            System.out.println("Desconto não pode ser maior que 30%");
        } else {
            System.out.println("Valor com desconto(R$): " + book.getPrice());
        }
    }
}
