package Customer;
public class NonMember extends Customer {
    private String status;
    private String customername;
    private String customerphone;

    public NonMember(String name, String phone) {
        super(name, phone);
        this.status = "Non-member";
    }

    public String getName() {
        return this.customername;
    }

    @Override
    public String getPhone() {
        return this.customerphone;
    }

    public String getStatus() {
        return this.status;
    }

    public double getDiscount() {
        return 0.0;
    }
}