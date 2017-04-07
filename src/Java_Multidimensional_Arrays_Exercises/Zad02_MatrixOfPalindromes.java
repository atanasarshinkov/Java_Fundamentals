package Java_Multidimensional_Arrays_Exercises;

import java.util.Scanner;

public class Zad02_MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] alphabet = "abcdefghigklmnopqrstuvwxyz".toCharArray();

        //System.out.println(alphabet[2]); //prints 'c' from alphabet[]

        String[] input = scanner.nextLine().split(" ");

        char[][] matrix = new char[Integer.parseInt(input[0])][Integer.parseInt(input[1])];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.printf("%s%s%s ", alphabet[row], alphabet[row + col], alphabet[row]);
            }
            System.out.println();
        }
    }
}
