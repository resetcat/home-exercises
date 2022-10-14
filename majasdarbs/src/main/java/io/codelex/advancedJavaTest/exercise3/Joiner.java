package io.codelex.advancedJavaTest.exercise3;

import java.util.function.BiFunction;

public class Joiner<T> {
    private T thing;
    private String separator;

    private BiFunction<T, String, String> joiner;

    public Joiner(T thing, String separator, BiFunction<T, String, String> combiner) {
        this.thing = thing;
        this.separator = separator;
        this.joiner = combiner;
    }

    public String join() {
        return joiner.apply(thing, separator);
    }
}

