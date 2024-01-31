package multithreading.Threads2;

import java.util.Scanner;

class Calc1 extends Thread {
    @Override
    public void run() {
        System.out.println("Calculation task started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Kindly enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Kindly enter the second number");
        int num2 = sc.nextInt();
        int res = num1 + num2;
        System.out.println("Result " + res);
        System.out.println("Task is completed");
    }
}

class Message1 extends Thread {
    @Override
    public void run() {
        System.out.println("Displaying important message started");
        for (int i = 0; i < 4; i++) {
            System.out.println("Focus is important to master the skills ");
        }
        System.out.println("Displaying important message ended");
    }
}

public class LaunchApp7 {
    public static void main(String[] args) {
        Calc1 c = new Calc1();
        Message1 m = new Message1();
        c.run();
        m.run();
        /*
        * The application will behave like single threaded programming
        * */
    }
}
