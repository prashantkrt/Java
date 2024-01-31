package ExceptionalHandling.class2;

import java.util.Scanner;

/*
 * learning rethrowing
 * Rethrow helps to throw the handled exception
 *
 * */
class Demo3 {
    Scanner sc = null;

    public void alpha() {
        try {
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
            throw e;// re throw the exception to the caller
            //now post this call nothing will get executed
            //below lines will not execute
            //statements below throw keyword won't execute
            //System.out.println("I'M BELOW STATEMENT"); // unreachable code
        } finally {
            System.out.println("This will execute what ever happens above");
            sc.close();
            /*
             * usually used to close the resources
             * cleanup activity
             * */
        }
        System.out.println("Thank-you for using my app!!"); // will not execute if exception occurs because of throw
    }
}
/*
 * if exception occurs in alpha then it will get handled there itself
 * it won't be going to main catch block once exception got handled
 * */

public class LaunchEH8 {
    public static void main(String[] args) {
        Demo3 d = new Demo3();
        try {
            System.out.println("Connection established");
            d.alpha();
        } catch (ArithmeticException e) {
            System.out.println("Exception is caught in main method");
        }
        System.out.println("connection terminated");
    }
}


//ducking the exception is different and handling is different
/*
 * if you are not handling it then you should add in the method signature that exception might get happen
 * */

//we cannot write ony finally
//try and finally can be writter