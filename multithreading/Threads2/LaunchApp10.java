package multithreading.Threads2;

import java.util.Scanner;

class Alien implements Runnable {
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        int priority = Thread.currentThread().getPriority();
        System.out.println(priority);
        System.out.println();
        if (threadName.equals("calc")) {
            calc();
        } else {
            message();
        }
    }

    public void calc() {
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

    public void message() {
        System.out.println("Displaying important message started");
        for (int i = 0; i < 4; i++) {
            System.out.println("Focus is important to master the skills ");
        }
        System.out.println("Displaying important message ended");
    }
}

public class LaunchApp10 {
    public static void main(String[] args) throws InterruptedException {
        Alien al = new Alien();
        Thread t1 = new Thread(al);
        Thread t2 = new Thread(al);
        t1.setName("calc");
        t1.setPriority(7);
        t2.setName("message");
        t2.setPriority(3);
        t1.start();
        Thread.sleep(5000);
        t2.start();
    }
}
