package project.Car;

public abstract class Car {
    String description = " Unknown ";
    protected String pick;
    protected String carType;
    protected double carPricePerday;
    protected static String status = "";
    public void setStatus() {
        this.status = status;
    }

    public void setPick(String pick1) {
        this.pick = pick1;
    }

    public String getDesp() {
        return description;
    }

    public abstract double getCost();
    public void setbrand(String pick){

    }


}



