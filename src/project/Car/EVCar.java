package project.Car;

public class EVCar extends Car {
    protected String pick;
    protected String brand;

    public EVCar() {
        System.out.println("EV Car" +
                "1. Tesla Model 3" +
                "2. Tesla Model Y" +
                "3. Tesla Model S" +
                "4. GWM Ora Good cat" +
                "5. GWM Haval H6" +
                "6. GWM Ora Grand cat" +
                "7. BYD Atto 3" +
                "8. BYD Dolphin" +
                "9. BYD Seal");
    }
    public void setPick(String pick){
        super.setPick(pick);
        setbrand(pick);
    }
    public void setbrand (String pick) {
        this.pick = pick;
        switch (pick) {
            case "1" -> brand = " EV Car Tesla Model 3";
            case "2" -> brand = " EV Car Tesla Model Y";
            case "3" -> brand = " EV Car Tesla Model S";
            case "4" -> brand = " EV Car GWM Ora Good cat";
            case "5" -> brand = " EV Car GWM Haval H6";
            case "6" -> brand = " EV Car GWM Ora Grand cat";
            case "7" -> brand = " EV Car BYD Atto 3";
            case "8" -> brand = " EV Car BYD Dolphin";
            case "9" -> brand = " EV Car BYD Seal ";
        }

    }

    public String getDesp() {

        return brand;
    }
        public double getCost () {

        return 1000;
        }

}



