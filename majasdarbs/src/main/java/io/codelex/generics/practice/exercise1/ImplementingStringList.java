package io.codelex.generics.practice.exercise1;

import java.util.List;

public class ImplementingStringList implements InterfaceForLists {

    private List<String> stringList;

    @Override
    public void add(int i, Object el) {
        stringList.add(i, (String) el);
    }

    @Override
    public Object get(int i) {
        return stringList.get(i);
    }
}
