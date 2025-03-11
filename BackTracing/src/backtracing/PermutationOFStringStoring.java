package backtracing;

import java.util.ArrayList;
import java.util.List;

public class PermutationOFStringStoring {
    public static void main(String[] args) {

            String str1 = "abc";
            String str2 = " ";
        List<String> list = new ArrayList<>();
        printPermutationStoring(str1,str2,list);
        for (String string : list) {
            System.out.println(string);
        }



    }

    private static void printPermutationStoring(String str1, String str2,List<String> list) {
        if(str1.isEmpty()){
            System.out.println(str2);
            return;
        }
        for (int i=0; i<str1.length();i++){

            char ch = str1.charAt(i);
            String left = str1.substring(0,i);
            String right = str1.substring(i+1);
            String remaining = left+right;
            printPermutationStoring(remaining,str2+ch,list);
        }
    }
}
