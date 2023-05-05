package project.Car;

import project.Car.Car;

public class PickupTruck extends Car {
    String pick;
    String brand;
    public PickupTruck() {
        super();
    }

    @Override
    public String getDesp() {
        return brand;
    }

    @Override
    public double getCost() {
        return 1500;
    }

    @Override
    public void setbrand(String pick) {

    }
}
