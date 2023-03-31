package Car;

public class EVCar {
    public EVCar() {
        System.out.println("""
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

    public static void main(String[] args) {
        EVCar car =new EVCar();
    }

}
