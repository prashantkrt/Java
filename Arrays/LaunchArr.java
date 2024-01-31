package Arrays;

import java.util.Scanner;

public class LaunchArr {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        int [][] arr1 = {{1,2},{3,4}};
        int [] arr3 ={2,3};
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
