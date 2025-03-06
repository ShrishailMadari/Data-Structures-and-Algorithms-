public class ReverseTheVowelsInString {
    public static void main(String[] args) {
        String s = "education";
        char[] charArray = s.toCharArray();
        int n = charArray.length;
        int start = 0;
        int end = n-1;
        for (int i=0;i<=end; i++){
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        System.out.println(charArray);
    }
}
