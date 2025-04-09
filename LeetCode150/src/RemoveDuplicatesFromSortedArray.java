public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 5, 6, 6, 7, 8, 8};
        System.out.println(removeTheDuplicates(arr));
    }

    private static int removeTheDuplicates(int[] arr) {
        int count = 0;
        for (int i = 0; i <arr.length-1; i++) {
            if (arr[i] == arr[i + 1]) {
                continue;
            } else
                count++;
            arr[count] = arr[i + 1];

        }
        return count+1;
    }
}
