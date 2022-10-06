package io.codelex.collections.practice;

import java.util.HashMap;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Mercedes", "Tesla"};
        HashMap<String, String> arr = new HashMap<>();
        arr.put("Audi", "Germany");
        arr.put("BMW", "Germany");
        arr.put("Honda", "Japan");
        arr.put("Mercedes", "Germany");
        arr.put("VolksWagen", "Germany");
        arr.put("Mercedes", "Germany");
        arr.put("Tesla", "USA");
        System.out.println(arr);

        //todo - replace array with an ArrayList and print out the results

        //todo - replace array with a HashSet and print out the results

        //todo - replace array with a HashMap (use brand as key and origination as value) an print out the results
    }
}
