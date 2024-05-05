package task3;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void pop1() {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        int result = Main.getLengthList(array);
        assertEquals(3, result);
    }

    @Test
    public void pop2() {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(7);
        int result = Main.getLengthList(array);
        assertEquals(7, result);
    }
}