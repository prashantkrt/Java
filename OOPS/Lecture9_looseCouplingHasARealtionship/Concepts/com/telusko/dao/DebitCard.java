package OOPS.Lecture9_looseCouplingHasARealtionship.Concepts.com.telusko.dao;

public class DebitCard {
    public DebitCard() {
        System.out.println("Credit card is instantiated");
    }

    public boolean payBill(double amount) {
        System.out.println("Payment is processed through debit card and amount paid is " + amount);
        return true;
    }
}
