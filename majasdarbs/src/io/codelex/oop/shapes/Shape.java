package io.codelex.oop.shapes;

public abstract class Shape {
    private int numSides;

    public Shape(int numSides) {
        this.numSides = numSides;
    }

    public int getNumSides() {
        return numSides;
    }

    public abstract void getArea();

    public abstract void getPerimeter();


}
