import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindingDuplicateElement {
    public static void main(String[] args) {
        int[] array = {4,3,2,7,8,2,3,1};
        System.out.println( finding(array));
        List<Integer> duplicates = findDuplicates(array);
        System.out.println(duplicates);

    }

    public static List<Integer> findDuplicates(int[] n) {
        List<Integer> dup = new ArrayList<>();
        for(int i=0;i<n.length;i++){
            int index = Math.abs(n[i])-1;

            if(n[index]<0){
                dup.add(index+1);
            }
            else n[i] = -n[i];
        }
        return dup;
    }

    private static HashSet<Integer> finding(int[] array) {
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0;i<=array.length-1;i++){
            if (hashSet.contains(array[i])){
                hashSet.add(array[i]);
            }else {
                hashSet.add(array[i]);
            }
        }
        return hashSet;
    }
}
