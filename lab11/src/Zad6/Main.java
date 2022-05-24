package Zad6;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        System.out.println(sum());
    }

    public static int sum() {
        Set<Integer> set = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count != 10) {
            System.out.println("Provide a number: ");
            try {
                set.add(scanner.nextInt());
                count++;
            } catch (InputMismatchException e) {
                System.out.println("Plese provide an integer.");
            }
        }
        int sum = 0;
        for (int i = 0; i < set.size(); i++) {
            sum += set.iterator().next();
        }

        return sum;
    }
}
