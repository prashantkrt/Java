package OOPS.Lecture9_looseCouplingHasARealtionship.Loosecoupling.com.telusko.dao;

import OOPS.Lecture9_looseCouplingHasARealtionship.Loosecoupling.com.telusko.service.IPay;

public class DebitCard implements IPay {
    public DebitCard() {
        System.out.println("Debit card is instantiated");
    }

    public boolean payBill(double amount) {
        System.out.println("Payment is processed through debit card and amount paid is " + amount);
        return true;
    }
}
