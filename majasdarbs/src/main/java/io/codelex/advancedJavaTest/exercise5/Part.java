package io.codelex.advancedJavaTest.exercise5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Part {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Peter", "Angelina", "Bravo");
        double percent = partOf(names, (name) -> name.stream().filter(a -> a.length() > 4).toList().size());
        System.out.println(percent);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        double evenPercent = partOf(numbers, (n) -> n.stream().filter(num -> num % 2 == 0).toList().size());
        System.out.println(evenPercent);
    }


    public static <T> double partOf(List<T> thing, Function<List<T>, Integer> passer) {
        return (double) passer.apply(thing) / thing.size();
    }
}
