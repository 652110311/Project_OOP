package project;

import project.Car.Car;

public class Menu extends Car {
    @Override
    public double getCost() {
        return 0;
    }
    int pick;
    public void menuList(String pick)
    {
        switch (pick) {
            case "4" -> {System.out.println("""
                        \nTesla
                        1.Model 3
                        2.Model Y
                        3.Model S""");
                System.out.println("""
                        \nGWM
                        4.Ora Good cat
                        5.Haval H6
                        6.Ora Grand cat""");
                System.out.println("""
                        \nBYD
                        7.Atto 3
                        8.Dolphin
                        9.Seal""");
            }
            case "1" -> {System.out.println(" Toyota" +
                    "1.Toyota GR Supra");
        }
    }
    public void acces()
    {
            System.out.println("""
                    \n
                    1.Exhaust
                    2.Wheels
                    3.Wrap
                    4.exit
                    Select : """);

    }

    @Override
    public void setbrand(String pick) {

    }
}
