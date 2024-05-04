package task3;

import java.util.ArrayList;

public class Main {
    public static int getLengthList(ArrayList<Integer> array, int result) {
        if (array.isEmpty()) return result;
        array.remove(0);
        return getLengthList(array, result + 1);
    }
}