package io.codelex.polymorphism.practice.exercise6;

public abstract class Animal {
    private String animalName;
    private String animalType;
    private double animalWeight;

    private int foodEaten;

    public Animal(String animalName, String animalType, double animalWeight) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
    }

    public abstract void makeSound();

    public abstract void eat(Food food);

    public void setFoodEaten(int foodEaten) {
        this.foodEaten = foodEaten;
    }

    public String getAnimalName() {
        return animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public double getAnimalWeight() {
        return animalWeight;
    }

    public int getFoodEaten() {
        return foodEaten;
    }

    @Override
    public String toString() {
        return animalName + '[' + animalType + ", " + animalWeight + ", " + foodEaten;
    }
}
