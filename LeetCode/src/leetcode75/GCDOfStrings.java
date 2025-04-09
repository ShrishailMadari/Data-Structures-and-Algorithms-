package leetcode75;

public class GCDOfStrings {
    public static void main(String[] args) {
        String str1 ="ABCABCABC";
        String str2 = "ABC";
        System.out.println(findGCDOfString(str1,str2));

    }

    private static String findGCDOfString(String str1, String str2) {
        int n1= str1.length();
        System.out.println(n1);
        int n2= str2.length();
        System.out.println(n2);
        if (!(str1 + str2).equals(str2 + str1))
            return"";
        return str1.substring(0,gcd(n1,n2));
    }

    private static int gcd(int a, int b) {
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
}
