package Java_Stacks_And_Queues_Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Zad01_ReverseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < input.length; i++) {
            stack.push(Integer.valueOf(input[i]));
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
