package project.Car;

public class NormalCar extends Car {
    protected String pick;
    protected String brand;
    public NormalCar() {

        System.out.println("""
                \nMazda
                -Mazda 3
                -Mazda cx 5
                -Mazda cx30
                \nToyota
                -Toyota Yaris
                -Toyota Vios
                -Toyota Camry
                \nHonda
                  -Honda City
                  -Honda Accord
                  -Honda Civic""");
    }
    public void setPick(String pick){
        super.setPick(pick);
        setbrand(pick);
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
        this.pick = pick;
        switch (pick) {
            case "1" -> brand = " Mazda 3";
            case "2" -> brand = " Mazda cx 5";
            case "3" -> brand = " Mazda cx30";
            case "4" -> brand = " Toyota Yaris";
            case "5" -> brand = " Toyota Vios";
            case "6" -> brand = " Toyota Camry";
            case "7" -> brand = " Honda City";
            case "8" -> brand = " Honda Accord";
            case "9" -> brand = " Honda Civic ";
        }
    }
}
