package Java_Data_Types_And_Variables_Lab;

import java.util.Scanner;

public class Zad03_ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        for (int i = 0; i < n; i++) {
            double num = Double.parseDouble(scanner.nextLine());
            sum += num;
        }
        System.out.printf("%f", sum);
    }
}
