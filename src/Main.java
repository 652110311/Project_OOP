import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date currentDate = new Date();
        System.out.println(currentDate);
        System.out.println("Potter here");
    }
}