public class Payment {
    private int day;
    private double costPerDay;
    private double totalPayment;

    public Payment(int day, double costPerDay) {
        this.day = day;
        this.costPerDay = costPerDay;
        this.totalPayment = day * costPerDay;
    }

    public void displayPayment() {
        System.out.println("Total Payment: $" + totalPayment);
    }
}




