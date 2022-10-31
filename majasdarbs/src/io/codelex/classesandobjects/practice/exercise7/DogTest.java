package io.codelex.classesandobjects.practice.exercise7;

public class DogTest {
    public static void main(String[] args) {
        Dog dog = new Dog("Max", "male");
        Dog dog1 = new Dog("Rocky", "male");
        Dog dog2 = new Dog("Sparky", "male");
        Dog dog3 = new Dog("Buster", "male");
        Dog dog4 = new Dog("Sam", "male");
        Dog dog5 = new Dog("Lady", "female");
        Dog dog6 = new Dog("Molly", "female");
        Dog dog7 = new Dog("Coco", "female");

        dog.setFather(dog1.getName());
        dog.setMother(dog5.getName());
        dog7.setFather(dog3.getName());
        dog7.setMother(dog6.getName());
        dog1.setFather(dog4.getName());
        dog1.setMother(dog6.getName());
        dog3.setFather(dog2.getName());
        dog3.setMother(dog5.getName());

        dog7.fatherName();
        dog2.fatherName();

        System.out.println(dog7.hasSameMotherAs(dog1));

    }
}
