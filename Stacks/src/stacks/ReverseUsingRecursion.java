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

        reverseStack(st);

    }

    private static void reverseStack(Stack<Integer> st) {
        if(st.size() == 0)
            return;
        Integer popped = st.pop();
        reverseStack(st);
        System.out.println(st);
        st.push(popped);
//        pushAtBottom(popped,st);
    }

    private static void pushAtBottom(Integer popped,Stack<Integer> st) {
        if(st.size()==0) {
            st.push(popped);
            return;
        }
        Integer pop = st.pop();
        pushAtBottom(pop,st);
        st.push(pop);
    }

}
