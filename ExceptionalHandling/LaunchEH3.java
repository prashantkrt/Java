package ExceptionalHandling;

import java.util.Scanner;

public class LaunchEH3 {
    public static void main(String[] args) {

        System.out.println("Welcome to my app!!!");
        Scanner sc = null;
        try {
            sc = new Scanner(System.in);
            System.out.println("Kindly enter numerator number to divide");
            int num1 = sc.nextInt();
            System.out.println("Kindly enter denominator number to divide");
            int num2 = sc.nextInt();
            int res = 0;
            res = num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("Please give non zero denominator");
        }
        try {
            System.out.println("Kindly enter the size of the array");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.println("Kindly enter the element to be inserted");
            int element = sc.nextInt();

            System.out.println("Kindly enter the position of the array to be inserted");
            int pos = sc.nextInt();
            arr[pos] = element;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is out of bound kindly inter within the range");
        } catch (NegativeArraySizeException e) {
            System.out.println("Please give the +ve number for the insert position");
        } catch (Exception e) {
            System.out.println("Generic catch block");
        }
        System.out.println("Data inserted successfully");
        System.out.println("Thank-you for using my app!!");
    }
}
