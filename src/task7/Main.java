package task7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        getMax(arrayList);


//        Integer max1 = null;
//        Integer max2 = null;
//        for (int i = 1; i < arrayList.size(); i++) {
//            if (i == 1 && arrayList.get(i - 1) > arrayList.get(i)) {
//                max1 = arrayList.get(i - 1);
//            } else if (i == 1 && arrayList.get(i - 1) < arrayList.get(i)) {
//                max1 = arrayList.get(i);
//            }
//            if (i != 1 && arrayList.get(i) > max1) {
//                max2 = max1;
//                max1 = arrayList.get(i);
//            }
//        }
//        System.out.println("Максимальное 2-ое " + max2);
    }


    public static List<Integer> sortList(List<Integer> numbers, int index, Integer max1, Integer max2) {
        if (numbers.size() == 1)
            return List.of(numbers.get(0));

        if (numbers.size() == 2 && numbers.get(0) > numbers.get(1))
            return List.of(numbers.get(0), numbers.get(1));
        else if (numbers.size() == 2 && numbers.get(0) < numbers.get(1))
            return List.of(numbers.get(1), numbers.get(0));

        if (index >= numbers.size())
            return List.of(max1, max2);

        if (index == 0 && numbers.get(index) > numbers.get(index + 1)) {
            max1 = numbers.get(index);
            index = index + 2;
        } else if (index == 0 && numbers.get(index) < numbers.get(index + 1)) {
            max1 = numbers.get(index + 1);
            index = index + 2;
        }

        if (numbers.get(index) > max1) {
            max2 = max1;
            max1 = numbers.get(index);
        }
        return sortList(numbers, index + 1, max1, max2);
    }

    public static int getMax(List<Integer> numbers) {
        List<Integer> res = sortList(numbers, 0, null, null);
        return res.get(1);
    }
}
