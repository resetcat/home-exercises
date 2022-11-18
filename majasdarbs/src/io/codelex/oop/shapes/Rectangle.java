package io.codelex.oop.shapes;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int numSides, int width, int height) {
        super(numSides);
        this.width = width;
        this.height = height;
    }

    @Override
    public void getArea() {
        System.out.println("Area of rectangle is " + (width * height));
    }

    @Override
    public void getPerimeter() {
        System.out.println("Perimeter of rectangle is " + 2 * (width + height));
    }
}
