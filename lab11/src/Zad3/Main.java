package Zad3;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String tekst = "Pies kot pies pies pies";
        System.out.println(zliczWystapieniaSlow(tekst));

    }

    public static Map<String, Integer> zliczWystapieniaSlow(String tekst) {
        String[] slowa = tekst.split(" ");
        Map<String, Integer> mapaSlow = new HashMap<>();
        Integer wystapienia = 0;
        for (String slowo:slowa) {
            if (mapaSlow.containsKey(slowo.toLowerCase())) {
                wystapienia = mapaSlow.get(slowo.toLowerCase());
                mapaSlow.put(slowo.toLowerCase(), ++wystapienia);
            } else {
                mapaSlow.put(slowo.toLowerCase(), 1);
            }
        }
        return mapaSlow;
    }
}
