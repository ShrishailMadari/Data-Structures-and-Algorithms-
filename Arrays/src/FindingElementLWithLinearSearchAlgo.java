import java.util.Scanner;

public class FindingElementLWithLinearSearchAlgo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size: ");
        int size = scanner.nextInt();
        /*creating new array with mentioned size*/
        int array[] = new int[size];
        System.out.println("Enter the elements: ");
        for (int i=0; i<size; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter the Target element: ");
        int target = scanner.nextInt();

        int element = findElement(array,target,size);
        if (element == -1){
            System.out.println("No Element Found in the array");
        }else {
            System.out.println("Element is on index: "+element);
        }


    }

    private static int findElement(int[] array, int target, int size) {
        for (int i=0; i<size; i++){
            if(array[i]==target) {
                return i;
            }
        }
        return -1;
    };
}
