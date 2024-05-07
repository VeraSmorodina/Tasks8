package task6;

import java.util.List;

public class Main {
    public static void printOddIndex(List<Integer> numbers) {
        printOddIndexs(numbers, 0);
    }

    private static void printOddIndexs(List<Integer> numbers, int index) {
        if (index >= numbers.size()) return;
        System.out.println(numbers.get(index));
        printOddIndexs(numbers, index + 2);
    }
}