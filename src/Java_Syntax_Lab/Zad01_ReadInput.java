package Java_Syntax_Lab;

import java.util.Scanner;

public class Zad01_ReadInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word1 = scanner.next();
        String word2 = scanner.next();

        int nInt = scanner.nextInt();
        double nDouble1 = scanner.nextDouble();
        double nDouble2 = scanner.nextDouble();

        String word3 = scanner.next();

        int sum = (int) (nInt + nDouble1 + nDouble2);

        System.out.printf("%s %s %s %d", word1, word2, word3, sum);
    }
}
