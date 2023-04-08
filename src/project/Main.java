package project;

import project.Car.*;
import project.Customer.Customer;
import project.Customer.Member;
import project.Customer.NonMember;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date currentDate = new Date();
        System.out.println(currentDate);
        System.out.println("Potter here");

        Scanner input = new Scanner(System.in);

            System.out.println("---------------------------------------");
            System.out.println("==== Welcome to car rental program ====" );

            String choice ;

                System.out.print(" Customer's name :  ");
                String name = input.next();
                System.out.print(" Phone Number  :  ");
                String phone = input.next();


                System.out.print(" You aren't a member !! Do you want to register as a member??\n" +
                        "1.Yes, I want to register a member. \n" +
                        "2.No,I am satisfied with  non-member.\n" +
                        "Select number[1,2] : ");
                        choice = input.next();

                Customer customer = null;

                if (choice.equals("1")) {
                    System.out.println("---------------------------------------");
                    System.out.println("==========  Register member =========== ");
                    System.out.print(" Enter email :  ");
                    String email = input.next();
                    System.out.print(" Enter address  :  ");
                    String address = input.next();
                    customer = new Member(name, phone, email, address);

                } else if (choice.equals("2")) {
                    customer = new NonMember(name, phone);

                }

                System.out.println("---------------------------------------");
                System.out.println("Customer's name : " + customer.getName() +
                        "\nPhone number : " + customer.getPhone() +
                        "\nStatus : " + customer.getStatus() +
                        "\nDiscount : " + (customer.getDiscount()*100)+"%");
                System.out.println("---------------------------------------");
                System.out.println("What kind of car do you want? \n" +
                        "1.HiEnd Car \n" +
                        "2.Pickup Truck\n" +
                        "3.Normal Car\n" +
                        "4.Electric Vehicle\n" +
                        "Select number[1-4] :");
                choice =input.next();
                Car car = null;
                        if(choice.equals("1")) {
                            car = new HiendCar();

                        }
                        else if(choice.equals("2")) {
                            car = new PickupTruck();
                        }
                        else if(choice.equals("3"))
                        {
                            car = new NormalCar();
                        }
                        else if(choice.equals("4"))
                        {
                            car = new EVCar();
                        }
                System.out.println("---------------------------------------");

        }


    }
