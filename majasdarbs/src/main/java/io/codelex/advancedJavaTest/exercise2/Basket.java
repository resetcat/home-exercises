package io.codelex.advancedJavaTest.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {
    private List<T> items = new ArrayList<>();

    private int itemCount;

    public Basket() {
        itemCount = 0;
    }

    public void addToBasket(T item) {
        if (itemCount == 10) {
            throw new BasketFullException("Basket is full!!!");
        }
        items.add(item);
        itemCount++;

    }

    public void removeFromBasket(T item) {
        if (itemCount == 0) {
            throw new BasketEmptyException("Basket already empty!!!");
        }
        items.remove(item);
        itemCount--;
    }

    public List<T> getItems() {
        return items;
    }

    public int getItemCount() {
        return itemCount;
    }
}
