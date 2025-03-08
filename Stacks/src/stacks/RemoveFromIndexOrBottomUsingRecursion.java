package stacks;

import java.util.Stack;

public class RemoveFromIndexOrBottomUsingRecursion {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(8);
        stack.push(10);
        stack.push(6);
        stack.push(3);
        stack.push(9);
        System.out.println("Elements Bottom to top : "+stack);
        removeFromBottom(stack);
        System.out.println("elements after removing from bottom: "+stack);
        System.out.println();
        removeBasedOnIndex(stack,3);
        System.out.println("after removing on index 3:"+stack);
    }

    private static void removeBasedOnIndex(Stack<Integer> stack, int index) {
        if(stack.size()==index){
            stack.pop();
            return;
        }
        Integer top = stack.pop();
        removeBasedOnIndex(stack,index);
        stack.push(top);
    }

    private static void removeFromBottom(Stack<Integer> stack) {
        if(stack.size()==1){
            stack.pop();
            return;
        }
        Integer top = stack.pop();
        removeFromBottom(stack);
        stack.push(top);

    }
}
