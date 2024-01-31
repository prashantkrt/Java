package multithreading.Threads1;

import java.util.Scanner;

public class LaunchApp1 {
    public static void main(String[] args) {
        System.out.println("Banking Activity started..!!!");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the account number");
        int accNo = sc.nextInt();
        System.out.println("Please enter the password");
        int password = sc.nextInt();

        System.out.println("Login success..!!");
        System.out.println("Banking Activity ended..!!!");

        System.out.println("**********************************************");

        System.out.println("Printing number application started...!!!");

        for (int i = 0; i < 5; i++) {
            System.out.println("The new generated number is " + i);
        }

        System.out.println("Printing number application ended...!!!");

        System.out.println("**********************************************");

        System.out.println("displaying important message activity started...!!!");

        for (int i = 0; i < 4; i++) {
            System.out.println("Focus is the key");
        }
        System.out.println("displaying important message activity ended...!!!");

    }
}
