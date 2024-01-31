package Basic.loops;

import java.util.Scanner;

public class PatternA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        patternASimple(n);
        patternAAdvance(n);

    }

    public static void patternASimple(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == (n - 1) / 2 || j == 0 || j == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();

        }
    }

    public static void patternAAdvance(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 && j > (n - 1) / 4 && j < 3 * (n - 1) / 4) ||
                        (i == (n - 1) / 2 && j > (n - 1) / 4 && j < 3 * (n - 1) / 4) ||
                        (j == (n - 1) / 4 && i != 0) ||
                        (j == 3 * (n - 1) / 4 && i != 0)) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
