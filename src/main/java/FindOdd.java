import java.util.ArrayList;
import java.util.List;

public class FindOdd {
    public static int findIt(int[] numbers) {
        List<Integer> numberList = new ArrayList<>();
        for (int number : numbers) {
            if(numberList.contains(number)) {
                numberList.remove(numberList.indexOf(number));
            } else {
                numberList.add(number);
            }
        }
        return numberList.get(0);
    }
}
