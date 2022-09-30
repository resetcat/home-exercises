package io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Car {
    private String name;
    private String model;
    private int price;
    private int yearOfManufacture;
    private List<Manufacturer> ManufacturerList = new ArrayList<>();
    Engine engine;

    public Car(String name, String model, int price, int yearOfManufacture, Engine engine) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
        this.engine = engine;
    }

    public List<Manufacturer> getManufacturerList() {
        return ManufacturerList;
    }

    public void addManufacturer(Manufacturer... manufacturer) {
        Collections.addAll(ManufacturerList, manufacturer);
    }

    @Override
    public String toString() {
        return "Car{" + "name='" + name + '\'' + ", model='" + model + '\'' + ", price=" + price + ", yearOfManufacture=" + yearOfManufacture + ", ManufacturerList=" + ManufacturerList + ", engine=" + engine + '}';
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public Engine getEngine() {
        return engine;
    }


}