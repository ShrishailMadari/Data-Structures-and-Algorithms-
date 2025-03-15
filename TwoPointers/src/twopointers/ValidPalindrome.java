package twopointers;

public class ValidPalindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        int left = 0;
        int right = str.length() - 1;
        System.out.println( checkPalindrome(left, right, str));
    }

    private static boolean checkPalindrome(int left, int right, String str) {
        while (left < right) {
            //if other than letter n digit it'll be in valid, if its char or digit then
//            only moves forward
            while (left < right && !Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }
            /*
            * Mistake:
                Character.isLowerCase(char) returns true or false based on whether the character is lowercase.
                You're comparing boolean values, which is incorrect.
                Instead, you should compare the actual lowercase characters.
                */
            if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
