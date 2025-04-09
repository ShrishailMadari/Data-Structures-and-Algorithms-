package leetcode75;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2,3, 4,5,3,2,5,4);
        printDuplicates(arr);
    }

    private static void printDuplicates( List<Integer> arr) {
        Set<Integer> collect = arr.stream().collect(Collectors
                        .groupingBy(n -> n, Collectors.counting())).
                entrySet().stream().filter(x -> x.getValue() > 1)
                .map(Map.Entry::getKey).collect(Collectors.toSet());

        System.out.println(collect);
    }
}
