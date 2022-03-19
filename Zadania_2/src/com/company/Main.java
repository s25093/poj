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
        Kwadrat kw = new Kwadrat(5);
        System.out.println(kw.obwod(kw.bok));
        System.out.println(kw.pole(kw.bok));
        Punkt p1 = new Punkt(-15, 40.2);
        Punkt p2 = new Punkt();
        System.out.println(p1.distance(p1.x, p1.y));
        System.out.println(p1.distanceObject(p1));
        System.out.println(p2.distance(p2.x, p2.y));
        System.out.println(p2.distanceObject(p2));
        MyCircle circle = new MyCircle(4.5);
        System.out.println(circle.circumference(circle.radius));
        System.out.println(circle.area(circle.radius));
        System.out.println(circle.diameter(circle.radius));
        Wiatrak w = new Wiatrak(Wiatrak.SLOW, true, 5, "RED");
        System.out.println(w.informacje(w));
    }

}
