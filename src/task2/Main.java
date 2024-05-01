package task2;

public class Main {
    public static int sumDigitsNumber(int number, int result) {
        if (number / 10 > 0) {
            result += number % 10;
            number = number / 10;
            return sumDigitsNumber(number, result);
        }
        return result + number;
    }
}