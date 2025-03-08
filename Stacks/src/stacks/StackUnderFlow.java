package stacks;

import java.util.Stack;

public class StackUnderFlow {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Shri");
        stack.push("Hari");
        stack.push("Govinda");
        stack.push("Krishna");
        stack.push("Anatha Rakshkaka");
        stack.push("Janardhana");

        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
//        stack.pop();
//        System.out.println(stack);
    }
}
