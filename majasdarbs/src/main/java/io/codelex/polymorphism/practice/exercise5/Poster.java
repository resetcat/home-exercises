package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert {
    private PosterSize size;
    private int posterCount;


    public Poster(int fee, PosterSize size, int posterCount) {
        super(fee);
        this.size = size;
        this.posterCount = posterCount;
    }

    public int cost() {
        return super.cost() + posterCount * (size.getPrice());
    }

    @Override
    public String toString() {
        return super.toString() + " Poster:" + size.toString() + "(" + size.getSize() + ")" + " Number of copies=" + posterCount;
    }
}
