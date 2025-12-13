import java.util.Arrays;

public class RotateTheArrayKTimes {
    public static void main(String[] args) {
        int[] array = {1,2,3,5,6,7};
        int k = 3;
        reverseArray(array,k);
    }

    private static void reverseArray(int[] array, int k) {
        int n = array.length;
        if(k>n){
            k = k%n;
        }
        System.out.println("Enter the number of times u want to rotate: "+k);
        System.out.println();
        System.out.println("Array before rotation: "+ Arrays.toString(array));
        System.out.println();
//        step-1: Rotate the whole array
        int[] rotation = reverseArr(array, 0, n - 1);
        System.out.println(Arrays.toString(rotation));
//        step-2: Rotate the K elements
        int[] kElements = reverseArr(array, 0, k - 1);
        System.out.println(Arrays.toString(kElements));
//        step-3: Rotate k to n-1 elements
        int[] reversedArray = reverseArr(array, k, n - 1);
        System.out.println("Array After Rotation: "+Arrays.toString(reversedArray));

    }


    private static int[] reverseArr(int[] array, int start, int end) {
        while (start<end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
        return array;
    }
}
