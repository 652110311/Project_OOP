package project.PotterTest;

import java.util.Scanner;
import java.util.Vector;

class CarTest {
    private String brand;
    private String model;
    private int year;
    private boolean available;

    public CarTest(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.available = true;
    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return available;
    }

    public void rent() {
        available = false;
    }

    public void returnCar() {
        available = true;
    }

    // Car class implementation (same as before)
}

class MemberTest {
    private String name;
    private String phoneNumber;
    private boolean active;

    public MemberTest(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.active = true;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}

public class CarRentalSystem {
    public static void main(String[] args) {
        CarTest[] cars = {
                new CarTest("Toyota", "Camry", 2020),
                new CarTest("Honda", "Civic", 2019),
                new CarTest("Ford", "Mustang", 2021)
        };

        Vector<MemberTest> members = new Vector<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Car Rental System");
            System.out.println("------------------");
            System.out.println("1. View available cars");
            System.out.println("2. Rent a car");
            System.out.println("3. Return a car");
            System.out.println("4. Add a member");
            System.out.println("5. Activate member");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Available Cars:");
                    displayAvailableCars(cars);
                    break;
                case 2:
                    System.out.print("Enter the index of the car you want to rent: ");
                    int rentIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    if (rentIndex >= 0 && rentIndex < cars.length) {
                        CarTest selectedCar = cars[rentIndex];
                        if (selectedCar.isAvailable()) {
                            selectedCar.rent();
                            System.out.println("You have rented the " + selectedCar.getBrand() +
                                    " " + selectedCar.getModel() + ".");
                        } else {
                            System.out.println("Sorry, the selected car is not available for rent.");
                        }
                    } else {
                        System.out.println("Invalid car index.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the index of the car you want to return: ");
                    int returnIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    if (returnIndex >= 0 && returnIndex < cars.length) {
                        CarTest selectedCar = cars[returnIndex];
                        if (!selectedCar.isAvailable()) {
                            selectedCar.returnCar();
                            System.out.println("You have returned the " + selectedCar.getBrand() +
                                    " " + selectedCar.getModel() + ".");
                        } else {
                            System.out.println("This car is already available.");
                        }
                    } else {
                        System.out.println("Invalid car index.");
                    }
                    break;

                case 4:
                    System.out.print("Enter the member's name: ");
                    String memberName = scanner.nextLine();
                    System.out.print("Enter the member's phone number: ");
                    String phoneNumber = scanner.nextLine();

                    MemberTest member = new MemberTest(memberName, phoneNumber);
                    members.add(member);
                    System.out.println("Member " + memberName + " has been added.");
                    break;
                case 5:
                    System.out.print("Enter the member's name: ");
                    String activateName = scanner.nextLine();

                    MemberTest activateMember = findMemberByName(members, activateName);
                    if (activateMember != null) {
                        activateMember.setActive(true);
                        System.out.println("Member " + activateName + " has been activated.");
                    } else {
                        System.out.println("Member not found.");
                    }
                    break;
                case 6:
                    System.out.println("Thank you for using the Car Rental System. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println(); // Print a blank line for readability
        }
    }

    private static void displayAvailableCars(CarTest[] cars) {

        for (int i = 0; i < cars.length; i++) {
            if (cars[i].isAvailable()) {
                System.out.println(i + ". " + cars[i].getBrand());
            }
        }
    }

    private static MemberTest findMemberByName(Vector<MemberTest> members, String name) {
        for (MemberTest member : members) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }
}
