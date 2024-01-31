package ExceptionalHandling.class2;

import java.util.Scanner;

class Demo {
    Scanner sc = null;

    public void alpha() {
        System.out.println("Welcome to my app!!!");
        sc = new Scanner(System.in);
        System.out.println("Kindly enter numerator number to divide");
        int num1 = sc.nextInt();
        System.out.println("Kindly enter denominator number to divide");
        int num2 = sc.nextInt();
        int res = 0;
        res = num1 / num2;
        System.out.println("The result " + res);
        System.out.println("Thank-you for using my app!!");
    }
}

public class LaunchEH5 {
    public static void main(String[] args) {
        Demo d = new Demo();
        try {
            System.out.println("Connection established");
            d.alpha();
        } catch (ArithmeticException e) {
            System.out.println("connection terminated");
            System.out.println("Exception is caught in main method");
        }
    }
}


/*
 * Handle the exception:- Using try-catch
 * Duck the exception:- throws
 * Re-throw exception :- try-catch, throw, throws , finally
 *
 *
 * */