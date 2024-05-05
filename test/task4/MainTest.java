package task4;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void isPalindrom() {
        boolean result = Main.isPalindrom("dfbrte");
        assertFalse(result);
    }

    @Test
    public void isPalindrom2() {
        boolean result = Main.isPalindrom("abba");
        assertTrue(result);
    }

    @Test
    public void isPalindrom4() {
        boolean result = Main.isPalindrom("tenet");
        assertTrue(result);
    }

    @Test
    public void isPalindrom3() {
        boolean result = Main.isPalindrom("abbada");
        assertFalse(result);
    }
}