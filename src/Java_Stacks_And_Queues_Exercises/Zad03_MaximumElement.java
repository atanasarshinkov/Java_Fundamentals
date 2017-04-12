package Java_Stacks_And_Queues_Exercises;

import org.omg.CORBA.INTERNAL;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Zad03_MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String[] commandLine = scanner.nextLine().split(" ");
            int command = Integer.parseInt(commandLine[0]);

            switch (command) {
                case 1:
                    int number = Integer.parseInt(commandLine[1]);
                    stack.push(number);
                    break;
                case 2:
                    stack.pop();
                    break;
                default:
                    int maxEl = stack.peek();
                    for (int el = 0; el < stack.size(); el++) {
                        int fElement = stack.pop();
                        if (fElement > maxEl) {
                            maxEl = fElement;
                        }
                        stack.addLast(fElement);
                    }
                    System.out.println(maxEl);
                    break;
            }
        }
    }
}
