import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFrequencyOfNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(
                10, 20, 30, 10, 40, 20, 10, 50, 30, 20,
                60, 70, 60, 80, 90, 80, 10, 20, 30, 100
        );

        Map<Integer, Long> collect = numbers.stream().collect(Collectors.groupingBy(ele -> ele, Collectors.counting()));
        System.out.println(collect);
    }
}
