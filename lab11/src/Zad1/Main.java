package Zad1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<Integer>(List.of(1, 2, 3, 3, 4, 5, 6, 4, 5, 6, 1, 2, 8));
        listDuplicates(ints);
    }

    public static void listDuplicates(List list) {
        List newList = new ArrayList();
        List duplicateList = new ArrayList();
        boolean check = false;
        for (int i = 0; i < list.size(); i++) {
            check = false;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    check = true;
                    duplicateList.addAll(List.of(list.get(i), list.get(j)));
                }
            }
            if (!check) {
                newList.add(list.get(i));
            }
        }
        Collections.sort(newList);
        Collections.sort(duplicateList);
        System.out.println(newList);
        System.out.println(duplicateList);
    }
}
