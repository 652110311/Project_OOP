package project.Car;

public class HiendCar extends Car {
    protected String pick;
    protected String brand;
    public HiendCar() {
        System.out.println("""
                \nSport Car
                1.Toyota GR Supra
                2.Porsche 718 Boxster
                3.Chevrolet Camaro ZL1
                \nSuper Car
                4.McLaren 765 LT
                5.Ferrari SF90 Spider
                6.Lamborghini Huracan STO\s
                \nLuxury Car
                7.BENZ C 220 D AMG
                8.Audi Q8
                9.BMW I7""");
    }
    @Override
    public String getDesp() {

        return brand;
    }
    @Override
    public double getCost() {
        return 10000;
    }
    @Override
    public void setbrand(String pick) {
        this.pick = pick;
        switch (pick) {
            case "1" -> brand = " 1.Toyota GR Supra";
            case "2" -> brand = " 2.Porsche 718 Boxster";
            case "3" -> brand = " 3.Chevrolet Camaro ZL1";
            case "4" -> brand = " 4.McLaren 765 LT";
            case "5" -> brand = " 5.Ferrari SF90 Spider";
            case "6" -> brand = " 6.Lamborghini Huracan STO";
            case "7" -> brand = " 7.BENZ C 220 D AMG";
            case "8" -> brand = " 8.Audi Q8";
            case "9" -> brand = " 9.BMW I7";
        }
    }
}
