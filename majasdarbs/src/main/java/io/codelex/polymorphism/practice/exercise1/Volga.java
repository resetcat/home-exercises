package io.codelex.polymorphism.practice.exercise1;

public class Volga implements Car, NOS {
    private Integer currentSpeed = 0;

    public void speedUp() {
        currentSpeed += 4;
    }

    public void slowDown() {
        currentSpeed += 4;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    public void startEngine() {
        System.out.println("Khh...Khhh...Brrr");
    }

    @Override
    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 50;
    }
}