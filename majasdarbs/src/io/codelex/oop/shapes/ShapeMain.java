package io.codelex.oop.shapes;

public class ShapeMain {
    public static void main(String[] args) {

        Rectangle rec = new Rectangle(4, 20, 40);
        rec.getArea();
        rec.getPerimeter();
        System.out.println(rec.getNumSides());

        Triangle tri = new Triangle(3, 10, 20);
        tri.getArea();
        tri.getPerimeter();
        System.out.println(tri.getNumSides());

    }
}
