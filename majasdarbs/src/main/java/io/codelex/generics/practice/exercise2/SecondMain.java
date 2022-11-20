package io.codelex.generics.practice.exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondMain {

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<String> strings = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        List<Object> idk = new ArrayList<>();
        idk.add(new Object());
        System.out.println(concatenate(ints));
        System.out.println(concatenate(strings));
        System.out.println(concatenate(idk));
    }


    static String concatenate(List<?> list) {
        String result = "";
        String separator = "";
        if (list.get(0) instanceof String) {
            result = "String:";
            separator = " ";
        } else if (list.get(0) instanceof Integer) {
            result = "Integers:";
            separator = "+";
        }
        for (Object el : list) {
            result = result + separator + el.toString();
        }
        return result;
    }
}
