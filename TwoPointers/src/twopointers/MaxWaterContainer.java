package twopointers;

public class MaxWaterContainer {
    public static void main(String[] args) {
//        Input: height = [1,8,6,2,5,4,8,3,7]
        int[] height = {1,8,6,2,5,4,8,3,7,9,10};
        int left=0;
        int right = height.length-1;
        int maxArea = 0;
        while (left<=right){
            int currentArea = (right-left)*Math.min(height[left],height[right]);
            if (maxArea<currentArea){
                maxArea = currentArea;
            }
            if (height[left]<height[right]){
                left++;
            }else
                right--;
        }
        System.out.println("max amount of water stored is: "+maxArea);
    }
}
