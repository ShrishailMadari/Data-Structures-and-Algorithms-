public class MaxSumOfSubArray {
    public static void main(String[] args) {
        int[] nums = {1,9,-1,-5,7,-2,-4,8,-5,19};
         int maxSum = findMaxSum(nums);
        System.out.println(maxSum);
    }

    private static int findMaxSum(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum=0;
        for(int i=0;i<nums.length;i++){
            currentSum = currentSum+nums[i];
            maxSum = Math.max(nums[i], currentSum);
            if (currentSum<0)
                currentSum=0;
        }
        return maxSum;
    }
}
