package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class MinutesToHours {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int minutes = scan.nextInt();
        int year = minutes / 525600;
        int days = year != 0 ? (minutes / 1440) - (365 * year) : (minutes / 1440);

        System.out.println("in " + minutes + " minutes there are " + year + " year" + (year != 1 ? "s" : "")
                + " and " + days + " day" + (days != 1 ? "s" : ""));
    }
}
