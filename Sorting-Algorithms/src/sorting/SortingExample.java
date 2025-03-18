package sorting;

import java.util.Arrays;

public class SortingExample {

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        boolean bool = false;
        System.out.println("need to be sorted in ascending order: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("After Sorting: ");
        sortingArray(arr,bool);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortingArray(int[] arr,boolean  swapped) {
        int n = arr.length;
        for (int i=0;i<n;i++){
            swapped = false;

            for (int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                    swapped = true;
                }
            }

            if (!swapped) break;
        }

    }


}
