package Zad2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Lotto();
    }

    public static void Lotto() {
        int winner = (int)(Math.random() * 50 + 1);
        Set<Integer> numbers = new HashSet<>();
        for (int i = 0; i < 7; i++) {
            int n = (int)(Math.random() * 50 + 1);
            numbers.add(n);
        }
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count != 6) {
            System.out.println("Pick a number from 1 to 49: ");
            try {
                int n = scanner.nextInt();
                if (n < 1 || n > 49) {
                    System.out.println("Your number is out of range.");
                } else {
                    count++;
                    numbers.add(n);
                }
            } catch (InputMismatchException e) {
                System.out.println("Please provide an integer.");
            }
        }

        System.out.println("Your set: \n");
        System.out.println(numbers);

        if (numbers.contains(winner)) {
            System.out.println("\nYou've won! The winning number is: " + winner);
        } else {
            System.out.println("\nUnfortunately, you did not win.");
        }
    }

}
