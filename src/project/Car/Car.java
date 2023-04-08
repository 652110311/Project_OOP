package project.Car;

public abstract class Car {
    protected String carType;
    protected double carPricePerday;
    public Car() {

    }
    public abstract String getDesp();

    public abstract double getCost();
}
