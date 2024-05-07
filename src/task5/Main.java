package task5;

import java.util.List;

public class Main {
    public static void printOddValues(List<Integer> numbers) {
        if (numbers.isEmpty()) return;
        if (numbers.get(0) % 2 == 0) System.out.println(numbers.get(0));
        numbers.remove(0);
        printOddValues(numbers);
    }
}