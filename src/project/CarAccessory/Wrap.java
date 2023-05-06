package project.CarAccessory;

import project.Car.Car;

public class Wrap extends CarAccessories{
    Car car;
    public Wrap(Car car) {
        this.car=car;
    }
    @Override
    public String getDesp() {
        return this.car.getDesp()+", Wrap ";
    }
    @Override
    public double getCost() {
        return this.car.getCost()+8000;
    }

    @Override
    public void setbrand(String pick) {

    }
}
