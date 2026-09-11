package main.java.joao.library.product.domain;

public interface Promotional {

    boolean applyDiscount(double percent);

    default boolean applyDiscountOf10Percent() {
        return applyDiscount(0.1);
    }

}
