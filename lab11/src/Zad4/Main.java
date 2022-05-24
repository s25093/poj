package Zad4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        String tekst = "abcdeeeaa";
        System.out.println(skorowidzLiterowy(tekst));
    }

    public static Map<String, Set<Integer>> skorowidzLiterowy(String tekst) {
        String[] litery = tekst.split("");
        Map<String, Set<Integer>> mapaLiter = new HashMap<>();
        for (int i = 0; i < litery.length; i++) {
            Set<Integer> wystapienia = new HashSet<>();
            for (int j = 0; j < litery.length; j++) {
                if (litery[i].equals(litery[j])) {
                    wystapienia.add(j);
                }
            }
            mapaLiter.put(litery[i].toLowerCase(), wystapienia);
            }

            return mapaLiter;
        }
    }

