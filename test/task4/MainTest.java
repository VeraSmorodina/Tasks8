package task4;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void isPalindrom() {
        boolean result = Main.isTrue("dfbrte", true);
        assertFalse(result);
    }

    @Test
    public void isPalindrom2() {
        boolean result = Main.isTrue("abba", true);
        assertTrue(result);
    }

    @Test
    public void isPalindrom4() {
        boolean result = Main.isTrue("tenet", true);
        assertTrue(result);
    }

    @Test
    public void isPalindrom3() {
        boolean result = Main.isTrue("abbada", true);
        assertFalse(result);
    }
}