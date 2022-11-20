package io.codelex.polymorphism.practice.exercise3;

public class PersonMain {
    public static void main(String[] args) {
        Student student = new Student("Hari", "Seldon", "Trentor,psyhohistory cathedral", 5513, 95.33);
        Employee employee = new Employee("Cleon", "the Third", "Trentor, emperors palace", 5533, "Galaxy emperor");

        student.display();
        employee.display();
    }
}
