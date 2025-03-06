import java.util.Arrays;

public class RotateTheArrayKTimes {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int k = 3;
        reverseArray(array,k);
    }

    private static void reverseArray(int[] array, int k) {
        int n = array.length;
        k = k%n;
        System.out.println(k);
        System.out.println("Array before rotation: "+ Arrays.toString(array));
        int[] rotation = reverseArr(array, 0, n - 1);
        System.out.println(Arrays.toString(rotation));
        int[] kElements = reverseArr(array, 0, k - 1);
        System.out.println(Arrays.toString(kElements));
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
