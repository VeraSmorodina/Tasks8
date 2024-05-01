package task1;

public class Main {
    public static int exponentiation(int constant, int number, int degree) {
        if (degree > 1) {
            number *= constant;
            degree--;
            return exponentiation(constant, number, degree);
        }
        return number;
    }
}