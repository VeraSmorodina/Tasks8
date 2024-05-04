package task3;

import java.util.ArrayList;

public class Main {
    public static int getLengthList(ArrayList<Integer> array, int result) {
        if (array.isEmpty()) return result;
        ArrayList<Integer> newList = new ArrayList<>(array.subList(1, array.size()));
        return getLengthList(newList, result + 1);
    }
}