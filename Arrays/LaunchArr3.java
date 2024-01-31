package Arrays;

import java.util.Scanner;

public class LaunchArr3 {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        int[][] arrJagged = {{2,3},{3,44,5,6},{2}};
        arr[0] = new int[4];
        arr[1] = new int[5];
        arr[3] = new int[2];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
