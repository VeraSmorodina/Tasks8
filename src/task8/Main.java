package task8;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\krainyukov.sv\\IdeaProjects\\Tasks8\\src\\directory");

        List<File> list = met(file);
        for (File s : list) {
            System.out.println(s.getName());
        }
    }


    public static List met(File file) {
        List<File> dir = new ArrayList<>();
        List<File> listResult = new ArrayList<>();
        if (file.isDirectory())
            dir.add(file);
        else {
            System.out.println("Файл не является директорией");
            return listResult;
        }
        return rec(dir, listResult);
    }

    private static List<File> rec(List<File> dir, List<File> listRes) {
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
        return rec(directories, listRes);
    }


//    public static void main(String[] args) throws IOException {
//        String path = "C:\\Users\\krainyukov.sv\\IdeaProjects\\Tasks8\\src\\directory";
//        List<String> list = rec(path);
//        for (String s : list) {
//            System.out.println(s);
//        }
//    }
//
//    public static List<String> rec(String dir) throws IOException {
//        List<String> list = new ArrayList<>();
//        Stream<Path> files = Files.walk(Path.of(dir));
//        files.forEach((path) -> {
//            if (!path.toFile().isDirectory()) {
//                File my_fil = new File(path.toString());
//                list.add(my_fil.getName());
//            }
//        });
//        files.close();
//        return list;
//    }
}