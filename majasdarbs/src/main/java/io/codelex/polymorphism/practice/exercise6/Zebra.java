package io.codelex.polymorphism.practice.exercise6;

public class Zebra extends Mammal {
    public Zebra(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    public void makeSound() {
        System.out.println("IYaaaaaaa");
    }

    public void eat(Food food) {

    }
}
