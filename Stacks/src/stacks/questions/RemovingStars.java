package stacks.questions;

import java.util.Stack;

public class RemovingStars {
    public static void main(String[] args) {
        String string =  "erase*****";
        System.out.println(removeStars(string));
    }

    private static String removeStars(String string) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<=string.length()-1;i++){
            if (string.charAt(i)=='*'){
                if (!stack.isEmpty()){
                    stack.pop();
                }
            }else
                stack.push(string.charAt(i));
        }
        StringBuilder builder = new StringBuilder(); //used to builder the string
//        for (int i=0 ;i<stack.size();i++){
//            builder.append(stack.get(i));
//        }
        for (char ch :stack){
            builder.append(ch);
        }
        return builder.toString(); // this will convert the char to string
    }
}
