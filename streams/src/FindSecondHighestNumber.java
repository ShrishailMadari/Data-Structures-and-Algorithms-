import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class FindSecondHighestNumber {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(12,24,3,4,5,23,63,2));
        System.out.println("First Highest Number: ");
        Integer firstHighest = arrayList.stream().distinct().sorted(Comparator.reverseOrder()).findFirst().orElse(null);
        System.out.println(firstHighest);
        System.out.println();
        System.out.println("Second Highest Number: ");
        Integer first = arrayList.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
        System.out.println(first);
        System.out.println("Third Highest Number: ");
        Integer thirdHighestNumber = arrayList.stream().distinct().sorted(Comparator.reverseOrder()).skip(2).findFirst().orElse(null);
        System.out.println(thirdHighestNumber);

        List<Integer> ifSameElements = new ArrayList<>(Arrays.asList(12,12,12,12,12));
        Integer sameNumbers = ifSameElements.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
        System.out.println(sameNumbers);


    }
}
