package project.CarAccessory;

import project.Car.Car;

public  class CarAccessories extends Car {

 public CarAccessories() {
     System.out.println("""
                    \n
                    1.Exhaust
                    2.Wheels
                    3.Wrap
                    4.exit
                    Select : """);
 }


    @Override
    public double getCost() {
        return 0;
    }

}

