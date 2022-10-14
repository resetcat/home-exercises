package io.codelex.advancedJavaTest.exercise3;

import java.util.List;
import java.util.function.BiFunction;

public class Joiner<T> {
    private List<T> thing;
    private String separator;

    private BiFunction<List<T>, String, String> joiner;

    public Joiner(List<T> thing, String separator, BiFunction<List<T>, String, String> joiner) {
        this.thing = thing;
        this.separator = separator;
        this.joiner = joiner;
    }

    public String join() {
        return joiner.apply(thing, separator);
    }
}

