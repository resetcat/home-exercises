package io.codelex.classesandobjects.practice.exercise3;

public class Odometer {
    private int millage;

    public Odometer(int millage) {
        this.millage = millage;
    }

    public int getMillage() {
        return millage;
    }

    public void drive() {
        if (millage == 999_999) {
            millage = 0;
        } else {
            millage++;

        }

    }
}
