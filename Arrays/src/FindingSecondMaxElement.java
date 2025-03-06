import java.util.Scanner;

public class FindingSecondMaxElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        int array[] = new int[size];
        System.out.println("Enter the elements: ");
        for (int i=0;i<size;i++){
            array[i] = scanner.nextInt();
        }
    int element = findTheSecondMaxElement(array,size);
        System.out.println(element);
    }

    private static int findTheSecondMaxElement(int[] array, int size) {
        int ans = 0;
        for (int i = 0; i < size; i++) {

            if (array[i] == ans) {

            }
            return 0;
        }
        return ans;
    }
}
