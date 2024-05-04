package task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        System.out.println(get(array, 0, 0));
    }

    public static int get(ArrayList<Integer> array, int result, int index) {
        if (array.isEmpty())
            return result;
        ArrayList<Integer> newList = new ArrayList<>(array.subList(index, array.size()));
//        System.out.println("+++");
//        for (int i = 0; i < newList.size(); i++) {
//            System.out.println(newList.get(i));
//        }
        return get(newList, result + 1, index + 1);
    }
}