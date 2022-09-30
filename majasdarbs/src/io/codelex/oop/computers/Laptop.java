package io.codelex.oop.computers;

import java.util.Objects;

public class Laptop extends Computer {

    private String baterryModel;

    public Laptop(String cpu, int ram, String gpu, String company, String model, String baterryModel) {
        super(cpu, ram, gpu, company, model);
        this.baterryModel = baterryModel;
    }

    public String getBaterryModel() {
        return baterryModel;
    }

    public void setBaterryModel(String baterryModel) {
        this.baterryModel = baterryModel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(baterryModel, laptop.baterryModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), baterryModel);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "baterryModel='" + baterryModel + '\'' +
                "} " + super.toString();
    }
}
