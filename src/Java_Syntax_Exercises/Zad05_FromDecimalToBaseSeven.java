package Java_Syntax_Exercises;

import java.util.Scanner;

public class Zad05_FromDecimalToBaseSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dec = Integer.parseInt(scanner.nextLine());
        System.out.println(Integer.toString(dec, 7));
    }
}
