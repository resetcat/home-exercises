package io.codelex.generics.practice.exercise3;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<String> string = new ArrayList<>();
        string.add("some text");
        string.add("text");

        List<CharSequence> strings = new ArrayList<>();
        strings.add("foundation");
        strings.add("iRobot");

//        addAllY(string, strings);
        addAllX(string, strings);
        System.out.println(strings);

    }


    static public <V> void addAllX(List<V> v, List<? super V> l) {
        l.addAll(v);
    }

    static public <V> void addAllY(List<V> v, List<V> l) {
        l.addAll(v);
    }
}
