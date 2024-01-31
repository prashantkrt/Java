package OOPS.Lecture9_looseCouplingHasARealtionship.Loosecoupling.com.telusko.service;


public class PaymentProcess {
    private IPay pay;

    public void setPay(IPay pay) {
        this.pay = pay;
    }

    public boolean doPayment(double amount) {
        boolean status = pay.payBill(amount);
        if (status) {
            System.out.println("payment success :)");
        } else
            System.out.println("payment failed :(");
        return status;
    }
}
