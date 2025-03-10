package stacks.questions;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the parenthesis: ");
        String input = scanner.nextLine();
//        System.out.println(checkParenthesis(input));
        System.out.println( validParenthesisForMultipleTypeOfBrackets(input));
    }


    static boolean validParenthesisForMultipleTypeOfBrackets(String input) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i <= input.length() - 1; i++) {
            char ch = input.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                Character top = stack.peek();
                if ((ch == ')' && top == '(') ||
                        (ch == '}' && top == '{') ||
                        (ch == ']' && top == '[')) {
                    stack.pop();
                }
                else return false;
            }
            else return false;

        }
        return stack.isEmpty();
    }

    private static boolean checkParenthesis(String input) {
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<=input.length()-1;i++){
            char ch = input.charAt(i);
            if(ch == '('){
                stack.push(ch);
            }
            if(ch == ')'){
                if(stack.isEmpty())
                    return false;
                if(stack.peek()=='(')
                    stack.pop();
            }
        }
        if (!stack.isEmpty())
            return false;
        else return true;
    }
}
