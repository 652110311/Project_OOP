package project.CarAccessory;

import project.Car.Car;

public class Wheels extends CarAccessories{
    Car car;
    public Wheels(Car car) {
            this.car=car;
        }
        @Override
        public String getDesp() {
            return this.car.getDesp()+"\nAccessory:  Wheels";
        }

        @Override
        public double getCost() {
            return this.car.getCost()+15000;
        }

}
