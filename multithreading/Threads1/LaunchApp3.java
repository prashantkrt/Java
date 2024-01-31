package multithreading.Threads1;
import java.util.Scanner;

class Alpha {
    public void banking() {
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

class Beta {
    public void printingNumber() {
        System.out.println("Printing number application started...!!!");
        for (int i = 0; i < 5; i++) {
            System.out.println("The new generated number is " + i);
        }
        System.out.println("Printing number application ended...!!!");
    }
}

class Gamma {
    public void printingMessage() {
        System.out.println("displaying important message activity started...!!!");
        for (int i = 0; i < 4; i++) {
            System.out.println("Focus is the key");
        }
        System.out.println("displaying important message activity ended...!!!");
    }
}

public class LaunchApp3 {
    public static void main(String[] args) {
        Alpha a= new Alpha();
        Beta b = new Beta();
        Gamma g = new Gamma();

        a.banking();
        b.printingNumber();
        g.printingMessage();
    }
}
