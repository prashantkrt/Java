package OOPS.Projects.Project4.service;

public class PaymentProcess {
    private IPay pay;

//    PaymentProcess(IPay pay) {
//        this.pay = pay;
//    }

    public void setPay(IPay pay) {
        this.pay = pay;
    }

    public void doPayment(double amount) {
        boolean status = pay.payBill(amount);
        if (status) {
            System.out.println("Payment success");
        } else System.out.println("Payment failed");
    }
}
