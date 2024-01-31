package multithreading.Threads1;

import java.util.Scanner;

//Using runnable interface
class Alpha1 implements Runnable {
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

class Beta1 implements Runnable {
    public void run() {
        System.out.println("Printing number application started...!!!");
        for (int i = 0; i < 5; i++) {
            System.out.println("The new generated number is " + i);
        }
        System.out.println("Printing number application ended...!!!");
    }
}

class Gamma1 implements Runnable {
    public void run() {
        System.out.println("displaying important message activity started...!!!");
        for (int i = 0; i < 4; i++) {
            System.out.println("Focus is the key");
        }
        System.out.println("displaying important message activity ended...!!!");
    }
}

public class LaunchApp4 {
    public static void main(String[] args) {
        Alpha1 a = new Alpha1();
        Beta1 b = new Beta1();
        Gamma1 g = new Gamma1();

        //thread scheduler the boss :-)
        Thread thread1 = new Thread(a);  // Using the constructor Thread(Runnable r)
        Thread thread2 = new Thread(b);  // Using the constructor Thread(Runnable r)
        Thread thread3 = new Thread(g);  // Using the constructor Thread(Runnable r)

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
