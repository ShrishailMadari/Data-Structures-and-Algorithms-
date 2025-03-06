public class OccurrenceOfCharInString {
    public static void main(String[] args) {
        String string = "Shrishail Madari";
        int count = 0;
        char c = 'i';
        int n =string.length();
        for (int i=0; i<=n-1; i++){
            if (string.charAt(i)==c){
                count++;
            }
        }
        System.out.println("count of the char is: "+count);
    }
}
