package project.Car;

public class PickupTruck extends Car {
    protected String pick;
    protected String brand;
    public PickupTruck() {

        System.out.println("""
                \nFor drag race
                -Isuzu D-Max\s
                -Mitsubishi Triton\s
                -Chevrolet Colorado
                \nFor go trip
                -Toyota Hilux Revo
                -Nissan Navara PRO-4X
                -Ford Ranger Raptor
                \nFor event
                  -Toyota Vigo
                  -Nissan NP300 KING CAB
                  -Ford HI-RIDER FX4 2.2""");
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
            case "1" -> brand = " 1.Isuzu D-Max";
            case "2" -> brand = " 2.Mitsubishi Triton";
            case "3" -> brand = " 3.Chevrolet Colorado";
            case "4" -> brand = " 4.Toyota Hilux Revo";
            case "5" -> brand = " 5.Nissan Navara PRO-4X";
            case "6" -> brand = " 6.Ford Ranger Raptor";
            case "7" -> brand = " 7.Toyota Vigo";
            case "8" -> brand = " 8.Nissan NP300 KING CAB";
            case "9" -> brand = " 9.Ford HI-RIDER FX4 2.2";
        }
    }
}
