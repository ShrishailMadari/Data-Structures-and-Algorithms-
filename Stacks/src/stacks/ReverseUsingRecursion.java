package stacks;

import org.w3c.dom.ls.LSOutput;

import java.util.Stack;

public class ReverseUsingRecursion {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println("Top is: "+st.peek());
        System.out.println("If i got 1 at Top then stack reversed");
        System.out.println("Before reverse: "+st);
        reverseStack(st);
        System.out.println("After reverse: "+st);

    }

    private static void reverseStack(Stack<Integer> st) {
        if(st.size() == 1)
            return;
        Integer top = st.pop();
        reverseStack(st);
        pushAtBottom(top,st);
    }

    private static void pushAtBottom(Integer lastElement,Stack<Integer> st) {
        if(st.isEmpty()) {
            st.push(lastElement);
            return;
        }
        Integer top = st.pop();
        pushAtBottom(lastElement,st);
        st.push(top);
    }

}
