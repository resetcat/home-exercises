package io.codelex.polymorphism.practice.exercise6;

public class Mouse extends Mammal {
    public Mouse(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    public void makeSound() {
        System.out.println("Pee pee pee");
    }

    public void eat(Food food) {

    }
}
