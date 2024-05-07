package task5;

import java.util.List;

public class Main {
    public static void printOdd(List<Integer> numbers) {
        printOddValues(numbers, 0);
    }

    private static void printOddValues(List<Integer> numbers, int index) {
        if (index >= numbers.size()) return;
        if (numbers.get(index) % 2 == 0) System.out.println(numbers.get(index));
        printOddValues(numbers, index + 1);
    }
}