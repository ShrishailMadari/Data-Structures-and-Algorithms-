package hashSet;

import java.util.HashSet;

public class LongestConsecutive {
    public static void main(String[] args) {
        int[] array = {99, 100, 4, 200, 1, 2, 3};
        int length = method(array);
        System.out.println(length);

    }

    private static int method(int[] array) {
        HashSet<Integer> hashSet = new HashSet<>();
        int max = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            hashSet.add(array[i]);
        }
        for (int i=0; i<=hashSet.size()-1;i++){
            if(!hashSet.contains(array[i]-1)){
                int current = array[i];
                int length = 1;
                while(hashSet.contains(current+1)){
                    length++;
                    current++;
                }
                max = Math.max(max,length);
            }


        }
        return max;
    }
}

