package Java_Stacks_And_Queues_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Zad04_MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String expression = scanner.nextLine();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int index = 0; index < expression.length(); index++) {
            char symbol = expression.charAt(index);
            if (symbol == '(') {
                stack.push(index);
            } else if (symbol == ')') {
                int startInd = stack.pop();
                String sub = expression.substring(startInd, index + 1);
                System.out.println(sub);
            }
        }
    }
}
