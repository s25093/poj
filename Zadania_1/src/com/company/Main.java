package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double eq = ((9.5*4.5)-(2.5*3))/((45.5-3.5));
        //System.out.println(eq);
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter a celsius value: ");
        //double celsius = scanner.nextDouble();
        //scanner.close();
        //System.out.println(conversion(celsius) + " Fahrenheit");
        //milesToKmTable();
        //System.out.println(dayOfTheWeek());
        //createArray();
    }

    public static double conversion(double celsius) {
        return ((1.8)*celsius)+32;
    }

    public static double milesToKm(double miles) {
        return miles * 1.609344;
    }

    public static void milesToKmTable() {
        System.out.println("Miles  Kilometers");
        for (int miles = 1; miles <= 10; miles++) {
            String result = String.format("%.3f", milesToKm(miles));
            System.out.println(miles + "      " + result);
        }
    }

    public static String dayOfTheWeek() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value from 1 to 7");
        int number = sc.nextInt();
        sc.close();
        switch (number) {
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default: return "There is no " + number + "th day of the week.";
        }
    }

    public static void createArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an array length: ");
        int length = sc.nextInt();
        ArrayList<String> array = new ArrayList<String>(length);
        System.out.println("Enter " + length + " values");
        for (int i = 0; i <= length; i++) {
            String element = sc.nextLine();
            array.add(element);
        }
        sc.close();
        String[] userArray = new String[array.size()];
        userArray = array.toArray(userArray);
        for(String e : userArray) {
            System.out.println(e);
        }
    }


    public static void arrayBasedOnElement() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an array length: ");
        int length = sc.nextInt();
        System.out.println("Enter the first element: ");
        int element = sc.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<Integer>(length);
        for (int i = element; i <= length; i += 2) {
            arrayList.add(element);
        }
    }
}