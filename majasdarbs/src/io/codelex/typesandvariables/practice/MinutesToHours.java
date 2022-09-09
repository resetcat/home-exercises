package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class MinutesToHours {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int minutes = scan.nextInt();

        int year = minutes / 525600;
        int days = minutes / 1440;

        System.out.println("in " + minutes + " minutes are " + days + " day" + (days != 1 ? "s" : "") + " and " + year + " year" + (year != 1 ? "s" : ""));
    }
}
