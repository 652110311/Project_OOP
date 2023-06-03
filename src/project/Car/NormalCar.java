package project.Car;

public class NormalCar extends Car {
    protected String pick;
    protected String brand;
    public NormalCar() {

        System.out.println("""
                \nMazda
                1.Mazda 3
                2.Mazda cx 5
                3.Mazda cx30
                \nToyota
                4.Toyota Yaris
                5.Toyota Vios
                6.Toyota Camry
                \nHonda
                7.Honda City
                8.Honda Accord
                9.Honda Civic""");
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
