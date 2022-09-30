package io.codelex.oop.shapes2;

public class Triangle extends Shape {

    private int width;
    private int height;

    public Triangle(int width, int height) {
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
        System.out.println("Area of triangle is " + ((int) (0.5 * (width * height))));
    }

    @Override
    public void calculatePerimeter() {
        int hypotenuse = (int) Math.sqrt((width * width) + (height * height));
        System.out.println("Perimeter of triangle is " + (width + hypotenuse + height));
    }
}