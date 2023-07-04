package project.PotterTest;

import project.Car.*;
import project.CarAccessory.CarAccessories;
import project.CarAccessory.Exhaust;
import project.CarAccessory.Wheels;
import project.CarAccessory.Wrap;
import project.Customer.Customer;
import project.Customer.Member;
import project.Customer.NonMember;
import project.Mala.*;
import project.Rent.Deposit;
import project.Rent.Payment;

import java.util.Calendar;
import java.util.Scanner;
import java.util.Vector;


public class MainPotter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//        Date currentDate = new Date();
//         System.out.println(currentDate);
//        System.out.println("Potter here");
        // Create a Calendar instance
        Calendar calendar = Calendar.getInstance();

        // Set the date to the current date
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int dayy = 1; // Start from day 1

        // Set the calendar to the desired month
        calendar.set(year, month, dayy);

        // Get the number of days in the month
        int numDays = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        // Get the day of the week of the first day in the month
        int startDay = calendar.get(Calendar.DAY_OF_WEEK);

        // Print the calendar header
        System.out.println("  S  M  T  W  T  F  S");

        // Print leading spaces
        for (int i = 1; i < startDay; i++) {
            System.out.print("   ");
        }

        // Print the days of the month
        for (int i = 1; i <= numDays; i++) {
            System.out.printf("%3d", i);

            // Start a new line after Saturdays
            if (startDay == Calendar.SATURDAY && i < numDays) {
                System.out.println();

            }

            // Increment the day
            calendar.add(Calendar.DAY_OF_MONTH, 1);
            startDay = calendar.get(Calendar.DAY_OF_WEEK);
        }

        final String Red = "\u001b[31m";
        final String White="\u001b[0m";
        int pig=100;
        int chicken=100;
        int dolly_fish=100;
        int beef=100;
        int corn = 100;
        int broccoli=100;


        Vector<Member> members = new Vector<>();


        System.out.println();
        String choice;
        do {
            System.out.println("---------------------------------------");
            System.out.println("==== Welcome to car rental program ====");
            System.out.println("1. Go to Rent Car");
            System.out.println("2. Go to Mala Store");
            System.out.println("3. No thanks");

            System.out.println("Select number[1-3] :");
            choice = input.next();

            // Input validation for menu selection
            while (!choice.matches("[1-3]")) {
                System.out.println("Invalid input. Please select a valid option [1-3]: ");
                choice = input.next();
            }

            if(choice.equals("1")) {
                System.out.print(" Customer's name :  ");
                String name = input.next();

                while (!name.matches("[a-zA-Z]+")) {
                    System.out.println("Invalid input. Please enter a valid name: ");
                    name = input.next();
                }


                System.out.print(" Phone Number  :  ");
                String phone;
                do {
                    System.out.print(" Phone Number (10 digits):  ");
                    phone = input.next();
                    if (phone.length() != 10) {
                        System.out.println("Invalid phone number. Please enter a 10-digit phone number.");
                    }
                } while (phone.length() != 10);

                System.out.print(" You aren't a member !! Do you want to register as a member??\n" +
                        "" +
                        "1.Yes, I want to register a member. \n" +
                        "2.No,I am satisfied with non-member.\n" +
                        "Select number[1,2] : ");
                choice = input.next();

                // Input validation for membership selection
                while (!choice.matches("[1-2]")) {
                    System.out.println("Invalid input. Please select a valid option [1-2]: ");
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
                        System.out.println("Invalid input. Please enter a valid Gmail address: ");
                        email = input.next().toLowerCase();
                    }
                    System.out.print(" Enter address  :  ");
                    String address = input.next();
                    customer = new Member(name, phone, email, address);

                    //Test Vector


                    System.out.println("Registered Members:");
                    for (Member member : members) {
                        System.out.println("Name: " + member.getName());
                        System.out.println("Phone: " + member.getPhone());
                        System.out.println("Email: " + member.getCustomerEmail());
                        System.out.println("Address: " + member.getCustomerAddress());
                        System.out.println("--------------------");
                    }




                }
                else if (choice.equals("2")) {
                    customer = new NonMember(name, phone);

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
                        System.out.println("Invalid input. Please select a valid option [1-4]: ");
                    }
                }


                Deposit deposit = new Deposit(choice);
                switch (choice) {
                    case "1" -> car = new HiendCar();
                    case "2" -> car = new PickupTruck();
                    case "3" -> car = new NormalCar();
                    case "4" -> car = new EVCar();
                }

                System.out.println("Select Car's Brand that you want to rent : ");
                choice = input.next();


                // Input validation for car brand choice
                while (!choice.matches("[1-9]")) {
                    System.out.println("Invalid input. Please select a valid option [1-9]: ");
                    choice = input.next();
                }
                car.setPick(choice);



                System.out.println("Do you want to add Car's accessory?? : \n1. Yes\n2. No");
                choice = input.next();

                // Input validation for choice of adding car accessories
                while (!choice.matches("[1-2]")) {
                    System.out.println("Invalid input. Please select a valid option [1-2]: ");
                    choice = input.next();
                }

                CarAccessories acces = new CarAccessories();
                if (choice.equals("1")) {
                    label:
                    do {
                        acces.getCarAccesMenu();
                        choice = input.next();

                        // Input validation for accessory choice
                        while (!choice.matches("[1-4]")) {
                            System.out.println("Invalid input. Please select a valid option [1-4]: ");
                            choice = input.next();
                        }

                        switch (choice) {
                            case "1":
                                car = new Exhaust(car);
                                break;
                            case "2":
                                car = new Wheels(car);
                                break;
                            case "3":
                                car = new Wrap(car);
                                break;
                            case "4":
                                break label;
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
                        System.out.println("Invalid input. Please enter a valid number of days: ");
                        input.next();
                    }
                    day = input.nextInt();
                    if (day > 0) {
                        validDuration = true;
                    } else {
                        System.out.println("Invalid input. Please enter a positive number of days: ");
                    }
                } while (!validDuration);
                Payment pay = new Payment(day, car.getCost(), customer.getDiscount(), deposit.getdeposit());
                customer.getDescribe();
                System.out.println(
                        "\nCar rental : " + car.getDesp() +
                                "\nDeposit : " + deposit.getdeposit());
                pay.displayPayment();
                System.out.println("---------------------------------------");


            }
            else if(choice.equals("2")){
                Mala mala = null;
                    //make in oop concept
                while (true){
                    System.out.println("What do you want to eat?\n" +
                            "Everything are 5 Bath per 1 piece\n" +
                            "1.Chicken            "+Red+chicken+" pieces"+White+"    5 Bath"+"\n" +
                            "2.Pig                "+Red+pig+" pieces"+White+"     5 Bath"+"\n" +
                            "3.Dolly fish         "+Red+dolly_fish+" pieces"+White+"     5 Bath"+"\n" +
                            "4.Beef               "+Red+beef+" pieces"+White+"     5 Bath"+"\n" +
                            "5.Corn               "+Red+corn+" pieces"+White+"     5 Bath"+"\n" +
                            "6.Broccoli           "+Red+broccoli+" pieces"+White+"     5 Bath"+"\n" +
                            "7.That's it");
                    System.out.println("Pick number[1-7]");


                    int pick = input.nextInt();
                    if (pick==1) {
                        mala = new Chicken();
                    }
                    else if(pick==2){
                        mala = new Chicken();
                    }
                    else if(pick==3){
                        mala = new Dollyfish();
                    }
                    else if (pick==4){
                        mala = new Beef();
                    }
                    else if(pick ==5){
                        mala = new Corn();
                    }
                    else if(pick==6){
                        mala = new Broccoli();
                    }

                    if(pick==7) break;
                    System.out.println("How many piece you want");
                    int amountpiece = input.nextInt();


                    System.out.println(mala.calculate(amountpiece));

                }
                System.out.println(mala.getTotalprice());

            }
            else{
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

