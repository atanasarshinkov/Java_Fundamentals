package Java_Live_Demo;

import java.util.Stack;

public class LiveDemo_01 {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        System.out.println(stack.peek());
        System.out.println(stack.pop());


    }
}
