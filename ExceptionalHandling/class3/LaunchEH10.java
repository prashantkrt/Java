package ExceptionalHandling.class3;
import java.util.Scanner;

public class LaunchEH10 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome to my app!!!");
            sc = new Scanner(System.in);
            System.out.println("Kindly enter numerator number to divide");
            int num1 = sc.nextInt();
            System.out.println("Kindly enter denominator number to divide");
            int num2 = sc.nextInt();
            int res = 0;
            res = num1 / num2;
            System.out.println("The result " + res);
        } catch (ArithmeticException e) {
            System.out.println("Exception handled in alpha itself");
            System.out.println(e);
            System.out.println("getMessage() " + e.getMessage()); //is used to get a detailed message
            System.out.println("toString() " + e.toString()); // printing the exception
        }
    }
}

