package ExceptionalHandling.class3;

import java.util.Scanner;

/*
 * matter cannot be propagated to caller method if you use simply if else instead of exception handling
 * */
class Atm {

    // user will enter
    int acNo;
    int pw;

    //assume in database
    private int acc_num = 1111;
    private int password = 2222;

    public void acceptInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kindly enter your account number ");
        acNo = sc.nextInt();
        System.out.println("Kindly enter your account password ");
        pw = sc.nextInt();
    }

    public void verify() {
        if (acc_num == acNo && password == pw) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Kindly enter the amount to withdrawal");
            int amount = sc.nextInt();
            System.out.println("collect your cash " + amount);
            System.out.println("Thank-you for using our atm service . Have a good day ahead!!");
        } else {
            System.out.println("Invalid userName and Password");
            System.out.println("Are you sure this is your card ? want to try again!!!");
            acceptInput();//there is no centralized way it will keep calling the input until correct input given
            /*
            * sometimes it's not the handling the matter for just one time at that point
            * sometimes matter we need to propagate it to upper hierarchy
            * decision-making hierarchy
            *  */
        }
    }

}

class Bank {
    public void initiate() {
        System.out.println("Welcome to HeroHeralal Bank");
        Atm atm = new Atm();
        atm.acceptInput();
        atm.verify();
    }
}

public class LaunchEH11 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.initiate();
    }
}

