import java.util.Scanner;

public class MergeTwoArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Size of first array: ");
        int size1 = scanner.nextInt();
        int arr1[] = new int[size1];
        System.out.println("enter first array elements: ");
        for (int i = 0; i<size1; i++){
            arr1[i] = scanner.nextInt();
        }
        int length1 = arr1.length;
        System.out.println("Enter Size of second array: ");
        int size2 = scanner.nextInt();
        int arr2[] = new int[size2];
        System.out.println("enter second array elements: ");
        for (int i = 0; i<size2; i++){
            arr2[i] = scanner.nextInt();
        }
        int length2 = arr2.length;
        int arr3[] = new int[length1+length2];
        int length3 = arr3.length;
        for (int i=0; i<length1; i++)
        {
            arr3[i] = arr1[i];
        }
        for (int i=0; i<length2; i++){
            arr3[length1 + i] = arr2[i];
        }
        System.out.println("Merged array is: ");
        for (int i=0; i<length3; i++){
            System.out.print(arr3[i]+" ");
        }
    }
}
