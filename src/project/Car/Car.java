package project.Car;

public abstract class Car {
    String description=" Unknown ";
    String pick;
    protected String carType;
    protected double carPricePerday;

    public void setPick(String pick1){
        this.pick = pick1;
    }
    public  String getDesp(){
        return description;
    }

    public abstract double getCost();

    }



