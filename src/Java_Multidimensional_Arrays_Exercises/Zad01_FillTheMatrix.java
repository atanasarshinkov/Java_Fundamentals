package Java_Multidimensional_Arrays_Exercises;

import java.util.Scanner;

public class Zad01_FillTheMatrix {
    private static void patternA(int n) {
        for (int row = 0; row < n; row++) {
            int m = row + 1;
            for (int col = 0; col < n; col++) {
                System.out.print(m + " ");
                m += n;
            }
            System.out.println();
        }
    }

    private static void patternB(int n) {
        int j = 1;
        for (int row = 0; row < n; row++) {
            int m = row + 1;
            for (int col = 0; col < n; col++) {
                System.out.print(m + " ");
                if (col % 2 == 0) {
                    m = m + 2 * n - j;
                } else {
                    m += j;
                }
            }
            j += 2;
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        patternA(n);
        System.out.println();
        patternB(n);
    }
}