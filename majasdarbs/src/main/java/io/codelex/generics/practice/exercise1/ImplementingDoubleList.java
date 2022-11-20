package io.codelex.generics.practice.exercise1;

import java.util.List;

public class ImplementingDoubleList implements InterfaceForLists {

    private List<Double> doubleList;

    @Override
    public void add(int i, Object el) {
        doubleList.add(i, (double) el);
    }

    @Override
    public Object get(int i) {
        return doubleList.get(i);
    }
}
