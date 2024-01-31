package OOPS.Lecture9_looseCouplingHasARealtionship.Loosecoupling.com.telusko.main;
import OOPS.Lecture9_looseCouplingHasARealtionship.Loosecoupling.com.telusko.dao.DebitCard;
import OOPS.Lecture9_looseCouplingHasARealtionship.Loosecoupling.com.telusko.service.PaymentProcess;

public class LaunchApp {
    public static void main(String[] args) {
        PaymentProcess pp = new PaymentProcess();
        pp.setPay(new DebitCard());
        pp.doPayment(120);
    }
}
