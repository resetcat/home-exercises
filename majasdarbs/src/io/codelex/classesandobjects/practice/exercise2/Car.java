package io.codelex.classesandobjects.practice.exercise2;

public class Car {
    private double startKm;
    private double endKm;
    private double litres;

    private boolean isEconomyCar = calcFuelConsumption() < 5;
    private boolean isGasHog = calcFuelConsumption() > 15;

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

    public void printCar() {
        System.out.println("Litres per 100km is " + this.calcFuelConsumption() + (isGasHog ?
                " you car is a gas hog!" :
                isEconomyCar ? " your car is economy!" : ""));
    }

}

