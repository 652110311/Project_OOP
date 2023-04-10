package project.Car;

import project.Car.Car;

public class EVCar extends Car {
    String pick;
    String brand;

    public EVCar() {


    }

    public void setPick(String pick1){
        super.setPick(pick1);
        brand(pick1);

    }
    public void brand (String pick) {
        if(pick.equals("1"))
        {
            brand = " EV Car Tesla Model 3";
        } else if (pick.equals("2")) {
            brand=" EV Car Tesla Model Y";
        }else if (pick.equals("3")) {
            brand=" EV Car Tesla Model S";
        }else if (pick.equals("4")) {
            brand= " EV Car GWM Ora Good cat";
        }else if (pick.equals("5")) {
            brand= " EV Car GWM Haval H6";
        }else if (pick.equals("6")) {
            brand= " EV Car GWM Ora Grand cat";
        }else if (pick.equals("7")) {
            brand= " EV Car BYD Atto 3";
        }else if (pick.equals("8")) {
            brand= " EV Car BYD Dolphin";
        }else if (pick.equals("9")) {
            brand= " EV Car BYD Seal ";
        }

    }

    public String getDesp() {

        return brand;
    }
        public double getCost () {
            return 1000;
        }

    }


