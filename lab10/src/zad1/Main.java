package zad1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        date();
    }

    public static void date() {
        System.out.println("Enter a format: \n");
        Scanner scanner = new Scanner(System.in);
        LocalDate date = LocalDate.now();
        String dateFormat = scanner.nextLine();
        DateTimeFormatter formatter = null;
        try {
            formatter = DateTimeFormatter.ofPattern(dateFormat);
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong format.");
            date();
        }
        assert formatter != null;
        String dateFormatted = date.format(formatter);
        System.out.println(dateFormatted);
    }
}
