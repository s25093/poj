package com.company;

import java.util.ArrayList;

public class ArrayAdd {

        public static ArrayList<Integer> sumOfArrays(ArrayList<Integer> a,
                                                     ArrayList<Integer> b) {
            if (a.size() != b.size()) {
                System.out.println("Diff sizes");
                return new ArrayList<Integer>();
            }
            ArrayList<Integer> sumArray = new ArrayList<>();

            for (int i = 0; i < a.size(); i++) {
                sumArray.add(a.get(i) + b.get(i));
            }
            return sumArray;
        }
}

