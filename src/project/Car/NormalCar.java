package project.Car;

import project.Car.Car;

public class NormalCar extends Car {
    String pick;
    String brand;
    public NormalCar() {
        System.out.println("""
                \nMazda
                -Mazda 3
                -Mazda cx 5
                -Mazda cx30
                \nToyota
                -Yaris
                -Vios
                -Camry
                \nHonda
                  -City
                  -Accord
                  -Civic""");
    }

    @Override
    public String getDesp() {
        return brand;
    }

    @Override
    public double getCost() {
        return 2000;
    }

    @Override
    public void setbrand(String pick) {

    }
}
