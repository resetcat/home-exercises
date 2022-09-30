package io.codelex.oop.shapes2;

public class ShapeMain {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(30, 50);
        Rectangle rectangle = new Rectangle(40, 55);
        Hexagon hexagon = new Hexagon(30);

        triangle.calculateArea();
        triangle.calculatePerimeter();

        rectangle.calculateArea();
        rectangle.calculatePerimeter();

        hexagon.calculateArea();
        hexagon.calculatePerimeter();

        
        Cone cone = new Cone(5, 10);
        Qube qube = new Qube(5);

        cone.calculateVolume();
        cone.calculateArea();
        cone.calculatePerimeter();

        qube.calculateVolume();
        qube.calculateArea();
        qube.calculatePerimeter();


    }

}
