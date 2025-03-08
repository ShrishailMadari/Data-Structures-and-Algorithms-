package leetcode75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 10;
        // two pointers
        int[] ints = usingBruteForce(arr, target);
        System.out.println("This gives the time complexity of O(n2): ");
        System.out.println(Arrays.toString(ints));

        System.out.println();
        int[] usingHashMap = usingHashMap(arr, target);
        System.out.println(Arrays.toString(usingHashMap));
    }

    private static int[] usingHashMap(int[] arr, int target) {
        HashMap<Integer,Integer> map  = new HashMap<>();
        for (int i=0; i<=arr.length-1;i++){
            int digit = target - arr[i];
            if(map.containsKey(digit)){
                return new int[]{map.get(digit),i};
            }
            map.put(arr[i],i);
        }
        return null;
    }

    private static int[] usingBruteForce(int[] arr, int target) {
        for (int i=0;i<=arr.length-1;i++){
            for (int j=i+1; j<=arr.length-1; j++){
                if(arr[i]+arr[j] == target){
                    return new int[]{i,j};

                }
            }
        }
        return new int[]{};

    }
}
