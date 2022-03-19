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
        //arrayBasedOnElement();
        System.out.println(greatestCommonDivisor());
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
        arrayList.add(element);
        int a = 0;
        if (element % 2 == 0) {
            for (int i = element + 2; a < length - 1; i+= 2) {
                arrayList.add(i);
                a++;
            }
        } else {
            for (int j = element + 1; a < length - 1; j += 2) {
                arrayList.add(j);
                a++;
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
            System.out.println("\n");
        }
        System.out.println("1. Smallest element: " + smallestArrayElement(arrayList) + "\n" +
                "2. Largest element: " + largestArrayElement(arrayList) + "\n" +
                "3. Sum of all elements: " + sumOfElementsArray(arrayList) + "\n" +
                "4. Average of elements: " + averageOfElementsArray(arrayList) + "\n" +
                "5. Median of elements: " + medianOfElementsArray(arrayList));
    }

    public static int smallestArrayElement(ArrayList<Integer> array) {
        int min = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) < min) {
                min = array.get(i);
            }
        }
        return min;
    }

    public static int largestArrayElement(ArrayList<Integer> array) {
        int max = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) > max) {
                max = array.get(i);
            }
        }
        return max;
    }

    public static int sumOfElementsArray(ArrayList<Integer> array) {
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }
        return sum;
    }

    public static double averageOfElementsArray(ArrayList<Integer> array) {
        return (double) sumOfElementsArray(array) / array.size();
    }

    public static double medianOfElementsArray(ArrayList<Integer> array) {
        double median = 0;
        if (array.size() % 2 == 0) {
            median = (double) ( array.get(array.size() / 2 - 1) + array.get((array.size() / 2)) ) / 2;
        } else {
            int index = array.size() / 2;
            median = array.get(index);
        }
        return median;
    }

    public static int greatestCommonDivisor() {
        int a = 0;
        int b = 0;
        int gcd = 1;
        System.out.println("Enter two numbers:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        if (a > b) {
            for (int i = a; i > 0; i--) {
                if (a % i == 0 && b % i == 0) {
                    gcd = i;
                    break;
                }
            }
        } else {
            for (int i = b; i > 0; i--) {
                if (a % i == 0 && b % i == 0) {
                    gcd = i;
                    break;
                }
            }
        }
        return gcd;
    }

}