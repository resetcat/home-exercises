package io.codelex.advancedJavaTest.exercise3;

import java.util.List;
import java.util.stream.Collectors;

public class Joiner<T> {

    private String separator;


    public Joiner(String separator) {
        this.separator = separator;
    }

    public <E> String join(List<E> list) {
        return list.stream().map(Object::toString).collect(Collectors.joining(separator));
    }
}

