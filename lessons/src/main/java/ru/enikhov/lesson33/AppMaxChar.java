package ru.enikhov.lesson33;

import java.util.HashMap;
import java.util.Map;

public class AppMaxChar {

    public static void main(String[] args) {
        String s = "Thit i te maaagee";
        System.out.print("Исходная строка: " + s);
        //пробелы считать не будем
        char[] chars = s.replace(" ", "").toCharArray();
        int max = 0;
        int count = 1;
        String result = "";
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : chars) {
            if (map.putIfAbsent(ch, 1) != null) {
                count = map.get(ch) + 1;
                map.put(ch, count);
                if (count > max) {
                    max = count;
                    result = String.valueOf(ch);
                } else if (count == max) {
                    result = String.join(", ", String.valueOf(ch), result).trim();
                }
            }
        }

        System.out.println("\nРезультат:");
        System.out.println(result + ": " + max);
    }

}
