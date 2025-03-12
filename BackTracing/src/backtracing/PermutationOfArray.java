package backtracing;

import java.util.ArrayList;
import java.util.List;

public class PermutationOfArray {
    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();
        int index = 0;
        int[] nums = {1,2,3};
        helperMethod(nums,index,ans);
        System.out.println(ans);
    }

    private static void helperMethod(int[] nums, int index, List<List<Integer>> ans) {
        int n = nums.length;
        if(index == n-1){
            List<Integer> list = new ArrayList<>();
            for (int i =0 ; i<n; i++){
                list.add(nums[i]);
            }
            ans.add(list);
            return;
        }

        for (int i=index; i<n; i++){ // index swapping must here
            swapping(i,index,nums); // this will be acting as check point
            helperMethod(nums,index+1,ans);
            swapping(i,index,nums);// back tracking here

        }
    }

    private static void swapping(int i, int index, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;
    }


}
