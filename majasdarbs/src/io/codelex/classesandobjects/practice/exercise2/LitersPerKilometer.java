package io.codelex.classesandobjects.practice.exercise2;

import java.util.Scanner;

public class LitersPerKilometer {
    public static void main(String[] args) {


        Car car = createCar();
        Car car1 = createCar();
        Car car2 = new Car(0);
        car.printCar();
        car1.printCar();
        car2.fillUp(1200, 50);

    }


    private static Car createCar() {
        Scanner scan = new Scanner(System.in);

        double startKm;
        double endKm;
        double litres;

        System.out.print("Enter first reading: ");
        startKm = scan.nextDouble();

        System.out.print("Enter second reading: ");
        endKm = scan.nextDouble();

        System.out.print("Enter liters consumed: ");
        litres = scan.nextDouble();

        return new Car(startKm, endKm, litres);
    }

}

