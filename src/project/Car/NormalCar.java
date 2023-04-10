package project.Car;

import project.Car.Car;

public class NormalCar extends Car {
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
        return null;
    }

    @Override
    public double getCost() {
        return 0;
    }
}
