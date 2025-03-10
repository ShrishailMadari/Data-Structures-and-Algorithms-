package stacks.questions;

import java.util.Arrays;

public class NextGreateElementUsingLoopsAndStacks {
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,8,6,3,4};
        System.out.println(Arrays.toString(printingArray(arr)));
    }

    private static int[] printingArray(int[] arr) {
        int[] result = new int[arr.length];
        for (int i=0;i<arr.length;i++){
            result[i] = -1;
            for (int j= i+1; j<arr.length; j++){
                if(arr[j]>arr[i]){
                    result[i] = arr[j];
                    break;
                }
            }
        }
        return result;
    }
}
