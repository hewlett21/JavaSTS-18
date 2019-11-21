package ru.enikhov.lesson33;

import java.util.*;

public class AppMaxCharWithComparator {

    public static void main(String[] args) {
        String str = "Thaitatttt i te maaageea";
        System.out.println("Исходная строка: " + str);
        char[] chars = str.replace(" ", "").toCharArray();
        int count = 0;
        String result = "";
        Map<Character, Integer> map = new HashMap<>();
        addMap(chars, map);
        printSourceMap(map);
        int i = map.size();
        ValueCompare[] resArray = new ValueCompare[i];
        sortMap(map, resArray);
        maxFrequancy(resArray);
    }

    private static void maxFrequancy(ValueCompare[] resArray) {
        System.out.println("Символы с максимальной частотой:");
        int maxValue = 0;
        for (ValueCompare res : resArray) {
            if (maxValue <= res.value) {
                System.out.println(res.key + " - " + res.value);
                maxValue = res.value;
            } else {
                break;
            }
        }
    }

    private static void sortMap(Map<Character, Integer> map, ValueCompare[] resArray) {
        System.out.println("Сортировка:");
        int i = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            resArray[i++] = new ValueCompare(entry.getKey(), entry.getValue());
        }
        Arrays.sort(resArray);
        for (ValueCompare res : resArray) {
            System.out.println(res.key + " - " + res.value);
        }
    }

    private static void addMap(char[] chars, Map<Character, Integer> map) {
        int count;
        for (char ch : chars) {
            if (map.putIfAbsent(ch, 1) != null) {
                count = map.get(ch) + 1;
                map.put(ch, count);
            }
        }
    }

    private static void printSourceMap(Map<Character, Integer> map) {
        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }

    private static class ValueCompare implements Comparable<ValueCompare> {
        public Character key;
        public Integer value;

        public ValueCompare(Character key, Integer value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public int compareTo(ValueCompare vc) {
            if (getClass() == vc.getClass()) {
                return vc.value.intValue() - value.intValue();
            } else {
                return 0;
            }
        }
    }
}
