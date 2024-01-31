package OOPS.Lecture9_looseCouplingHasARealtionship.Concepts.com.telusko.dao;

public class CreditCard {
    public CreditCard() {
        System.out.println("Credit card is instantiated");
    }

    public boolean payBill(double amount) {
        System.out.println("Payment is processed through Credit card and amount paid is " + amount);
        return true;
    }
}
