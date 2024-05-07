package task5;

import java.util.List;

public class Main {
    public static void printOddValues(List<Integer> numbers) {
        printOdd(numbers, 0);
    }

    private static void printOdd(List<Integer> numbers, int index) {
        if (index >= numbers.size()) return;
        if (numbers.get(index) % 2 == 0) System.out.println(numbers.get(index));
        printOdd(numbers, index + 1);
    }
}