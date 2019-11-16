package ru.enikhov.lesson30;

import java.util.LinkedHashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {
        System.out.println("=== Через функции строки ===");
        String str = "total";
        System.out.println("Первый неповторяющийся символ: " + printOne(str));
        str = "teter";
        System.out.println("Первый неповторяющийся символ: " + printOne(str));
        str = "tetee";
        System.out.println("Первый неповторяющийся символ: " + printOne(str));
        System.out.println();
        System.out.println("=== Через HashMap ===");
        str = "total";
        printTwo(str);
        str = "teter";
        printTwo(str);
        str = "totoomomo";
        printTwo(str);

    }

    public static String printOne(String str) {
        char[] chars = str.toCharArray();
        System.out.println("Строка: " + str);
        for (char ch : chars) {
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                return String.valueOf(ch);
            }
        }
        return "не найдено";
    }

    public static void printTwo(String str) {
        System.out.println();
        System.out.println("Строка: " + str);
        char[] chars = str.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                map.put(chars[i], map.get(chars[i]) + 1);
            } else {
                map.put(chars[i], 1);
            }
        }

        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            if (e.getValue() == 1) {
                System.out.println("Первый неповторяющийся символ: " + e.getKey());
                return;
            }
        }
        System.out.println("В строке \"" + str + "\" нет неповторяющихся символов");
    }


}
