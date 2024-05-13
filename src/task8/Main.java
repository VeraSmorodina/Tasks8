package task8;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<File> getFiles(File file) {
        if (file.isFile()) return List.of(file);
        List<File> listResult = new ArrayList<>();
        File[] files = file.listFiles();
        for (File file1 : files)
            listResult.addAll(getFiles(file1));
        return listResult;
    }
}