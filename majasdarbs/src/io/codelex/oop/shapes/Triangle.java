package io.codelex.oop.shapes;

public class Triangle extends Shape {
    private int width;
    private int height;

    public Triangle(int numSides, int width, int height) {
        super(numSides);
        this.width = width;
        this.height = height;
    }

    @Override
    public void getArea() {
        System.out.println("Area of triangle is " + ((int) (0.5 * (width * height))));
    }

    @Override
    public void getPerimeter() {
        int hypotenuse = (int) Math.sqrt((width * width) + (height + height));
        System.out.println("Perimeter of triangle is " + (width + hypotenuse + height));

    }
}