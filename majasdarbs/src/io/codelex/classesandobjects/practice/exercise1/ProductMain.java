package io.codelex.classesandobjects.practice.exercise1;

public class ProductMain {
    public static void main(String[] args) {
        Product mouse = new Product("Logitech mouse", 70.00, 14);
        Product phone = new Product("iPhone 5s", 999.99, 3);
        Product projector = new Product("Epson EB-U05", 440.46, 1);

        mouse.printProduct();
        phone.printProduct();
        projector.printProduct();

        mouse.setPrice(69.99);
        mouse.setAmaountAtStart(50);
        mouse.printProduct();
    }
}
