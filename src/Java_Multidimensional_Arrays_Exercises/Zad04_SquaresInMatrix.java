package Java_Multidimensional_Arrays_Exercises;

import java.util.Scanner;

public class Zad04_SquaresInMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int r = Integer.parseInt(input[0]);
        int c = Integer.parseInt(input[1]);

        String[][] matrix = new String[r][c];

        for (int row = 0; row < matrix.length; row++) {
            String[] reminder = scanner.nextLine().split(" ");
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = reminder[col];
            }
        }

        //проверка за еднакви квадрати
        int br = 0;
        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[0].length - 1; col++) {
                if (matrix[row][col].equals(matrix[row][col + 1])
                        && matrix[row][col].equals(matrix[row + 1][col])
                        && matrix[row][col].equals(matrix[row + 1][col + 1])) {
                    br++;
                }
            }
        }
        System.out.println(br);
    }
}
