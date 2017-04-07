package Java_Syntax_Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad07_OddAndEvenPairs {
    public static int main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();
        String[] input = scanner.nextLine().split(" ");
        for (int i = 0; i < input.length; i++) {
            numbers.add(Integer.parseInt(input[i]));
        }

        if (numbers.size() % 2 != 0) {
            System.out.println("invalid length");
            return 1;
        }


        for (int i = 0; i < numbers.size(); i += 2) {
            boolean isThePairEven = false;
            boolean isThePairOdd = false;
            if (numbers.get(i) % 2 == 0 && numbers.get(i + 1) % 2 == 0) {
                isThePairEven = true;
            } else if (numbers.get(i) % 2 != 0 && numbers.get(i + 1) % 2 != 0) {
                isThePairOdd = true;
            }
            System.out.printf("%s, %s -> ", numbers.get(i), numbers.get(i + 1));
            if(isThePairEven){
                System.out.println("both are even");
            } else if(isThePairOdd){
                System.out.println("both are odd");
            } else {
                System.out.println("different");
            }
        }
        return 0;
    }
}
