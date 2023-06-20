package project.Rent;

public class Deposit {
    private String choice;
    double price;

    public Deposit(String choice){
        this.choice=choice;
    }

    public double getdeposit(){

        if (choice.equals("1")) {
            price=500;
        } else if (choice.equals("2")) {
            price= 5000;
        }
        else if (choice.equals("3")) {
            price= 1000;
        }
        else  {
            price=700;
        }
        return price;
    }
}




