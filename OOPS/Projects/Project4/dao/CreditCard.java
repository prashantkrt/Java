package OOPS.Projects.Project4.dao;
import OOPS.Projects.Project4.service.IPay;

public class CreditCard implements IPay {
    public CreditCard() {
        System.out.println("Credit card is instantiated");
    }

    public boolean payBill(double amount) {
        System.out.println("Payment is processed through Credit card and amount paid is " + amount);
        return true;
    }
}
