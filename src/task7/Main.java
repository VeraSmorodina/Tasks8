package task7;

import java.util.List;
import java.util.Objects;

public class Main {
    private static List<Integer> getSecondMaxNumberRec(List<Integer> numbers, int index, Integer max1, Integer max2) {
        if (numbers.size() == 1)
            return List.of(numbers.get(0));

        if (numbers.size() == 2 && numbers.get(0) >= numbers.get(1))
            return List.of(numbers.get(0), numbers.get(1));
        else if (numbers.size() == 2 && numbers.get(0) < numbers.get(1))
            return List.of(numbers.get(1), numbers.get(0));

        if (index >= numbers.size())
            return List.of(max1, max2);

        if (index == 0 && numbers.get(index) > numbers.get(index + 1)) {
            max1 = numbers.get(index);
            index = index + 2;
        } else if (index == 0 && numbers.get(index) < numbers.get(index + 1)) {
            max1 = numbers.get(index + 1);
            index = index + 2;
        } else if (index == 0 && Objects.equals(numbers.get(index), numbers.get(index + 1))) {
            max1 = numbers.get(index);
            max2 = numbers.get(index + 1);
        }

        if (numbers.get(index) >= max1) {
            max2 = max1;
            max1 = numbers.get(index);
        }
        return getSecondMaxNumberRec(numbers, index + 1, max1, max2);
    }

    public static int getSecondMaxNumber(List<Integer> numbers) {
        List<Integer> result = getSecondMaxNumberRec(numbers, 0, null, null);
        return result.size() > 1 ? result.get(1) : result.get(0);
    }
}