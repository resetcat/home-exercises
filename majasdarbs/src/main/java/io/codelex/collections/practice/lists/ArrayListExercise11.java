package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        //TODO: Create an ArrayList with String elements
        //TODO: Add 10 values to list
        List<String> siths = new ArrayList<>(
                Arrays.asList("Revan", "Sidious", "Moul", "Darth Bane", "Marka Ragnos", "Ulic Qel-Droma",
                              "Freedon Nadd", "Darth Vader", "Exar Kun", "Darth Traya"));
        System.out.println(siths.size());
        //TODO: Add new value at 5th position
        siths.add(5, "Darth Nihilus");
        //TODO: Change value at last position (Calculate last position programmatically)
        siths.set(siths.size() - 1, "Darth Malak ");
        //TODO: Sort your list in alphabetical order
        Collections.sort(siths);
        //TODO: Check if your list contains "Foobar" element
        if (siths.contains("Foobar")) {
            System.out.println("Why is Foobar here ?");
        }
        //TODO: Print each element of list using loop
        for (String sith : siths) {
            System.out.println(sith);
        }
    }

}
