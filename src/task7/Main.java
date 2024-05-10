package task7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static int getSecondMaxNumber(List<Integer> numbers) {
        if (numbers.size() == 1) return numbers.get(0);
        List<Integer> result = new ArrayList<>();
        if (numbers.get(0) >= numbers.get(1))
            result = getSecondMaxNumberRec(numbers, 2, numbers.get(0), numbers.get(1));
        else if (numbers.get(0) < numbers.get(1))
            result = getSecondMaxNumberRec(numbers, 2, numbers.get(1), numbers.get(0));
        return result.get(1);
    }

    private static List<Integer> getSecondMaxNumberRec(List<Integer> numbers, int index, Integer max1, Integer max2) {
        if (index >= numbers.size())
            return List.of(max1, max2);
        if (numbers.get(index) >= max1) {
            max2 = max1;
            max1 = numbers.get(index);
        }
        return getSecondMaxNumberRec(numbers, index + 1, max1, max2);
    }
}