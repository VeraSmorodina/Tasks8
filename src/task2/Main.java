package task2;

public class Main {
    public static int sumDigitsNumber(int number, int result) {
        if (number / 10 == 0)
            return result + number;
        return sumDigitsNumber(number / 10, result + number % 10);
    }
}