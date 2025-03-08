package stacks;

import java.util.Scanner;
import java.util.Stack;

public class CopyStackToAnother {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = scanner.nextInt();
        System.out.println("Enter the Elements: ");
        for (int i= 1;i<=n;i++){
            int elements = scanner.nextInt();
            stack.push(elements);
        }
        System.out.println(stack);
        reverseOrderInAnother(stack);

    }

    private static void reverseOrderInAnother(Stack<Integer> stack) {
        Stack<Integer> stack2 = new Stack<>();
        while (!stack.isEmpty()){
//            Integer element = stack.peek();
            stack2.push(stack.pop());
//            stack.pop();
            System.out.println();
        }
        System.out.println(stack2);
    }
}
