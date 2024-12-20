import java.util.Scanner;

public class FindTheSumOfTheArray {
    public static void main(String[] args) {
        System.out.println("finding the sum of the array: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the array Elements of size:"+size);
            for (int i=0; i<size; i++){
                arr[i] = scanner.nextInt();
            }
        // Check for extra inputs
        if (scanner.hasNextInt()) {
            System.out.println("Warning: Extra inputs detected and ignored.");
        }
        findingTheSum(arr,size);
    }

    private static void findingTheSum(int[] arr, int size) {
        int sum = 0;
            for (int i=0; i<arr.length; i++){
                sum = sum + arr[i];
        }
        System.out.println("Sum of the Elements is: "+sum);
    }
}
