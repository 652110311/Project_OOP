package project.Customer;
public class NonMember extends Customer {
    private String status;

    public NonMember(String name, String phone) {
        super(name, phone);
        this.status = "Non-member";
    }

    public String getStatus() {
        return this.status;
    }

    public double getDiscount() {
        return 0.0;
    }
}