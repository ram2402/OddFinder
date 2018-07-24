import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FindOdd {
    public static int findIt(int[] numbers) {

        Map<Integer, Long> occurances = Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.groupingBy(Integer::intValue,
                        Collectors.counting()));

        Set<Map.Entry<Integer, Long>> entries = occurances.entrySet();
        for (Map.Entry<Integer, Long> entry : entries) {
            if (entry.getValue() % 2 == 1) {
                return entry.getKey();
            }
        }

        return 0;
    }
}
