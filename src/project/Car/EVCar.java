package project.Car;

import project.Car.Car;

public class EVCar extends Car {
    String pick;
    String brand;

    public EVCar() {


    }

    public void setPick(String pick1){
        super.setPick(pick1);
        setbrand(pick1);

    }
    public void setbrand (String pick) {
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



