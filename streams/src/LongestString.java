import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestString {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList("Shri","Shrishail","Shyloo"));
        String s = stringList.stream().max(Comparator.comparing(String::length)).orElse(null);
        System.out.println(s);
    }
}
