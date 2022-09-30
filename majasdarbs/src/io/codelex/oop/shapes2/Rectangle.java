package io.codelex.oop.shapes2;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of rectangle is " + (width * height));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter of rectangle is " + (2 * (width + height)));
    }
}
