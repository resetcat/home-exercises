package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class CalcBMI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose your measurement system: \n1. for metric system\n2. for imperial system");
        byte measureSys = scan.nextByte();
        while (measureSys != 1 && measureSys != 2) {
            System.out.println("wrong input! You must write number 1 or 2!");
            measureSys = scan.nextByte();
//            scan.close();
        }
        System.out.println("Enter your weight in " + (measureSys == 1 ? "kg" : "lb"));
        int weight = scan.nextInt();
        System.out.println("Enter your height in " + (measureSys == 1 ? "metres" : "inches"));
        double height = scan.nextDouble();
        double calcBMI = measureSys == 1 ? weight / ((height) * (height)) : (703 * weight) / ((height) * (height));
        calcBMI = Math.round(calcBMI * 100) / 100D;
        System.out.println("Your BMI is " + calcBMI + " you are " + (calcBMI > 25 ? "overweight" : calcBMI < 18.5 ? "underweight" : "in optimal form."));
    }
}

