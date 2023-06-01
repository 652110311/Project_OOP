package project.Car;

public class PickupTruck extends Car {
    protected String pick;
    protected String brand;
    public PickupTruck() {

        System.out.println("""
                \nFor drag race
                1.Isuzu D-Max\s
                2.Mitsubishi Triton\s
                3.Chevrolet Colorado
                \nFor go trip
                4.Toyota Hilux Revo
                5.Nissan Navara PRO-4X
                6.Ford Ranger Raptor
                \nFor event
                7.Toyota Vigo
                8.Nissan NP300 KING CAB
                9.Ford HI-RIDER FX4 2.2""");
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
        return 1500;
    }

    @Override
    public void setbrand(String pick) {
        this.pick = pick;
        switch (pick) {
            case "1" -> brand = " Isuzu D-Max";
            case "2" -> brand = " Mitsubishi Triton";
            case "3" -> brand = " Chevrolet Colorado";
            case "4" -> brand = " Toyota Hilux Revo";
            case "5" -> brand = " Nissan Navara PRO-4X";
            case "6" -> brand = " Ford Ranger Raptor";
            case "7" -> brand = " Toyota Vigo";
            case "8" -> brand = " Nissan NP300 KING CAB";
            case "9" -> brand = " Ford HI-RIDER FX4 2.2";
        }
    }
}
