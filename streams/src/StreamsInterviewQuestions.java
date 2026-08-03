import java.util.Arrays;
import java.util.List;

public class StreamsInterviewQuestions {

    public static void main(String[] args) {
        List<Integer> arrayList = Arrays.asList(1,2,3,4,7,3,8);
        List<Integer> list = arrayList.stream().skip(3).toList();
        System.out.println(list);
    }
}
