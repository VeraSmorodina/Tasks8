package task3;

import java.util.List;

public class Main {
    private static int getLengthListRec(List<Integer> array, int result) {
        if (array.isEmpty()) return result;
        array.remove(0);
        return getLengthListRec(array, result + 1);
    }

    public static int getLengthList(List<Integer> array) {
        return getLengthListRec(array, 0);
    }
}