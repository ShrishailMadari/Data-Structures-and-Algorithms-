package stacks;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        stringStack.push("Shri"); //-->Bottom Element
        stringStack.push("Hari");
        stringStack.push("Govinda");
        stringStack.push("Krishna");
        stringStack.push("Keshava");
        stringStack.push("Madhava");
        stringStack.push("Vasudeva"); //-->Top Element
        System.out.println(stringStack);

        Stack<String> temp1 = new Stack<>();
        while (!stringStack.isEmpty()){
            temp1.push(stringStack.pop());
        }
        System.out.println(temp1);

        Stack<String> temp2 = new Stack<>();
        while (!temp1.isEmpty()){
            temp2.push(temp1.pop());
        }
        System.out.println(temp2);

        while (!temp2.isEmpty()){
            stringStack.push(temp2.pop());
        }
        System.out.println(stringStack);
    }
}
