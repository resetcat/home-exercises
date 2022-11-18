package io.codelex.oop.shapes2;

public class Qube extends Shape3D {
    private int side;

    public Qube(int side) {
        this.side = side;
    }

    @Override
    public void calculateArea() {
        System.out.println("Surface area of qube is " + (int) (6 * Math.pow(side, 2)));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter of qube is " + (12 * side));
    }

    @Override
    public void calculateVolume() {
        System.out.println("Volume of the qube is " + (int) Math.pow(side, 3));
    }
}
