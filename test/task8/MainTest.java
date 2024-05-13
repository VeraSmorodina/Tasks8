package task8;

import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static task8.Main.getFiles;

public class MainTest {
    @Test
    public void Test1() {
        File file = new File("C:\\Users\\krainyukov.sv\\IdeaProjects\\Tasks8\\src\\directory");
        List<File> list = getFiles(file);
        List<File> res = new ArrayList<>();
        File file1 = new File("C:\\Users\\krainyukov.sv\\IdeaProjects\\Tasks8\\src\\directory\\file11.txt");
        File file2 = new File("C:\\Users\\krainyukov.sv\\IdeaProjects\\Tasks8\\src\\directory\\dir11\\file21");
        File file3 = new File("C:\\Users\\krainyukov.sv\\IdeaProjects\\Tasks8\\src\\directory\\dir11\\file22");
        File file4 = new File("C:\\Users\\krainyukov.sv\\IdeaProjects\\Tasks8\\src\\directory\\dir11\\dir21\\file31");
        res.add(file1);
        res.add(file2);
        res.add(file3);
        res.add(file4);
        assertEquals(res.size(), list.size());
    }
}