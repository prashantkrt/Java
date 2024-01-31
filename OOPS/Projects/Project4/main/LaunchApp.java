package OOPS.Projects.Project4.main;

import OOPS.Projects.Project4.dao.CreditCard;
import OOPS.Projects.Project4.dao.DebitCard;
import OOPS.Projects.Project4.dao.QRCode;
import OOPS.Projects.Project4.service.PaymentProcess;

import java.util.Scanner;

public class LaunchApp {
    public static void main(String[] args) {
        PaymentProcess pp = new PaymentProcess();
        System.out.println("Welcome to the fuel station..Kindly choose the payment process");
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the options");
        System.out.println("Option 1 : Credit Card");
        System.out.println("Option 2 : Debit Card");
        System.out.println("Option 3 : UPI/QR Code");
        int choice = sc.nextInt();
        System.out.println("Enter the amount");
        double amount = sc.nextDouble();

        //enhanced switch
        switch (choice) {
            case 1 -> {
                //setter injection
                pp.setPay(new CreditCard());
                pp.doPayment(amount);
                //constructor Injection
                //PaymentProcess pp = new PaymentProcess(new DebitCard());
            }
            case 2 -> {
                pp.setPay(new DebitCard());
                pp.doPayment(amount);
            }
            case 3 -> {
                pp.setPay(new QRCode());
                pp.doPayment(amount);
            }
            default -> {
                System.out.println("Invalid payment method");
                pp.doPayment(amount);
            }
        }
    }
}
