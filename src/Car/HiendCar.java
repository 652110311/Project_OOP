package Car;

public class HiendCar {
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

    public static void main(String[] args) {
        HiendCar car = new HiendCar();
    }
}
