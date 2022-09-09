package io.codelex.typesandvariables.practice;

public class MoreVariablesAndPrinting {
    public static void main(String[] args) {


       String name = "Zed A. Shaw";
       int age = 35;
       int heightInch = 74;  // inches
       int weightPounds = 180; // lbs
       String eyes = "Blue";
       String teeth = "White";
       String hair = "Brown";
        double height = heightInch*2.54;
        int weight = (int) (Math.round((weightPounds*0.453592) * 100) / 100);


        System.out.println("Let's talk about " + name + ".");
        System.out.println("He's " + height + " centimetres tall.");
        System.out.println("He's " + weight + " kilograms heavy.");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + eyes + " eyes and " + hair + " hair.");
        System.out.println("His teeth are usually " + teeth + " depending on the coffee.");

        System.out.println("If I add " + age + ", " + height + ", and " + weight
                + " I get " + (int)(age + height + weight) + ".");
    }
}