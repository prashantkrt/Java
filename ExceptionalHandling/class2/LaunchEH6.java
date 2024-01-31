package ExceptionalHandling.class2;

import java.util.Scanner;

class Demo1 {
    Scanner sc = null;

    //ducking the exception
    public void alpha() throws ArithmeticException {
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

public class LaunchEH6 {
    public static void main(String[] args) {
        Demo1 d = new Demo1();
        //now it's mandatory to handle it or duck it
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