package multithreading.Threads2;

import java.util.Scanner;

class Calc2 extends Thread {
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

class Message2 extends Thread {
    @Override
    public void run() {
        System.out.println("Displaying important message started");
        for (int i = 0; i < 4; i++) {
            System.out.println("Focus is important to master the skills ");
        }
        System.out.println("Displaying important message ended");
    }
}

public class LaunchApp8 {
    public static void main(String[] args) {
        System.out.println("Main thread started");
        Calc2 c = new Calc2();
        Message2 m = new Message2();
        System.out.println(c.isAlive()); //false
        System.out.println(m.isAlive()); //false
        c.start();
        System.out.println(c.isAlive()); //true
        System.out.println(m.isAlive()); //false
        m.start();
        System.out.println(c.isAlive()); //true
        System.out.println(m.isAlive()); //true
        System.out.println("Main thread ended");
        // if threads completes it task then also it will .isAlive method will give false
    }
}
