public class WhatIsArray {
/*  Operations on Array
    1. Array Traversal:
*/
    public static void main(String[] args) {
        float floats[];
        int arr1[] = {1,2,3,4,5,6,7,8,9};
//        we can directly define the length of the array if its possible
        for (int i = 0; i<9; i++){
            System.out.print(arr1[i]);
        }
        System.out.println();
        System.out.println("*******************************************");
//        otherwise we can mention the length
        for (int i = 0; i<arr1.length; i++){
            System.out.print(arr1[i]);
        }

    }
}
