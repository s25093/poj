package zad2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Kwadrat kwadrat = new Kwadrat(3);
        Trojkat trojkat = new Trojkat(3,4,5, 4);
        Kolo kolo = new Kolo(5.6);
        Figura[] figury = {kwadrat, trojkat, kolo};
        ArrayList<Figura> sorted = new ArrayList<>();

        for (int i = 0; i < figury.length; i++) {
            System.out.println("Pole " + figury[i] + " to " + figury[i].obliczPole() + "\n");
            System.out.println("Obwód " + figury[i] + " to " + figury[i].obliczObwod() + "\n");
        }



    }
}
