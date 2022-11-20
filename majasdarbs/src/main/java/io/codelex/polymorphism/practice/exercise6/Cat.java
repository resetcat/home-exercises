package io.codelex.polymorphism.practice.exercise6;

public class Cat extends Felime {
    private String breed;

    public Cat(String animalName, String animalType, double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eat(Food food) {

    }

    @Override
    public String toString() {
        return getAnimalName() + '[' + getAnimalType() + ", " + breed + ", " + getAnimalWeight() + ", " + getLivingRegion() + ", " + getFoodEaten() + "]";
    }
}
