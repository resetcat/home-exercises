package io.codelex.classesandobjects.practice.exercise3;

public class SimDrive {
    public static void main(String[] args) {
        FuelGauge tank = new FuelGauge(50);
        Odometer odd = new Odometer(999_900);

        for (int i = 1; tank.getFuel() != 0; i++) {
            odd.drive();
            System.out.println("Odometer shows " + odd.getMillage() + "km and " + tank.getFuel() + "L left");
            if (i % 10 == 0) {
                tank.consumeFuel();
            }
        }
        while (tank.getFuel() != 70) {
            tank.fillFuel();
        }


    }
}
