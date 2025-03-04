package leetcode75;

public class SingleElement {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,3,2};
        int value=0;
        for(int i=0;i<arr.length;i++){
            value = value^arr[i];
        }
        System.out.println(value);
    }
}
