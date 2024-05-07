package task6;

import java.util.List;

public class Main {
    public static void printOddIndexs(List<Integer> numbers) {
        if (numbers.isEmpty()) return;
        System.out.println(numbers.get(0));
        if (!numbers.isEmpty()) numbers.remove(0);
        if (!numbers.isEmpty()) numbers.remove(0);
        printOddIndexs(numbers);
    }
}