package task1;

public class Main {
    public static int exponentiation(int con, int number, int degree) {
        if (degree > 1) {
            number *= con;
            degree--;
            return exponentiation(con, number, degree);
        }
        return number;
    }
}