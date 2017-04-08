package Java_Multidimensional_Arrays_Exercises;

import java.util.Scanner;

public class Zad05_MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int[][] matrix = new int[n][m];

        int maxSum = 0;
        int currSum;

        inputArr(matrix, scanner);

        int i = 0, j = 0;

        for (int row = 0; row < matrix.length - 2; row++) {
            for (int col = 0; col < matrix[row].length - 2; col++) {
                currSum = 0;
                currSum = currSumCalc(matrix, currSum, row, col);
                if (currSum > maxSum) {
                    i = row;
                    j = col;
                    maxSum = currSum;
                }
            }
        }
        System.out.printf("Sum = %d%n", maxSum);

        for (int k = i; k < i + 3; k++) {
            for (int l = j; l < j + 3; l++) {
                System.out.print(matrix[k][l] + " ");
            }
            System.out.println();
        }
    }

    private static int currSumCalc(int[][] matrix, int currSum, int row, int col) {
        for (int r = row; r < row + 3; r++) {
            for (int c = col; c < col + 3; c++) {
                currSum += matrix[r][c];
            }
        }
        return currSum;
    }

    private static void inputArr(int[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            String[] reminder = scanner.nextLine().split(" ");
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = Integer.parseInt(reminder[col]);
            }
        }
    }
}