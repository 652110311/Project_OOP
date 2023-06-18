package project.Mala;

import java.util.ArrayList;
import java.util.Scanner;

// คลาสเมนูอาหาร
class FoodMenu {
    private String itemName;
    private double price;

    public FoodMenu(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }
}

// คลาสรายการสั่งซื้อ
class Order {
    private FoodMenu item;
    private int quantity;

    public Order(FoodMenu item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public FoodMenu getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return item.getPrice() * quantity;
    }
}

// คลาสลูกค้า
class Customer {
    private String name;
    private String phoneNumber;

    public Customer(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

// คลาสร้านหม่าล่า
// คลาส NoodleShop (อัปเดต)
class NoodleShop {
    private ArrayList<FoodMenu> menu;
    private ArrayList<Order> orders;

    public NoodleShop() {
        menu = new ArrayList<>();
        orders = new ArrayList<>();
    }
    public ArrayList<FoodMenu> getMenu() {
        return menu;
    }

    public void addMenu(FoodMenu item) {
        menu.add(item);
    }

    public void placeOrder(Customer customer, FoodMenu item, int quantity) {
        Order order = new Order(item, quantity);
        orders.add(order);
        System.out.println("Order placed by " + customer.getName() + ": " + item.getItemName() + " x " + quantity);
    }

    public void printMenu() {
        System.out.println("----- Menu -----");
        for (int i = 0; i < menu.size(); i++) {
            FoodMenu item = menu.get(i);
            System.out.println((i + 1) + ". " + item.getItemName() + " - $" + item.getPrice());
        }
    }

    public void printOrders() {
        System.out.println("----- Orders -----");
        for (Order order : orders) {
            System.out.println(order.getItem().getItemName() + " x " + order.getQuantity() + " = " + order.getTotalPrice());
        }
    }
}



// ตัวอย่างการใช้งาน
public class MalaTest {
    // เมธอด main() (อัปเดต)
    public static void main(String[] args) {
        NoodleShop noodleShop = new NoodleShop();

        // เพิ่มรายการอาหารในเมนู
        FoodMenu item1 = new FoodMenu("หม่าเกี้ยว", 50.0);
        FoodMenu item2 = new FoodMenu("หม่าแกงเขียวหวาน", 60.0);
        noodleShop.addMenu(item1);
        noodleShop.addMenu(item2);

        // แสดงเมนูอาหาร
        noodleShop.printMenu();

        // สั่งอาหาร
        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer("John", "0812345678");

        System.out.print("กรุณาเลือกหมายเลขรายการที่ต้องการสั่งอาหาร: ");
        int menuChoice = scanner.nextInt();

        System.out.print("กรุณาระบุจำนวนที่ต้องการสั่ง: ");
        int quantity = scanner.nextInt();

        FoodMenu chosenItem = noodleShop.getMenu().get(menuChoice - 1);
        noodleShop.placeOrder(customer, chosenItem, quantity);

        // พิมพ์รายการสั่งซื้อทั้งหมด
        noodleShop.printOrders();
    }

}
