package project;

import project.Car.*;
import project.CarAccessory.CarAccessories;
import project.CarAccessory.Exhaust;
import project.CarAccessory.Wheels;
import project.CarAccessory.Wrap;
import project.Customer.Customer;
import project.Customer.Member;
import project.Customer.NonMember;
import project.Rent.Deposit;
import project.Rent.Payment;
import java.util.Vector;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        final String Red = "\u001b[31m";
        final String White="\u001b[0m";
//        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//        Date currentDate = new Date();
//         System.out.println(currentDate);
//        System.out.println("Potter here");
        Scanner input = new Scanner(System.in);
        String choice;
        do {
            System.out.println("---------------------------------------");  
            System.out.println("==== Welcome to car rental program ====");
            System.out.println("1.Go Rent Car");
            System.out.println("2.Exit");
            System.out.println("Select number[1-2] :");
            choice = input.next();

            Vector<Customer> customers = new Vector<>();
            // Input validation for menu selection
            while (!choice.matches("[1-2]")) {
                System.out.println(Red+"Invalid input. Please select a valid option [1-2]: "+White);
                choice = input.next();
            }

            if(choice.equals("1")) {
                System.out.print(" Customer's name :  ");
                String name = input.next();

                while (!name.matches("[a-zA-Z]+")) {
                    System.out.println(Red+"Invalid input. Please enter a valid name: "+White);
                    name = input.next();
                }
            

                System.out.print(" Phone Number  :  ");
                String phone;
                do {
                    System.out.print(" Phone Number (10 digits):  ");
                    phone = input.next();
                    if (phone.length() != 10) {
                        System.out.println(Red+"Invalid phone number. Please enter a 10-digit phone number."+White);
                    }
                } while (phone.length() != 10);

                System.out.println("-------------------------------------------------------------");
                System.out.print(" You aren't a member !!!! Do you want to register as a member??\n" +
                                   "-------------------------------------------------------------\n" +
                        "1.Yes, I want to register a member. \n" +
                        "2.No,I am satisfied with non-member.\n" +
                        "Select number[1,2] : ");
                choice = input.next();

                 // Input validation for membership selection
                 while (!choice.matches("[1-2]")) {
                    System.out.println(Red+"Invalid input. Please select a valid option [1-2]: "+White);
                    choice = input.next();
                }

                Customer customer = null;


                if (choice.equals("1")) {
                    System.out.println("---------------------------------------");
                    System.out.println("==========  Register member =========== ");
                    System.out.print(" Enter email -- Gmail from (@gmail.com) ---:  ");
                    //Input validation for email ignore uppercase and lowercase
                    String email = input.next().toLowerCase();
                    while (!email.matches("[a-zA-Z0-9._%+-]+@gmail.com")) {
                        System.out.println(Red+"Invalid input. Please enter a valid Gmail address: "+White);
                        email = input.next().toLowerCase();
                    }
                    System.out.print(" Enter address  :  ");
                    String address = input.next();
                    customer = new Member(name, phone, email, address);
                    customers.add(customer);


                }   else if (choice.equals("2")) {
                    customer = new NonMember(name, phone);
                    customers.add(customer);


                }

                customer.getDescribe();
                Car car = null;
                customer.getCarTypeMenu();

                boolean validChoice = false;
                while (!validChoice) {
                    choice = input.next();
                // Input validation for choice
                if (choice.matches("[1-4]")) {
                    validChoice = true;
                } else {
                System.out.println(Red+"Invalid input. Please select a valid option [1-4]: "+White);
                }
                }

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
                
                // Input validation for car brand choice
                while (!choice.matches("[1-9]")) {
                    System.out.println(Red+"Invalid input. Please select a valid option [1-9]: "+White);
                    choice = input.next();
                }
                car.setPick(choice);

                System.out.println("Do you want to add Car's accessory?? : \n1. Yes\n2. No");
                choice = input.next();
                
                // Input validation for choice of adding car accessories
                while (!choice.matches("[1-2]")) {
                    System.out.println(Red+"Invalid input. Please select a valid option [1-2]: "+White);
                    choice = input.next();
                }
                
                CarAccessories acces = new CarAccessories();
                if (choice.equals("1")) {
                    do {
                        acces.getCarAccesMenu();
                        choice = input.next();
                
                        // Input validation for accessory choice
                        while (!choice.matches("[1-4]")) {
                            System.out.println(Red+"Invalid input. Please select a valid option [1-4]: "+White);
                            choice = input.next();
                        }
                
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

                // Input validation for rent day
                int day;
                boolean validDuration = false;
                do {
                    while (!input.hasNextInt()) {
                        System.out.println(Red+"Invalid input. Please enter a valid number of days: "+White);
                        input.next();
                    }
                    day = input.nextInt();
                    if (day > 0) {
                        validDuration = true;
                    } else {
                        System.out.println(Red+"Invalid input. Please enter a positive number of days: "+White);
                    }
                } while (!validDuration);
                Payment pay = new Payment(day, car.getCost(), customer.getDiscount(), deposit.getdeposit());
                customer.getDescribe();

                pay.displayPayment();
                System.out.println("---------------------------------------");
                Receipt receipt = new Receipt(customer.customerDescribe(), pay.getDisplayPayment(),car.getDesp(),deposit.getdeposit(),customer.getName());
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
     * บรรทัดที่ 73 ควรกรอกเลข 1-4 ถ้าไม่ใช่ให้วนกรอกใหม่ /
     * บรรทัดที่ 86 ควรกรอกเลข 1-9 ถ้าไม่ใช่ให้วนกรอกใหม่ /
     * บรรทัดที่ 113 ควรเป็นจำนวนเต็ม ติดลบไม่ได้ ตัวอักษรไม่ได้  ถ้าไม่ใช่ให้วนกรอกใหม่ /
     */

    }
