package io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CarService {
    List<Car> carList = new ArrayList<>();

    public void addCar(Car... car) {
        Collections.addAll(carList, car);
    }

    public void removeCar(Car car) {
        carList.remove(car);
    }

    public List<Car> getCarList() {
        return carList;
    }

    public List<Car> getV12() {
        return carList.stream().filter(car -> car.engine.equals(Engine.V12)).toList();
    }

    public List<Car> get1999() {
        return carList.stream().filter(car -> car.getYearOfManufacture() < 1999).toList();
    }

    public Car getExpensiveCar() {
        return carList.stream().reduce((a, b) -> a.getPrice() > b.getPrice() ? a : b).get();
    }

    public Car getCheapCar() {
        return carList.stream().reduce((a, b) -> a.getPrice() < b.getPrice() ? a : b).get();
    }

    public List<Car> getCarWithManyManufacturers() {
        return carList.stream().filter(car -> car.getManufacturerList().size() >= 3).toList();
    }

    public void sortCarList(Sorting order) {
        if (order == Sorting.ASCENDING) {
            carList.sort(Comparator.comparing(Car::getName));
        } else {
            carList.sort(Comparator.comparing(Car::getName).reversed());
        }

    }

    public boolean hasCar(Car car) {
        return carList.contains(car);
    }

    public List<Car> getCarByManufacturer(Manufacturer manufacturer) {
        return carList.stream().filter(car -> car.getManufacturerList().contains(manufacturer)).toList();
    }

    public List<Car> getCarByManufactorYearRange(Manufacturer manufacturer, int year, Range range) {
        List<Car> madeInFactory = getCarByManufacturer(manufacturer);
        switch (range) {
            case GREATER_THAN ->
                    madeInFactory = madeInFactory.stream().filter(car -> car.getYearOfManufacture() > year).toList();
            case GREATER_THAN_OR_EQUALS ->
                    madeInFactory = madeInFactory.stream().filter(car -> car.getYearOfManufacture() >= year).toList();
            case SMALLER_THAN ->
                    madeInFactory = madeInFactory.stream().filter(car -> car.getYearOfManufacture() < year).toList();
            case SMALLER_THAN_OR_EQUALS ->
                    madeInFactory = madeInFactory.stream().filter(car -> car.getYearOfManufacture() <= year).toList();
            case EQUALS ->
                    madeInFactory = madeInFactory.stream().filter(car -> car.getYearOfManufacture() == year).toList();
            case NOT_EQUALS ->
                    madeInFactory = madeInFactory.stream().filter(car -> car.getYearOfManufacture() != year).toList();
        }
        return madeInFactory;
    }

}
