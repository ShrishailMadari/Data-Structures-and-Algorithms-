import java.util.HashSet;

public class FindingDuplicateElement {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        int element = finding(array);
        System.out.println(element);

    }

    private static int finding(int[] array) {
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0;i<=array.length-1;i++){
            if (hashSet.contains(array[i])){
                return array[i];
            }else {
                hashSet.add(array[i]);
            }
        }
        return -1;
    }
}
