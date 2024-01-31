package multithreading.Threads1;

import java.util.Scanner;
//Using thread class
class Alpha2 extends Thread {
    public void run() {
        System.out.println("Banking Activity started..!!!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the account number");
        int accNo = sc.nextInt();
        System.out.println("Please enter the password");
        int password = sc.nextInt();
        System.out.println("Login success..!!");
        System.out.println("Banking Activity ended..!!!");
    }
}

class Beta2 extends Thread {
    public void run() {
        System.out.println("Printing number application started...!!!");
        for (int i = 0; i < 5; i++) {
            System.out.println("The new generated number is " + i);
        }
        System.out.println("Printing number application ended...!!!");
    }
}

class Gamma2 extends Thread {
    public void run() {
        System.out.println("displaying important message activity started...!!!");
        for (int i = 0; i < 4; i++) {
            System.out.println("Focus is the key");
        }
        System.out.println("displaying important message activity ended...!!!");
    }
}

public class LaunchApp5 {
    public static void main(String[] args) {
        Alpha2 a = new Alpha2();
        Beta2 b = new Beta2();
        Gamma2 g = new Gamma2();

        a.start();
        b.start();
        g.start();
    }
}
