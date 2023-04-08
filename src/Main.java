import Customer.Customer;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date currentDate = new Date();
        System.out.println(currentDate);
        System.out.println("Potter here");

        Scanner input = new Scanner(System.in);
        System.out.println("---------------------------------------");
        System.out.println("==== Welcome to car rental program ====");
        System.out.print(" Customer's name :  ");
        String name = input.next();
        System.out.print(" Phone Number  :  ");
        String phone = input.next();



        System.out.println(" You aren't a member !! Do you want to register as a member??\n" +
                "1.Yes, I want to register a member. \n" +
                "2.No,I am satisfied with  non-member.\n" +
                "Select number[1,2] : ");
            String choice = input.next();

                if(choice.equals("1"))
                {
                    System.out.println("---------------------------------------");
                    System.out.println("==========  Register member =========== ");
                    System.out.print(" Enter email :  ");
                    String email = input.next();
                    System.out.print(" Enter address  :  ");
                    String address = input.next();
                    //Customer member = new Member();
                }




    }
}