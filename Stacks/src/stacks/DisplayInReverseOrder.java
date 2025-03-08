package stacks;

import java.util.Stack;

public class DisplayInReverseOrder {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(100);
        integerStack.push(200);
        integerStack.push(300);
        integerStack.push(400);
        integerStack.push(500);

//        printingReverseElements(integerStack);
//        System.out.println();
        System.out.println("this is stack elements");
        printingStackElementsWithRecursion(integerStack);
        System.out.println();
        System.out.println("this is reversed");
        printingReverseUsingRecursion(integerStack);
    }

    private static void printingStackElementsWithRecursion(Stack<Integer> st) {
        if(st.isEmpty()){
            return;
        }
        Integer top = st.pop();
        System.out.print(top+" ");
        printingReverseUsingRecursion(st);
        st.push(top);
    }

    private static void printingReverseUsingRecursion(Stack<Integer> st) {
        if(st.isEmpty()){
            return;
        }
        Integer top = st.pop();
        printingReverseUsingRecursion(st);
        System.out.print(top+" ");
        st.push(top);
    }

    private static void printingReverseElements(Stack<Integer> integerStack) {
        Stack<Integer> temp = new Stack<>();
        while (!integerStack.isEmpty()){
            Integer peek = integerStack.peek();
            temp.push(peek);
            integerStack.pop();
        }
        System.out.println(temp);
        while (!temp.isEmpty()){
            integerStack.push(temp.pop());
        }
        System.out.println(integerStack);
        System.out.println();
    }

}
