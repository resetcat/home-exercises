package io.codelex.polymorphism.practice.exercise5;

public enum PosterSize {
    SMALL("22\" x 28\"", 35),
    MEDIUM("24\" x 36\"", 45),
    LARGE("30\" x 40\"", 60),
    XL("36\" x 48\"", 81);

    private final String size;

    public final int price;

    PosterSize(String size, int price) {
        this.size = size;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }


}
