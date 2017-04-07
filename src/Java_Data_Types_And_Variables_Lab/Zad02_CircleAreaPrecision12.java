package Java_Data_Types_And_Variables_Lab;

import java.util.Scanner;

public class Zad02_CircleAreaPrecision12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());
        double area = Math.PI * r * r;
        System.out.printf("%.12f", area);
    }
}
