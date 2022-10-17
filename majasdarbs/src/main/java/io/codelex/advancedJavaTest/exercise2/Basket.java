package io.codelex.advancedJavaTest.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {
    private List<T> items = new ArrayList<>();


    public Basket() {
    }

    public void addToBasket(T item) {
        if (items.size() == 10) {
            throw new BasketFullException("Basket is full!!!");
        }
        items.add(item);
    }

    public void removeFromBasket(T item) {
        if (items.size() == 0) {
            throw new BasketEmptyException("Basket already empty!!!");
        }
        items.remove(item);
    }

    public List<T> getItems() {
        return items;
    }

    public int getItemCount() {
        return items.size();
    }
}
