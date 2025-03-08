package stacks;

import java.util.Stack;

public class PushAtBottom {
    public static void main(String[] args) {
        int number = 600;
        Stack<Integer> stack =new Stack<>();
        stack.push(100);//-->bot
        stack.push(200);
        stack.push(300);
        stack.push(400);
        stack.push(500);//-->top
        System.out.println("stack elements: top to bottom: "+stack);
        pushingElementAtBottomUsingRecursion(stack);
        System.out.println("After Pushing At Bottom: "+stack);
        System.out.println(stack.peek());
    }

    private static void pushingElementAtBottomUsingRecursion(Stack<Integer> stack) {
        int number = 600;
        if(stack.isEmpty()){
            stack.push(number);
            return;
        }
        int top = stack.pop();
        pushingElementAtBottomUsingRecursion(stack);
        stack.push(top);


    }
}
