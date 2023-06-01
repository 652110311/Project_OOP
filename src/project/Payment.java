package project;

public class Payment {
    private int day;
    private double costPerDay;
    private double totalPayment;
    private double totalDiscount;
    private double pay;
    private double discount;

    public Payment(int day, double costPerDay,double discount) {
        this.day = day;
        this.costPerDay = costPerDay;
        this.discount = discount;
        this.pay =   day * costPerDay;
        this.totalDiscount = (day * costPerDay)*discount;
        totalPayment=pay-totalDiscount;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public double getDiscount() {
        return discount*100;
    }

    public double getPay() {
        return pay;
    }

    public double getTotalDiscount() {
        return totalDiscount;
    }

    public void displayPayment() {
        System.out.println("Rent : "+day +" day"+ "\nCost per Day : "+costPerDay +" baht"+ "\nPayment : "+pay+"\nTotal discount  "+getDiscount()+"% : "+getTotalDiscount()+" baht"+"\nTotal payment : "+getTotalPayment());
    }
}




