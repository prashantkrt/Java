package OOPS.Projects.Project4.dao;

import OOPS.Projects.Project4.service.IPay;

public class QRCode implements IPay {
    public QRCode() {
        System.out.println("Credit card is instantiated");
    }

    public boolean payBill(double amount) {
        System.out.println("Payment is processed through UPI and amount paid is " + amount);
        return true;
    }
}
