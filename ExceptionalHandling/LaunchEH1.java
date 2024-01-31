package ExceptionalHandling;

import java.util.Scanner;
/*
* Exceptions occur during runtime
* It leads to abnormal termination of the application during runtime
* */
public class LaunchEH1 {
    public static void main(String[] args) {
        System.out.println("Welcome to my app!!!");
        Scanner sc = new Scanner(System.in);

        System.out.println("Kindly enter numerator number to divide");
        int num1 = sc.nextInt();
        System.out.println("Kindly enter denominator number to divide");
        int num2 = sc.nextInt();

        int res = 0;
        try { // risky code
            res = num1 / num2;
        } catch (ArithmeticException e) { // handler of exception
            System.out.println("Please give non zero denominator");
        }
        System.out.println("The res is " + res);
        System.out.println("Thank you for using my app!!");
    }
}
