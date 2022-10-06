package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise4 {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter name: ");
            String inputName = scan.nextLine();
            if (inputName.isEmpty()) {
                break;
            } else {
                names.add(inputName);
            }
        }
        if (!names.isEmpty()) {
            System.out.println("Unique name is the list are: " + String.join(" ", names));
        }
    }
}
