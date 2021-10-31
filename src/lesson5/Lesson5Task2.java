package lesson5;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

/**
 * Постройте частотный словарь букв русского (или английского) алфавита.
 * Т.е. Сколько раз каждая бука алфавита повторяется в введенной строке.
 */
public class Lesson5Task2 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter something to count letters");
        String str = scan.nextLine();
        System.out.println(countLetters(str));
    }

    public static Map<Character, Integer> countLetters(String string) {
        String tmpString = string.replaceAll("[^A-Za-zА-Яа-я]", "").toUpperCase();
        Map<Character, Integer> numberOfLetters = new HashMap<>();
        int lettersCounter;
        for (int i = 0; i < tmpString.length(); i++) {
            if (tmpString.charAt(i) != '\u0020') {
                if (numberOfLetters.containsKey(tmpString.charAt(i))) {
                    lettersCounter = numberOfLetters.get(tmpString.charAt(i)) + 1;
                    numberOfLetters.put(tmpString.charAt(i), lettersCounter);
                } else {
                    numberOfLetters.put(tmpString.charAt(i), 1);
                }
            }
        }
        return numberOfLetters;
    }
}