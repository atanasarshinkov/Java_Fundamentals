package Java_Multidimensional_Arrays_Exercises;

import java.util.Scanner;

public class Zad03_DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        int[][] matrix = new int[n][n];

        for (int row = 0; row < matrix.length; row++) {
            String[] input = scanner.nextLine().split(" ");
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = Integer.parseInt(input[col]);
            }
        }

        int sumFirstDiag = 0;
        int sumSecDiag = 0;

        for (int i = 0; i < n; i++) {
            sumFirstDiag += matrix[i][i];
            sumSecDiag += matrix[i][n - 1 - i];
        }

        int res = Math.abs(sumFirstDiag - sumSecDiag);
        System.out.println(res);
    }
}
