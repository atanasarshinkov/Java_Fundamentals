package Java_Syntax_Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad10_FirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();
        String[] input = scanner.nextLine().split(" ");
        inputNumbers(numbers, input);

        String[] commands = scanner.nextLine().split(" ");
        int num = Integer.parseInt(commands[1]);
        String typeNum = commands[2];
        int size = numbers.size();

        if (num > size) {
            num = size;
            outputNumbers(numbers, num, size, typeNum);

        } else {
            outputNumbers(numbers, num, size, typeNum);
        }
    }

    private static void outputNumbers(List<Integer> numbers, int num, int size, String typeNum) {
        if (typeNum.equals("even")) {
            int brOutput = 0;
            for (int i = 0; i < numbers.size(); i++) {
                if (brOutput < num) {
                    if (numbers.get(i) % 2 == 0) {
                        System.out.printf("%d ", numbers.get(i));
                        brOutput++;
                    }
                } else {
                    break;
                }
            }
        } else if (typeNum.equals("odd")) {
            int brOutput = 0;
            for (int i = 0; i < numbers.size(); i++) {
                if (brOutput < num) {
                    if (numbers.get(i) % 2 != 0) {
                        System.out.printf("%d ", numbers.get(i));
                        brOutput++;
                    }
                } else {
                    break;
                }
            }
        }
    }

    private static void inputNumbers(List<Integer> numbers, String[] input) {
        for (int i = 0; i < input.length; i++) {
            numbers.add(Integer.parseInt(input[i]));
        }
    }
}
