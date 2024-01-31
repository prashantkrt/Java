package OOPS.Lecture9_looseCouplingHasARealtionship.Loosecoupling.com.telusko.dao;
import OOPS.Lecture9_looseCouplingHasARealtionship.Loosecoupling.com.telusko.service.IPay;

public class CreditCard implements IPay {
    public CreditCard() {
        System.out.println("Credit card is instantiated");
    }

    public boolean payBill(double amount) {
        System.out.println("Payment is processed through Credit card and amount paid is " + amount);
        return true;
    }
}
