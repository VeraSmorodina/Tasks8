package task4;

public class Main {
    public static boolean isPalindrom(String s) {
        return isTrue(s, 0);
    }

    private static boolean isTrue(String s, int index) {
        if (index > s.length() / 2) return true;
        if (s.charAt(index) != s.charAt(s.length() - 1 - index)) return false;
        return isTrue(s, index + 1);
    }
}