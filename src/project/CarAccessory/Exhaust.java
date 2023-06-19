package project.CarAccessory;

import project.Car.Car;

public class Exhaust extends CarAccessories{
    Car car;
    public Exhaust(Car car) {
        this.car=car;
    }
    @Override
    public String getDesp() {
        return this.car.getDesp()+"\nAccessory: Exhaust";
    }

    @Override
    public double getCost() {
        return 30000+car.getCost();
    }


}
