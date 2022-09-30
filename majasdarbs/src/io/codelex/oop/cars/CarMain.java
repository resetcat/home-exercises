package io.codelex.oop.cars;

public class CarMain {
    public static void main(String[] args) {
        Manufacturer volkswagenGroup = new Manufacturer("Volkswagen Group", "Germany", 1937);
        Manufacturer toyotaMotor = new Manufacturer("Toyota Motor", "Japan", 1954);
        Manufacturer bmwGroup = new Manufacturer("BMW group", "Germany", 1916);
        Manufacturer generalMotors = new Manufacturer("General Motors", "USA", 1908);
        Manufacturer raf = new Manufacturer("Rīgas autobusu fabrika", "Latvia", 1954);

        Car x5 = new Car("BMW", "X6", 50_000, 2015, Engine.V8);
        x5.addManufacturer(bmwGroup, volkswagenGroup);
        Car golf = new Car("Volkswagen", "golf", 20_000, 2020, Engine.S3);
        golf.addManufacturer(volkswagenGroup, raf);
        Car lexusLS = new Car("Lexus", "LS", 90_000, 2022, Engine.S6);
        lexusLS.addManufacturer(toyotaMotor);
        Car t70 = new Car("Chevrolet", "Maxus T70", 30_000, 2021, Engine.V12);
        t70.addManufacturer(generalMotors);
        Car rafik = new Car("RAF", "2203 Latvija", 5_000, 1993, Engine.V12);
        rafik.addManufacturer(raf, volkswagenGroup, bmwGroup);

        CarService carService = new CarService();
        carService.addCar(x5, golf, lexusLS, t70, rafik);
        System.out.println(carService.getV12().size());
        System.out.println(carService.get1999().size());
        System.out.println(carService.getCarList().size());
        System.out.println(carService.getExpensiveCar());
        System.out.println(carService.getCheapCar());
        System.out.println(carService.getCarWithManyManufacturers());
        carService.sortCarList(Sorting.ASCENDING);
        System.out.println(carService.getCarList());
        carService.sortCarList(Sorting.DESCENDING);
        System.out.println(carService.getCarList());
        carService.removeCar(rafik);
        System.out.println(carService.hasCar(rafik));
        System.out.println(carService.getCarByManufacturer(raf).size());
        System.out.println(carService.getCarByManufactorYearRange(volkswagenGroup, 1999, Range.EQUALS).size());

    }
}
