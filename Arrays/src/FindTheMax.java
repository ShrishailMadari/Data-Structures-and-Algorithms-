import java.util.Scanner;

public class FindTheMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int array[] = new int[size];
        System.out.println("enter the array elements: ");
        for (int i = 0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }

       /* if(scanner.hasNextInt()){
            System.out.println("Warning: extra numbers and been ignored");
        }else */
        findTheMaxNumber(array,size);


    }

    private static void findTheMaxNumber(int[] array, int size) {
        int ans = 0;
        for (int i=0; i<size; i++){
            if (array[i]>ans){
                ans = array[i];
            }
        }
        System.out.println("the Max number is: "+ans);
    }
}
