package io.codelex.oop.shapes2;

public class Cone extends Shape3D {
    private int radius;
    private int height;

    public Cone(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Base area of cone is " + (int) area);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Base perimeter of cone is " + (int) perimeter);
    }

    @Override
    public void calculateVolume() {
        double volume = Math.PI * Math.pow(radius, 2) * (height / 3f);
        System.out.println("Volume of the cone is " + (int) volume);
    }
}
