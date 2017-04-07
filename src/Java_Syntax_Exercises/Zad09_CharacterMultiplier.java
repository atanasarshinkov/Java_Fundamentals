package Java_Syntax_Exercises;

import java.util.Scanner;

public class Zad09_CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.next();
        String str2 = scanner.next();

        System.out.println(getCharSumCode(str1, str2));
    }

    private static int getCharSumCode(String str1, String str2) {
        int sum = 0;
        int charLeft = Math.abs(str1.length() - str2.length());
        int smallerString = Math.min(str1.length(), str2.length());
        for (int i = 0; i < smallerString; i++) {
            sum += str1.charAt (i) * str2.charAt (i);
        }

        if (str1.length() > str2.length()) {
            for (int i = str1.length() - charLeft; i < str1.length(); i++) {
                sum += str1.charAt(i);
            }
        } else if (str2.length() > str1.length()) {
            for (int i = str2.length() - charLeft; i < str2.length(); i++) {
                sum += str2.charAt(i);
            }
        }
        return sum;
    }
}
