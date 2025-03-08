package leetcode75;

import java.util.HashMap;

public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";

        HashMap<Character,Integer> map = new HashMap<>();
        for (int i=0; i<= magazine.length()-1;i++){
            if (map.containsKey(magazine.charAt(i))){
                map.put(magazine.charAt(i),map.get(magazine.charAt(i))+1);
            }else
                map.put(magazine.charAt(i),1);
        }

    }
}
