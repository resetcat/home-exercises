package io.codelex.polymorphism.practice.exercise6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimalMain {
    public static List<Animal> animalList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner startScan = new Scanner(System.in);
        checkInput(startScan.nextLine());
    }

    private static void checkInput(String input) {
        while (true) {
            if (input.equals("End")) {
                System.out.println(animalList);
                break;
            }
            List<String> inputList = new ArrayList<>(List.of(input.split(" ")));
            validateList(inputList);
            makeAnimal(inputList);
        }

    }

    private static void makeAnimal(List<String> inputList) {
        String animalName = inputList.get(0);
        String animalType = inputList.get(1);
        double animalWeight = Double.parseDouble(inputList.get(2));
        String livingRegion = inputList.get(3);
        String breed = null;
        if (inputList.size() == 5) {
            breed = inputList.get(4);
        }
        switch (inputList.get(0)) {
            case "Mouse" -> {
                animalList.add(new Mouse(animalName, animalType, animalWeight, livingRegion));
                makeNewSound();
            }
            case "Zebra" -> {
                animalList.add(new Zebra(animalName, animalType, animalWeight, livingRegion));
                makeNewSound();
            }
            case "Tiger" -> {
                animalList.add(new Tiger(animalName, animalType, animalWeight, livingRegion));
                makeNewSound();
            }
            case "Cat" -> {
                animalList.add(new Cat(animalName, animalType, animalWeight, livingRegion, breed));
                makeNewSound();
            }
            default -> invalidInput();
        }

        addFood(animalList.get(animalList.size() - 1));
    }

    private static void addFood(Animal animal) {
        Scanner scan1 = new Scanner(System.in);

        checkFoodInput(scan1.nextLine(), animal);
        System.out.println(animal);
        checkInput(scan1.nextLine());
    }

    private static void checkFoodInput(String input, Animal animal) {
        List<String> inputList = new ArrayList<>(List.of(input.split(" ")));
        try {
            Integer.parseInt(inputList.get(1));
        } catch (NumberFormatException ex) {
            invalidInput();
        }
        if (input.equals("End")) {
            System.out.println(animalList);
            System.exit(0);
        } else if (inputList.size() != 2) {
            System.out.println("Invalid input");
            addFood(animal);
        } else if (animal.getClass().getSimpleName().equals("Tiger") && inputList.get(0).equals("Vegetable")) {
            System.out.println("Tigers are not eating that type of food!");
            animal.setFoodEaten(0);
        } else if (animal.getClass().getSimpleName().equals("Zebra") && inputList.get(0).equals("Meat")) {
            System.out.println("Zebras are not eating that type of food!");
            animal.setFoodEaten(0);
        } else {
            animal.setFoodEaten(Integer.parseInt(inputList.get(1)));
        }


    }

    private static void makeNewSound() {
        animalList.get(animalList.size() - 1).makeSound();
    }

    private static void validateList(List<String> inputList) {
        int listSize = inputList.size();
        if (listSize > 5 || listSize < 4) {
            invalidInput();
        } else if (Double.isNaN(Double.parseDouble(inputList.get(2)))) {
            invalidInput();
        }
    }

    private static void invalidInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Invalid input! Try again");
        checkInput(scan.nextLine());
        scan.nextLine();

    }
}
