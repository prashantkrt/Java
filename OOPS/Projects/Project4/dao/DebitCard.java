package OOPS.Projects.Project4.dao;

import OOPS.Projects.Project4.service.IPay;

public class DebitCard implements IPay {
    public DebitCard() {
        System.out.println("Credit card is instantiated");
    }

    public boolean payBill(double amount) {
        System.out.println("Payment is processed through debit card and amount paid is " + amount);
        return true;
    }
}
