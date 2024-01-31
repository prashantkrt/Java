package OOPS.Lecture9_looseCouplingHasARealtionship.Concepts.com.telusko.dao;

public class QRCode {
    public QRCode() {
        System.out.println("Credit card is instantiated");
    }

    public boolean payBill(double amount) {
        System.out.println("Payment is processed through UPI and amount paid is " + amount);
        return true;
    }
}
