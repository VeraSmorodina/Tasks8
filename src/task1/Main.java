package task1;

public class Main {
    public static int exponentiation(int constant, int number, int degree) {
        if (degree == 1)
            return number;
        return exponentiation(constant, number * constant, degree - 1);
    }
}