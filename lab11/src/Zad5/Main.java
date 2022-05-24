package Zad5;

import java.util.HashMap;
import java.util.Map;

public class Main {

    static String[] samogloski = {"a", "o", "u", "e", "i", "y"};
    static String[] spolgloski = {"b", "c", "d", "f", "g", "h", "i", "j", "k", "l", "m", "n"
    , "p", "r", "s", "t", "w", "z"};

    public static void main(String[] args) {
        String tekst = "Kot pies drzewo";
        System.out.println(zliczGloski(tekst));
    }

    public static Map<String, Integer> zliczGloski(String tekst) {
        String[] litery = tekst.split("");
        Map<String, Integer> gloski = new HashMap<>();
        Integer samogloskiCount = 0;
        Integer spolgloskiCount = 0;
        for (int i = 0; i < litery.length; i++) {
            for (int j = 0; j < samogloski.length; j++) {
                if (litery[i].equals(samogloski[j])) {
                    samogloskiCount++;
                }
            }
            for (int j = 0; j < spolgloski.length; j++) {
                if (litery[i].equals(spolgloski[j])) {
                    spolgloskiCount++;
                }
            }
        }
        gloski.put("Samogłoski", samogloskiCount);
        gloski.put("Spółgłoski", spolgloskiCount);
        return gloski;
    }
}
