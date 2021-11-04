package lesson5;

import java.util.*;

/**
 * Поменять ключи и значения в Map. Напишите метод, который получает на вход Map<K, V> и возвращает Map,
 * где ключи и значения поменяны местами. Если карта состоит из 6 пар ключ-значение,
 * то итоговая карта должна состоять из 6 пар ключ-значение.
 */
public class Lesson5Task3 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "a");
        map.put("2", "a");
        map.put("3", "b");
        map.put("4", "b");
        map.put("5", "b");
        map.put("6", "b");
        System.out.println("before Reversing \n" + map);
        System.out.println("After Reversing \n " + replaceKeyValue(map));
    }

    public static Map<String, String> replaceKeyValue(Map<String, String> map) {
        Map<String, String> newMap = new HashMap<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String oldVal = entry.getValue();
            String oldKey = entry.getKey();
            while (newMap.containsKey(oldVal)) {
                oldVal += "'";
            }
            newMap.put(oldVal, oldKey);

        }
        return newMap;
    }
}