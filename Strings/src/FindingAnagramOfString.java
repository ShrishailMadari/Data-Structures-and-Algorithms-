public class FindingAnagramOfString {
    public static void main(String[] args) {
        String s1 = "Shrishail";
        String s2 = "Shreesha";

        if(isAnagram(s1,s2)){
            System.out.println("Is Anagram: ");
        }
        else System.out.println("Not Anagram: ");
    }

    private static boolean isAnagram(String s1, String s2) {

        String lowerCase1 = s1.replace("\\s", s1).toLowerCase();
        String lowerCase2 = s2.replace("\\s", s2).toLowerCase();

        if (lowerCase1.equals(lowerCase2)){
            return true;
        }else return false;
    }
}
