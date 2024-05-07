package task6;

import java.util.List;

public class Main {
    public static void printOddIndexes(List<Integer> numbers) {
        printOddIndex(numbers, 0);
    }

    private static void printOddIndex(List<Integer> numbers, int index) {
        if (index >= numbers.size()) return;
        System.out.println(numbers.get(index));
        printOddIndex(numbers, index + 2);
    }
}