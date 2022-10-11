package io.codelex.polymorphism.practice.exercise3;

public abstract class Person {
    private String firstName;
    private String lastName;
    private String address;
    private int idNr;

    public Person() {
    }

    public Person(String firstName, String lastName, String adress, int idNr) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = adress;
        this.idNr = idNr;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getIdNr() {
        return idNr;
    }

    public void setIdNr(int idNr) {
        this.idNr = idNr;
    }

    abstract void display();
}
