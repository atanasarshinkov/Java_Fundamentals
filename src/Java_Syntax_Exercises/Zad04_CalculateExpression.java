package Java_Syntax_Exercises;

import java.util.Scanner;

public class Zad04_CalculateExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double F1 = Math.pow((Math.pow(a, 2) + Math.pow(b, 2)) / (Math.pow(a, 2) - Math.pow(b, 2)),(a + b + c) / Math.sqrt(c));

        double F2 = Math.pow(Math.pow(a, 2) + Math.pow(b,2) -Math.pow(c,3), a - b);

        double avg1 = (a + b + c) / 3;
        double avg2 = (F1 + F2) / 2;

        double Diff = Math.abs(avg1 - avg2);

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", F1, F2, Diff);



    }
}
