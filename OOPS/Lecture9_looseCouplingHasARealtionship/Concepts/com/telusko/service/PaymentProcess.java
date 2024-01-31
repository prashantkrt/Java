package OOPS.Lecture9_looseCouplingHasARealtionship.Concepts.com.telusko.service;
import OOPS.Lecture9_looseCouplingHasARealtionship.Concepts.com.telusko.dao.CreditCard;
import OOPS.Lecture9_looseCouplingHasARealtionship.Concepts.com.telusko.dao.DebitCard;
import OOPS.Lecture9_looseCouplingHasARealtionship.Concepts.com.telusko.dao.QRCode;

public class PaymentProcess {
    public boolean doPayment(double amount) {
        DebitCard db = new DebitCard();
        db.payBill(amount);
        CreditCard cc = new CreditCard();
        cc.payBill(amount);
        QRCode qr = new QRCode();
        qr.payBill(amount);
        return true;
    }
}
