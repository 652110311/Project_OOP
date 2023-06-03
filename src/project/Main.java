package project;

import project.Car.*;
import project.Car.EVCar;
import project.Car.HiendCar;
import project.Car.NormalCar;
import project.Car.PickupTruck;
import project.CarAccessory.CarAccessories;
import project.CarAccessory.Exhaust;
import project.CarAccessory.Wheels;
import project.CarAccessory.Wrap;
import project.Customer.Customer;
import project.Customer.Member;
import project.Customer.NonMember;
import project.Rent.Deposit;
import project.Rent.Payment;

//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
//        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//        Date currentDate = new Date();
//         System.out.println(currentDate);
//        System.out.println("Potter here");
        Scanner input = new Scanner(System.in);
        String choice;
        do {
            System.out.println("---------------------------------------");
            System.out.println("==== Welcome to car rental program ====");
            System.out.println("1.Rental car");
            System.out.println("2.Exit");
            System.out.println("Select number[1-2] :");
            choice = input.next();

            if(choice.equals("1")) {
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
                customer.getDescribe();
                Car car = null;
                customer.getCarTypeMenu();
                choice = input.next();
                Deposit deposit = new Deposit(choice);
                if (choice.equals("1")) {
                    car = new HiendCar();
                } else if (choice.equals("2")) {
                    car = new PickupTruck();
                } else if (choice.equals("3")) {
                    car = new NormalCar();
                } else if (choice.equals("4")) {
                    car = new EVCar();

                }
                System.out.println("Select Car's Brand that you want to rent : ");
                choice = input.next();
                car.setPick(choice);


                System.out.println("Do you want to add Car's accessory?? : \n1.yes\n2.No");
                choice = input.next();
                CarAccessories acces = new CarAccessories();
                if (choice.equals("1")) {
                    do {
                        acces.getCarAccesMenu();
                        choice = input.next();

                        if (choice.equals("1")) {
                            car = new Exhaust(car);
                        } else if (choice.equals("2")) {
                            car = new Wheels(car);
                        } else if (choice.equals("3")) {
                            car = new Wrap(car);
                        } else if (choice.equals("4")) {
                            break;
                        }
                    } while (true);

                }

                System.out.println("---------------------------------------");
                System.out.println("Enter the number of days you want to rent : ");
                int day = input.nextInt();
                Payment pay = new Payment(day, car.getCost(), customer.getDiscount(), deposit.getdeposit());
                customer.getDescribe();
                System.out.println(
                        "\nCar rental : " + car.getDesp() +
                                "\nDeposit : " + deposit.getdeposit());
                pay.displayPayment();
                System.out.println("---------------------------------------");
            }
            else {
                break;
            }
        }while (true);
    }
    /** error
     * เลขที่เลือกแต่ละคำถาม ถ้ากดเลขที่นอกเหนือจากตัวเลือก หรือ ติดลบ หรือ เป็นตัวอักษร ให้วนกรอกใหม่ บรรทัดที่ 41,53,91
     * หมายเลขโทรศัพท์ ห้ามเกิน 10 ตัว บรรทัดที่ 47
     * อีเมลและที่อยู่ ต้องถูกตามแบบฟอร์มบรรทัดที่ 60-62
     * บรรทัดที่ 73 ควรกรอกเลข 1-4 ถ้าไม่ใช่ให้วนกรอกใหม่
     * บรรทัดที่ 86 ควรกรอกเลข 1-9 ถ้าไม่ใช่ให้วนกรอกใหม่
     * บรรทัดที่ 113 ควรเป็นจำนวนเต็ม ติดลบไม่ได้ ตัวอักษรไม่ได้  ถ้าไม่ใช่ให้วนกรอกใหม่
     */

    }
