package backtracing;

public class PermutationsString {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = " ";
        printPermutation(str1,str2);
    }

    private static void printPermutation(String str1, String str2) {
        if(str1.isEmpty()){
            System.out.println(str2);
            return;
        }
        for (int i=0; i<str1.length();i++){

            char ch = str1.charAt(i);
            String left = str1.substring(0,i);
            String right = str1.substring(i+1);
            String remaining = left+right;
            printPermutation(remaining,str2+ch);
        }

    }
}
