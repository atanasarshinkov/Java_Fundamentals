package Java_Syntax_Lab;

import java.util.Scanner;

public class Zad09_CalculateTriangleAreaMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double base = scanner.nextDouble();
        double h = scanner.nextDouble();

        double area = getTriangleArea(base, h);

        System.out.printf("Area = %.2f", area);
    }

    public static double getTriangleArea(double b, double h) {
        return (b * h) / 2;
    }
}
