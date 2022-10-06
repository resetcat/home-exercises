package io.codelex.collections.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scan.nextInt();

        if (number > 0) {
            isHappy(getList(number));
        } else {
            System.out.println("Positive numbers only");
        }
    }

    private static void isHappy(List<Integer> numList) {
        int sum = 0;
        for (int number : numList) {
            sum += Math.pow(number, 2);
        }
        if (sum == 1) {
            System.out.println("Number is happy number :)");
        } else if (sum == 4) {
            System.out.println("Number is sad number :(");
        } else {
            isHappy(getList(sum));
        }
    }


    public static List<Integer> getList(int number) {
        List<Integer> temp = new ArrayList<>();
        while (number > 0) {
            temp.add(number % 10);
            number = number / 10;
        }
        return temp;

    }
}
