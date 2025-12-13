public class WhatIsArray {
/*  Operations on Array
    1. Array Traversal:
*/
    public static void main(String[] args) {
        /*Declaration+ Initialization + Instantiation of an array:
        * */
        int[] arr = {1, 2, 3, 4, 5};

//        Declaration + Instantiation (then assign values later)
        int array[] = new int[5];
        array[0] = 100;
        array[1] = 900;
        array[2] = 400;
        array[3] = 200;

//        3. Declaration first, then instantiation and initialization
        int array1[]; //Declaration
        array1 = new int[10]; // Instantiation
        array1 = new int[]{1,2,3,4,5,6}; // instantiation + initialization

//        4. Using anonymous array (directly as argument)
//This is often used when passing an array to a method:
        printArrays(new String[]{"Narayana","Achyuta","Janardhana","Govinda"});



        int arr1[] = {1,2,3,4,5,6,7,8,9};
//        we can directly define the length of the array if it is known
        for (int i = 0; i<9; i++){
            System.out.print(arr1[i]);
        }
        System.out.println();
        System.out.println("*******************************************");
//        otherwise we can mention the length which is dynamic in nature
        for (int i = 0; i<arr1.length; i++){
            System.out.print(arr1[i]);
        }
        System.out.println();
        System.out.println("*******************************************");

//        traversing the array from backward
        int arr2[] = {1,2,3,4,5,6,7,8,9};
        for (int i = arr1.length-1; i>=0; i--){
            System.out.print(arr2[i]+" ");
        }

    }

    private static String printArrays(String[] strings) {

        return "Om namo Narayanay: ";
    }
}
