package task7;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void findMax() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(5);
        list.add(4);
        list.add(4);
        int m = Main.getSecondMaxNumber(list);
        assertEquals(5, m);
    }

    @Test
    public void findMax2() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(5);
        list.add(4);
        list.add(3);
        int m = Main.getSecondMaxNumber(list);
        assertEquals(5, m);
    }

    @Test
    public void findMax3() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        int m = Main.getSecondMaxNumber(list);
        assertEquals(3, m);
    }

    @Test
    public void findMax4() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        int m = Main.getSecondMaxNumber(list);
        assertEquals(2, m);
    }

    @Test
    public void findMax5() {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        int m = Main.getSecondMaxNumber(list);
        assertEquals(2, m);
    }
}