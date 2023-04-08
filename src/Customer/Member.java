package Customer;
public class Member extends Customer {
    private double discount;
    private String status;
    private String customerEmail;
    private String customerAddress;
    private String customername;
    private String customerphone;

    public Member(String name, String phone, String email, String address) {
        super(name, phone, email, address);
        this.discount = 0.1;
        this.status = "Member";
        this.customerEmail = email;
        this.customerAddress = address;
    }

    @Override
    public String getName() {
        return this.customername;
    }

    @Override
    public String getPhone() {
        return this.customerphone;
    }

    public double getDiscount() {
        return this.discount;
    }

    public String getStatus() {
        return this.status;
    }

    public String getCustomerEmail() {
        return this.customerEmail;
    }

    public String getCustomerAddress() {
        return this.customerAddress;
    }
}