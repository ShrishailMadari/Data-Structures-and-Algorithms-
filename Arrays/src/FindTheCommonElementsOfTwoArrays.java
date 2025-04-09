public class FindTheCommonElementsOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,98};
        int[] arr2 = {8,9,98,93,46,2,46,67,1};

        int theCommonElements = findTheDuplicateElements(arr1, arr2);
        System.out.println(theCommonElements);
    }

    private static int findTheDuplicateElements(int[] arr1, int[] arr2) {
        for (int i=0;i<arr1.length;i++){
            for (int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    return arr1[i];
                }
            }
        }

        return 0;
    }
}
