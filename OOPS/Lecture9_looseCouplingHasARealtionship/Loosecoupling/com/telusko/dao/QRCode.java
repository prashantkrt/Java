package OOPS.Lecture9_looseCouplingHasARealtionship.Loosecoupling.com.telusko.dao;

import OOPS.Lecture9_looseCouplingHasARealtionship.Loosecoupling.com.telusko.service.IPay;

public class QRCode implements IPay {
    public QRCode() {
        System.out.println("UPI pay is instantiated");
    }

    public boolean payBill(double amount) {
        System.out.println("Payment is processed through UPI and amount paid is " + amount);
        return true;
    }
}
