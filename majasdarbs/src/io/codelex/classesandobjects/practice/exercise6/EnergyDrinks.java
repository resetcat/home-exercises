package io.codelex.classesandobjects.practice.exercise6;

public class EnergyDrinks {
    static final int NUMBERED_SURVEYED = 12467;
    final static double PURCHASED_ENERGY_DRINKS = 0.14;
    final static double PREFER_CITRUS_DRINKS = 0.64;

    public static void main(String[] args) {

        System.out.println("Total number of people surveyed " + NUMBERED_SURVEYED);
        System.out.println("Approximately " + calculateEnergyDrinkers(NUMBERED_SURVEYED) + " bought at least one energy drink");
        System.out.println(calculatePreferCitrus(NUMBERED_SURVEYED) + " of those " + "prefer citrus flavored energy drinks.");
    }

    public static int calculateEnergyDrinkers(int numberSurveyed) {
        return (int) (numberSurveyed * PURCHASED_ENERGY_DRINKS);
    }

    public static int calculatePreferCitrus(int numberSurveyed) {
        return (int) (calculateEnergyDrinkers(numberSurveyed) * PREFER_CITRUS_DRINKS);

    }
}
