package io.codelex.oop.shapes2;

public class Hexagon extends Shape {

    private int side;

    public Hexagon(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public void calculateArea() {
        double area = (3 * Math.sqrt(3) * (Math.pow(side, 2))) / 2;
        System.out.println("Area of hexagon is " + (int) area);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter of hexagon is " + side * 6);
    }
}