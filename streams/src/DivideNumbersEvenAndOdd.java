import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DivideNumbersEvenAndOdd {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(12,23,3,4,5,23,63,2));
        Map<Boolean, List<Integer>> collect = arrayList.stream().collect(Collectors.partitioningBy(x -> x % 2 != 0));
        System.out.println(collect);
    }
}
