package Java_Syntax_Exercises;

import java.util.Scanner;

public class Zad06_FromBaseSevenToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bSev = scanner.nextLine();
        System.out.println(Integer.valueOf(bSev, 7));
    }
}
