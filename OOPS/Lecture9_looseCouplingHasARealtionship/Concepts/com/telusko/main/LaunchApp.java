package OOPS.Lecture9_looseCouplingHasARealtionship.Concepts.com.telusko.main;

import OOPS.Lecture9_looseCouplingHasARealtionship.Concepts.com.telusko.service.PaymentProcess;

public class LaunchApp {
    public static void main(String[] args) {
        PaymentProcess pp = new PaymentProcess();
        pp.doPayment(120);
    }
}
