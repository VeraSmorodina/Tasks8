package task1;

public class Main {
    public static int exponentiation(int constant, int number, int degree) {
        return degree == 1 ? number : exponentiation(constant, number * constant, degree - 1);
    }
}