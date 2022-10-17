package io.codelex.advancedJavaTest.exercise5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Part {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Peter", "Angelina", "Bravo");
        double percent = partOf(names, (String name) -> name.length() > 4);
        System.out.println(percent);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        double evenPercent = partOf(numbers, (Integer n) -> n % 2 == 1);
        System.out.println(evenPercent);
    }


    public static <T> double partOf(List<T> thing, Predicate<T> passer) {
        return (double) thing.stream().filter(passer).toList().size() / thing.size();
    }
}
