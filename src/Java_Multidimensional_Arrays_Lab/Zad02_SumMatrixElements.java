package Java_Multidimensional_Arrays_Lab;

import java.util.Scanner;

public class Zad02_SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");

        int[][] numbers = new int[Integer.parseInt(input[0])][Integer.parseInt(input[1])];
        int sum = 0;
        for (int row = 0; row < numbers.length; row++) {
            String[] reminder = scanner.nextLine().split(", ");
            for (int col = 0; col < numbers[row].length; col++) {
                numbers[row][col] = Integer.parseInt(reminder[col]);
                sum += numbers[row][col];
            }
        }

        System.out.printf("%s%n%s%n%d", input[0], input[1], sum);

    }
}
