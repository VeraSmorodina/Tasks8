package task4;

public class Main {
    public static boolean isTrue(String s, boolean b) {
        if (!b) return false;
        if (s.length() <= 1) return true;
//        String s1 = s.substring(0, 1);
//        String s2 = s.substring(s.length() - 1);
//        String s3 = s.substring(1, s.length() - 1);
        return isTrue(s.substring(1, s.length() - 1), s.substring(0, 1).equals(s.substring(s.length() - 1)));
    }
}