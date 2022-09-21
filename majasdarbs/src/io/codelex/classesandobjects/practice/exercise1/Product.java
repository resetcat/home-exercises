package io.codelex.classesandobjects.practice.exercise1;

public class Product {
    private String name;
    private double price;
    private int amaountAtStart;

    public Product(String name, double price, int amaountAtStart) {
        this.name = name;
        this.price = price;
        this.amaountAtStart = amaountAtStart;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAmaountAtStart(int amaountAtStart) {
        this.amaountAtStart = amaountAtStart;
    }

    public void printProduct() {
        System.out.println("\"" + name + "\", price " + price + " EUR, " + amaountAtStart + " units");
    }
}
