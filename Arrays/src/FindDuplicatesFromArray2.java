import java.util.HashMap;
import java.util.Map;

public class FindDuplicatesFromArray2 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3, 3};
        int size = removeTheDuplicatesFromTheArray(arr);
        System.out.println("Size is: "+size);

    }




    private static int removeTheDuplicatesFromTheArray(int[] num) {
        int count = 0; // this allows us to add the first two elements irrespective of wt they are
         for (int j = 0; j < num.length; j++) {
            if (count < 2 || num[j] != num[count - 2]) {
                num[count] = num[j];
                count++;
            }
        }
        return count;

    }
}
