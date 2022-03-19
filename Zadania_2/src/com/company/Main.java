package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(4);
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(2);
        arr1.add(4);
        arr1.add(5);
        System.out.println(ArrayAdd.sumOfArrays(arr, arr1));
    }

}
