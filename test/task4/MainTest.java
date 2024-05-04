package task4;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void isPalindrom() {
        boolean result = Main.isTrue("dfbrte", 0, true);
        assertFalse(result);
    }

    @Test
    public void isPalindrom2() {
        boolean result = Main.isTrue("abba", 0, true);
        assertTrue(result);
    }

    @Test
    public void isPalindrom4() {
        boolean result = Main.isTrue("tenet", 0, true);
        assertTrue(result);
    }

    @Test
    public void isPalindrom3() {
        boolean result = Main.isTrue("abbada", 0, true);
        assertFalse(result);
    }
}