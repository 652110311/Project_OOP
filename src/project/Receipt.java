package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class Receipt {
    public Receipt(String customer,String paymentInformation,String car,double deposit,String name) throws FileNotFoundException {
        //output file name
        String encryptedFile = "C:\\Users\\CAMT\\Desktop\\Project_oop_car_rent\\src\\project\\receipt_"+name+".txt";
        // open output file
        File outputFile = new File(encryptedFile);
        PrintWriter output = new PrintWriter(outputFile);
        if (!outputFile.exists()) {
            System.out.println("Error: cannot open " + encryptedFile);
            System.exit(0);
        }
        output.println("-----------------------------------");
        output.println(customer);
        output.println("-----------------------------------");
        output.println(
                "\nCar rental : " + car + "\nDeposit : " + deposit);
        output.println(paymentInformation);
        output.println("-----------------------------------");

        output.close();

    }
    }





