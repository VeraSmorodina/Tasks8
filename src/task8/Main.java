package task8;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<File> getFiles(File file) {
        List<File> dir = new ArrayList<>();
        List<File> listResult = new ArrayList<>();
        if (file.isDirectory())
            dir.add(file);
        return getFilesRec(dir, listResult);
    }

    private static List<File> getFilesRec(List<File> dir, List<File> listRes) {
        if (dir.isEmpty()) return listRes;
        List<File> directories = new ArrayList<>();
        for (File file : dir) {
            File[] files = file.listFiles();
            for (File file1 : files) {
                if (!file1.isDirectory()) {
                    listRes.add(file1);
                    continue;
                }
                directories.add(file1);
            }
        }
        return getFilesRec(directories, listRes);
    }
}