package io.codelex.classesandobjects.practice.exercise3;

public class FuelGauge {
    private double fuel;

    public FuelGauge(int fuel) {
        this.fuel = fuel;
    }

    public double getFuel() {
        return fuel;
    }

    public void fillFuel() {
        if (fuel < 70) {
            fuel++;
        } else {
            System.out.println("Your tank is full!");
        }
    }

    public void consumeFuel() {
        if (fuel > 0) {
            fuel--;
        } else {
            System.out.println("Your tank is empty!");
        }
    }

}
