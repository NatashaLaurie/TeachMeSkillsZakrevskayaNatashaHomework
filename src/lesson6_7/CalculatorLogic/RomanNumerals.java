package lesson6_7.CalculatorLogic;

import lesson6_7.Exceptions.IncorrectRomanNumeralException;

import java.util.*;

public class RomanNumerals {
    private final static TreeMap<Integer, String> romanNumerals = new TreeMap<>();

    static {
        romanNumerals.put(1, "I");
        romanNumerals.put(4, "IV");
        romanNumerals.put(5, "V");
        romanNumerals.put(9, "IX");
        romanNumerals.put(10, "X");
        romanNumerals.put(40, "XL");
        romanNumerals.put(50, "L");
        romanNumerals.put(90, "XC");
        romanNumerals.put(100, "C");
        romanNumerals.put(400, "CD");
        romanNumerals.put(500, "D");
        romanNumerals.put(900, "CM");
        romanNumerals.put(1000, "M");
    }

    static String toRomanNumber(int number) throws Exception {
        if (number < 0) throw new Exception("Roman numeral doesn't exist!");
        int i = romanNumerals.floorKey(number);
        if (number == i) {
            return romanNumerals.get(number);
        }
        return romanNumerals.get(i) + toRomanNumber(number - i);
    }

    private static int getArabicNumber(char letter) {
        int result = -1;
        for (Map.Entry<Integer, String> entry : romanNumerals.entrySet())
            if (entry.getValue().equals(String.valueOf(letter))) {
                result = entry.getKey();
            }
        return result;
    }

    static int toArabicNumber(String roman) throws Exception {
        int result = 0;
        int i = 0;
        while (i < roman.length()) {
            char letter = roman.toUpperCase().charAt(i);
            int num = getArabicNumber(letter);

            if (num < 0) throw new IncorrectRomanNumeralException();
            else {
                i++;
                if (i == roman.length()) {
                    result += num;
                } else {
                    int nextNum = getArabicNumber(roman.toUpperCase().charAt(i));
                    if (nextNum > num) {
                        result += (nextNum - num);
                        i++;
                    } else result += num;
                }
            }
        }
        return result;
    }
}