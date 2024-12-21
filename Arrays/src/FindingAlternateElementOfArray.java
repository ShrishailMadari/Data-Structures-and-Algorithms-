import java.util.Scanner;

public class FindingAlternateElementOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int array[] = new int[size];
        System.out.println("Enter the array elements:");
        for (int i =0; i<size; i++){
            System.out.println(array[i] = scanner.nextInt());
            System.out.println();
        }
        for (int i=0;i<size; i=i+2){
            System.out.print(array[i]+" ");
        }
    }
}
