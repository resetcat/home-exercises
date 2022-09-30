package io.codelex.oop.persons;

import java.time.LocalDate;

public class PersonMain {
    public static void main(String[] args) {
        Employee worker = new Employee("Thomas", "Anderson", "1234ID", 25, "developer", LocalDate.of(2019, 2, 2));
        System.out.println(worker.getInfo());

        Costumer agent = new Costumer("Agent", "Smith", "123456", 30, "00001", 20);
        System.out.println(agent.getInfo());
    }

}

