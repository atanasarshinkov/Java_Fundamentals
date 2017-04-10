package Java_Stacks_And_Queues_Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Zad02_BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int s = Integer.parseInt(input[1]);
        int x = Integer.parseInt(input[2]);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        String[] stackInp = scanner.nextLine().split("\\s+");

        for (int i = 0; i < n; i++) {
            stack.push(Integer.valueOf(stackInp[i]));
        }

        for (int i = 0; i < s; i++) {
            stack.pop();
        }

        if (stack.isEmpty()) {
            System.out.println(0);
            return;
        }

        boolean isEquals = false;
        int w;

        for (int i = 0; i < n - s; i++) {
            w = stack.pop();
            if (w == x) {
                isEquals = true;
                break;
            }
            stack.addLast(w);
        }

        if (isEquals) {
            System.out.println(isEquals);
        } else {
            int minEl = stack.peek();
            for (Integer integer : stack) {
                int currEl = stack.pop();
                if (currEl < minEl) {
                    minEl = currEl;
                }
            }
            System.out.println(minEl);
        }
    }
}
