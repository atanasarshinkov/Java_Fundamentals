package Java_Stacks_And_Queues_Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Zad04_BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int s = Integer.parseInt(input[1]);
        int x = Integer.parseInt(input[2]);

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            queue.add(scanner.nextInt());
        }

        for (int i = 0; i < s; i++) {
            queue.poll();
        }

        if (queue.isEmpty()) {
            System.out.println(0);
            return;
        }

        boolean isEquals = false;
        int w;

        for (int i = 0; i < n - s; i++) {
            w = queue.pop();
            if (w == x) {
                isEquals = true;
                break;
            }
            queue.addLast(w);
        }

        if (isEquals) {
            System.out.println(isEquals);
        } else {
            int minEl = queue.peek();
            for (Integer integer : queue) {
                int currEl = queue.pop();
                if (currEl < minEl) {
                    minEl = currEl;
                }
            }
            System.out.println(minEl);
        }
    }
}
