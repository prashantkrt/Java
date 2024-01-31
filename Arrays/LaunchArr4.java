package Arrays;

import java.util.Scanner;

public class LaunchArr4 {
    public static void main(String[] args) {
        int[][][] arr = new int[2][2][3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print(arr[i][j][k]+" ");
                }
            }
            System.out.println();
        }
    }
}
