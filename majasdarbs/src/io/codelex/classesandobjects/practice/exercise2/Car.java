package io.codelex.classesandobjects.practice.exercise2;

public class Car {
    private double startKm;
    private double endKm;
    private double litres;

    public Car(double startKm, double endKm, double litres) {
        this.startKm = startKm;
        this.endKm = endKm;
        this.litres = litres;
    }

    public Car(double startKm) {
        this.startKm = startKm;
        this.endKm = startKm;
        this.litres = 0;
    }

    public void fillUp(double milage, double litres) {
        endKm = milage;
        this.litres = litres;
        printCar();
    }

    public double calcFuelConsumption() {

        return Math.floor((litres / (endKm - startKm) * 100) * 100) / 100;
    }

    public boolean gasHog() {
        return calcFuelConsumption() > 15;
    }

    public boolean economyCar() {
        return calcFuelConsumption() < 5;
    }

    public void printCar() {
        System.out.println("Litres per 100km is " + this.calcFuelConsumption() +
                (this.gasHog() ? " you car is a gas hog!" : this.economyCar() ? " your car is economy!" : ""));
    }

}

