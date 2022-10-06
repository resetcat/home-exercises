package io.codelex.collections.practice.phonebook;

import java.util.HashMap;
import java.util.Map;

public class PhoneDirectory {

    private Map<String, String> data;


    public PhoneDirectory() {
        data = new HashMap<>();
    }

    private boolean find(String name) {
        return data.containsKey(name);
    }


    public String getNumber(String name) {
        return data.get(name);
    }

    public void putNumber(String name, String number) {
        if (name == null) {
            throw new IllegalArgumentException("name cannot be null");
        }
        data.put(name, number);
    }

}