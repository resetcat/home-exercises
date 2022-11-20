package io.codelex.polymorphism.practice.exercise3;

public class Employee extends Person {
    private String jobTitle;

    public Employee(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Employee(String firstName, String lastName, String adress, int idNr, String jobTitle) {
        super(firstName, lastName, adress, idNr);
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    void display() {
        System.out.println(
                "name: " + getFirstName() + " " + getLastName() + "Id: " + getIdNr() + " title: " + getJobTitle() + "\n " + "address:" + getAddress());
    }
}
