package io.codelex.polymorphism.practice.exercise6;

public class Tiger extends Felime {


    public Tiger(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROARrr");
    }

    @Override
    public void eat(Food food) {

    }
}
