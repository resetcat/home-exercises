package test.java.io.odelex.advancedJavaTest;

import io.codelex.advancedJavaTest.exercise2.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {

    @Test
    void testCreatBasketWithApples() {
        Basket<Apple> appleBasket = new Basket<>();
        appleBasket.addToBasket(new Apple());
        Assertions.assertEquals(Apple.class.getSimpleName(), appleBasket.getItems().get(0).getClass().getSimpleName());
    }

    @Test
    void testCreatBasketWithMushrooms() {
        Basket<Mushroom> mushroomBasket = new Basket<>();
        mushroomBasket.addToBasket(new Mushroom());
        Assertions.assertEquals(Mushroom.class.getSimpleName(),
                                mushroomBasket.getItems().get(0).getClass().getSimpleName());
    }

    @Test
    void testIfEmpty() {
        Basket<Apple> appleBasket = new Basket<>();
        BasketEmptyException error = Assertions.assertThrows(BasketEmptyException.class,
                                                             () -> appleBasket.removeFromBasket(new Apple()));
        Assertions.assertEquals("Basket already empty!!!", error.getMessage());
    }

    @Test
    void testIfFull() {
        Basket<Apple> appleBasket = new Basket<>();
        while (appleBasket.getItemCount() != 10) {
            appleBasket.addToBasket(new Apple());
        }
        BasketFullException error = Assertions.assertThrows(BasketFullException.class,
                                                            () -> appleBasket.addToBasket(new Apple()));
        Assertions.assertEquals("Basket is full!!!", error.getMessage());
    }
}
